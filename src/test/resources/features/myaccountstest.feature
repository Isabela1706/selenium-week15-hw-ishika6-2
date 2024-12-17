Feature: My account Feature

  Background: I am on homepage


  @sanity @smoke @regression
  Scenario: Verify user should navigate to register page successfully
    When I click on my accounts link
    And I click on register link
    Then Verify the text "Register Account"

  @smoke @regression
  Scenario: Verify user should navigate to login page successfully
    When I click on my accounts link
    And I click on login link
    Then Verify the login text "Returning Customer"

  @regression
  Scenario: Verify user register account successfully
    When I click on my accounts link
    And I click on register link
    And I register to ac using data: "Prime", "Testing", "p3499@gmail.com", "07833662976", "prime@1235", "prime@1235"
    Then Verify the Message Your Account Has Been Created!
    And I click on continue button after register
    And I click on my accounts link
    And I click on logout link
    Then Verify the logout text "Account Logout"

  @regression
  Scenario: Verify user login and logout successfully
    When I click on my accounts link
    And I click on login link
    And I enter "p3499@gmail.com", "prime@1235" and login
    Then Verify text after login "My Account"
    And I click on my accounts link
    And I click on logout link
    Then Verify the logout text "Account Logout"