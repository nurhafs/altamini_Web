Feature: Login
  As a User
  I want to login
  So I can use the website

  Scenario: Show Login Page
    When I open login url
    Then I will go to login page

  Scenario: Login with registered email and password
    Given I am in login page
    When I input "thaur@mail.com" email
    And I input "thaurn" password
    And I click login button
    Then I get "logged in" as result

  Scenario Outline: Login with email and password
    Given I am in login page
    When I input <email> email
    And I input <password> password
    And I click login button
    And I click login button again
    Then I get <result> as result

    Examples:
    | email | password | result |
    | "thaur@mail.com" | "pinto" | "error" |
    | "user@mail.com"  | ""  | "password error"     |
    | "" | "nxxxae" | "email error" |
    | "naevis@mail.com" | "pass" | "record not found error" |
    | "" | "" | "email error" |