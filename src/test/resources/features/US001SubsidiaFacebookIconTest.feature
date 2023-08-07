@smoke
Feature: US001 As a User I would like to see that the buttons and tabs on the Web page are functional.

  Background:
    Given Navigate to the "subsidiaUrl" website.


  Scenario: TC_001 The user verifies that the Facebook icon redirects to the correct page.

    And    The user clicks the ok button on the cookies that appear.
    When Go to the Contact section of the website.
    And Click on the Facebook icon.
    And Verify that you were redirected to the Facebook page
    Then The user closes the window.

  Scenario: TC_002 User confirms that "Textile Leidenschaft trifft technisches Know-how" appears

    When  click on the Team button.
    Then verify that the text "Textile Leidenschaft trifft technisches Know-how" is visible
    Then The user closes the window.

  Scenario: TC_003 When the user clicks on the "Wann war das" link, they should be directed to the correct page

    When  click on the Team button.
    And click on the Wann war das link under Roger Zwingli's profile.
    And verify that the page www.t-online.de is open
    Then The user closes the window.

  Scenario: TC_004 User should verify that text appears and mailbox opens

    When  click on the Team button.
    And the user clicks on the offene stellen button
    And then the user clicks on the stellenprofil lesen button
    Then the user should confirm the visibility of the text Supporter
    And  The user clicks the ok button on the cookies that appear.
    And the user clicks on the email address link diego@subsidia.ch
    Then the user should confirm that the mail box is opened
    Then The user closes the window.

  Scenario: TC_005 it should be verified that the desired buttons are directed to the correct page when clicked

    Then clicks the product button.
    And clicks the startsaite link.
    And confirms that he is redirected to the home page.
    And clicks the product anschauen link.
    And confirms that he has been redirected to the relevant page.
    Then The user closes the window.