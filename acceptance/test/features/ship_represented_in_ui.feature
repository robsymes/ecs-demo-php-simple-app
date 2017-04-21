Feature: A ship is represented in the UI

  Scenario:
    Given the database contains a yellow ship at 360, 160
    When the UI has been updated
    Then the UI contains a yellow ship at 360, 160
