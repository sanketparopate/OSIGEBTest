

Feature: Login into OSI portal

  Scenario: Login into OSI portal
    Given I am on the Osi home page
    When I click on signin with google
    And  I enter valid credentials
    Then I am logged in
    