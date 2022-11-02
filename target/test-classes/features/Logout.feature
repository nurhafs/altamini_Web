Feature: Logout
  As a user
  I want to logout
  So I can stop checking out my cart

  Scenario: Logout
    Given I am logged in to the website
    When I click user logo
    And I click logout button
    Then I am back to login page
