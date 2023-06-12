Feature: Login functionality

  Scenario: Successful login
    Given I am on the login page
    When I enter valid username and password
    Then I should be logged in successfully
    And I close the browser

  Scenario: Invalid login
    Given I am on the login page
    When I enter invalid username and password
    Then I should see an error message
    And I close the browser

  Scenario: Blank login
    Given I am on the login page
    When I enter empty username and password
    Then I should see an error message
    And I close the browser
