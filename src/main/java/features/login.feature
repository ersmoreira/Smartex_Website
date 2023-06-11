Feature: Login functionality

  Scenario: Successful login
    Given I am on the login page
    When I enter valid credentials
    Then I should be logged in

  Scenario: Invalid login
    Given I am on the login page
    When I enter invalid credentials
    Then I should see an error message

  Scenario: Blank login
    Given I am on the login page
    When I leave the login credentials blank
    Then I should see an error message
