Feature: US003 Page Redirect Test
@smoke
  Scenario: TC003 When the user clicks on the "Wann war das" link, they should be directed to the correct page

    Given Navigate to the "subsidiaUrl" website.
    When  click on the Team button.
    And click on the Wann war das link under Roger Zwingli's profile.
    And verify that the page www.t-online.de is open
    Then The user closes the window.