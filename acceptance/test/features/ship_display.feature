Feature: Ship display

  Scenario: A ship in the database is displayed in the UI
    Given a yellow ship at 160, 160 in the database
    When the UI has updated
    Then there is a yellow ship at 160, 160 in the UI
