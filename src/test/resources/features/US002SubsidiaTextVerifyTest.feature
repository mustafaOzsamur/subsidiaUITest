Feature: US001 text validation test.

@smoke
  Scenario: TC002 User confirms that "Textile Leidenschaft trifft technisches Know-how" appears

    Given Navigate to the "subsidiaUrl" website.
    When  click on the Team button.
    Then verify that the text "Textile Leidenschaft trifft technisches Know-how" is visible
    Then The user closes the window.