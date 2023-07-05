Feature: US001 Subsidia facebook icon Test


  Scenario: TC001 The user verifies that the Facebook icon redirects to the correct page.

    Given Navigate to the "subsidiaUrl" website.
    And    The user clicks the ok button on the cookies that appear.
    When Go to the Contact section of the website.
    And Click on the Facebook icon.
    And Verify that you were redirected to the Facebook page
    Then The user closes the window.
