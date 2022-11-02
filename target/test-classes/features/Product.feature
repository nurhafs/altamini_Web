Feature: Manage Product
  As a user
  I want to manage products
  So that I can browse and buy them

  Scenario: Show Product List
    When I open product url
    Then I get product list

  Scenario: Select Category
    Given I open mainpage url
    When I click select category
    And I click one of the category
    Then I can see products based on chosen category

  Scenario: View Product Detail
    Given I open product url
    When I click detail on one of the products
    Then I get the product details

  Scenario: Add Product to Cart
    Given I open mainpage url
    When I click beli in one product
    Then Product added to cart
