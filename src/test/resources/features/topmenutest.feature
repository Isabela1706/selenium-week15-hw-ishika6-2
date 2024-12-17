Feature: Top menu Feature


  Background: I am On homepage

  @sanity
  Scenario: verifyUserShouldNavigateToDesktopsPageSuccessfully

    When I mouse hover and click on desktop link
    And I click on show all desktops link
    Then Verify Desktops text

  @smoke
  Scenario: Verify user should navigate to laptops and notebooks page successfully

    When I mouse hover and click on laptops and notebooks link
    And I click on Show all laptops and notebooks link
    Then Verify Laptops & Notebooks text

  @regression
  Scenario: Verify user should navigate to components page successfully

    When I mouse hover and click on components link
    And I click on Show all components link
    Then Verify Components text