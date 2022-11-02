Feature: Transaction
  As a user
  I want to do transaction
  So I can use my money to buy the product

  Scenario: Pay Products as logged in user
    Given I am logged in
    And I am in my filled cart page
    When I click pay button
    Then I get redirected to my transaction list

  Scenario: Pay Products as anon user
    Given I am in my filled cart page
    When I click pay button
    Then I get redirected to login page

  Scenario: View Transaction List
    Given I am logged in
    When I click my profile
    And I click transaction button
    Then I get my transaction list