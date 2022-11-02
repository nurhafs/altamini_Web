Feature: Login
  As a User
  I want to login
  So I can use the website

  Scenario: Show Login Page
    When I open login url
    Then I will go to login page

  Scenario Outline: Login with username and password
    Given I am in login page
    When I input <email> email
    And I input <password> password
    And I click login button
    Then I get <result> as result

    Examples:
    | email | password | result |
    | "thaur@mail.com" | "thaurn" | "logged in" |
    | "thaur@mail.com" | "pinto" | "error" |
    | "user@mail.com"  | ""  | "error"     |
    | "" | "nxxxae" | "error" |
    | "naevis@mail.com" | "pass" | "error" |
    | "" | "" | "error" |