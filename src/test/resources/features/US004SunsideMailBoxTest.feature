Feature: US004 text validation and mailbox testing
@wip
  Scenario: TC004 User should verify that text appears and mailbox opens
    Given Navigate to the "subsidiaUrl" website.
    When  click on the Team button.
    And the user clicks on the offene stellen button
    And then the user clicks on the stellenprofil lesen button
    Then the user should confirm the visibility of the text Supporter
    And  The user clicks the ok button on the cookies that appear.
    And the user clicks on the email address link diego@subsidia.ch
    Then the user should confirm that the mail box is opened
    Then The user closes the window.