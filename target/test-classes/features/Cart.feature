@Cart
Feature: Manage Cart
  As a user
  I want to manage my Cart
  So I can checkout products I actually want

  Scenario: View Cart Detail (filled)
    Given I open homepage url
    When I buy product
    And I click cart logo
    Then I see my cart filled with products

  Scenario: View Cart Detail (empty)
    Given I open homepage url
    When I click cart logo
    Then I see my cart empty

  Scenario: Delete Product From Cart
    Given I open homepage url
    And I buy one of the products
    When I open cart page
    And I click minus logo
    Then The product is deleted from my cart


  Scenario: Add Product Quantity
    Given I open homepage url
    And I buy one of the products
    When I open cart page
    And I click plus logo
    Then The quantity of product is added

  Scenario: Reduce Product Quantity
    Given I open homepage url
    And I buy two of the products
    When I open cart page
    And I click minus logo
    Then The quantity of product is reduced