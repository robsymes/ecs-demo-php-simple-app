Feature: Reset to scenario

  Scenario: Four tribe battle

    Given the four tribe battle scenario is reset to in the admin console
    When things have had a chance to update
    Then there are four ships of each tribe displayed in the Game UI
