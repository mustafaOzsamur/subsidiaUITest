package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SubsidiaPage {

    public SubsidiaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//a[text()='Ok!']")
  public   WebElement cookies;

@FindBy(xpath = "(//img[@alt='icon_facebook'])[1]")
public WebElement facebookIconButton;

@FindBy(xpath = "//a[text()='Team']")
    public WebElement teamButtonElement;

@FindBy(xpath = "//h1[@class='centre-align']")
    public WebElement textElement;

@FindBy(xpath = "//a[text()='Wann war das?']")
    public WebElement wannWarDasLinkElement;











}
