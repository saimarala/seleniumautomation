@SmokeScenario
Feature: feature to test login functionality
  @smokeTest
  Scenario: check login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    And click on login button
    Then user is naviagte to the home page


