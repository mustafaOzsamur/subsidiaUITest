package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.SubsidiaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;


public class SubsidiaStepdefinitions {

public static String firstWindowWH;
public static String secondWindow;


    SubsidiaPage subsidiaPage=new SubsidiaPage();
    SoftAssert softAssert=new SoftAssert();
    Actions actions=new Actions(Driver.getDriver());

    @Given("Navigate to the {string} website.")
    public void navigate_to_the_website(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("subsidiaUrl"));
        firstWindowWH=Driver.getDriver().getWindowHandle();
    }



    @Given("The user clicks the ok button on the cookies that appear.")
    public void the_user_clicks_the_ok_button_on_the_cookies_that_appear() {

        subsidiaPage.cookies.click();
    }



    @When("Go to the Contact section of the website.")
    public void go_to_the_contact_section_of_the_website() {
        Actions actions = new Actions(Driver.getDriver());
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
    }



    @Then("Click on the Facebook icon.")
    public void click_on_the_facebook_icon() {
        subsidiaPage.facebookIconButton.click();
    }



    @And("Verify that you were redirected to the Facebook page")
    public void verifyThatYouWereRedirectedToTheFacebookPage() {
        Set<String>allWindowsWH=Driver.getDriver().getWindowHandles();

        for (String eachWH:allWindowsWH) {
            if (!eachWH.equals(firstWindowWH)){
                secondWindow=eachWH;
            }
        }
        Driver.getDriver().switchTo().window(secondWindow);

        String title=Driver.getDriver().getTitle();
        softAssert.assertTrue(title.contains("facebook"),"page title does not contain facebook");
        softAssert.assertAll();
        Driver.closeDriver();
    }



    @Then("The user closes the window.")
    public void the_user_closes_the_window() {
        Driver.getDriver().switchTo().window(firstWindowWH);
        Driver.quitDriver();
    }


    @When("click on the Team button.")
    public void click_on_the_team_button() {
    subsidiaPage.teamButtonElement.click();

    }
    @Then("verify that the text {string} is visible")
    public void verify_that_the_text_is_visible(String string) {
        softAssert.assertTrue(subsidiaPage.textElement.isDisplayed());
        String expectedText="Textile Leidenschaft trifft technisches Know-how";
        softAssert.assertEquals(subsidiaPage.textElement.getText(),expectedText);
    }



    @When("click on the Wann war das link under Roger Zwingli's profile.")
    public void click_on_the_wann_war_das_link_under_roger_zwingli_s_profile() {
    actions.moveToElement(subsidiaPage.wannWarDasLinkElement).click().perform();

        ReusableMethods.bekle(5);
    }


    @Then("verify that the page www.t-online.de is open")
    public void verifyThatThePageWwwTOnlineDeIsOpen() {
        Set<String>allWindowsWH=Driver.getDriver().getWindowHandles();

        for (String eachWH:allWindowsWH) {
            if (!eachWH.equals(firstWindowWH)){
                secondWindow=eachWH;
            }
        }

        Driver.getDriver().switchTo().window(secondWindow);
        String secondWindowTitle=Driver.getDriver().getTitle();
        softAssert.assertTrue(secondWindowTitle.contains("online"));
        softAssert.assertAll();
    }
}