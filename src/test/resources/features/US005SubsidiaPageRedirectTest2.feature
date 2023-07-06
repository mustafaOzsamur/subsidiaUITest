Feature: US005 Page Redirect Test

  @wip
  Scenario: TC005 it should be verified that the desired buttons are directed to the correct page when clicked

    Given Navigate to the "subsidiaUrl" website.
    Then clicks the product button.
    And clicks the startsaite link.
    And confirms that he is redirected to the home page.
    And clicks the product anschauen link.
    Then confirms that he has been redirected to the relevant page.