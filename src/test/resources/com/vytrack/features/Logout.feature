@logout

Feature: Log out feature
  @logout
  Scenario: Driver
    Given  I login as a "driver"
    When I logout
    Then the page title should be "Login"
  @logout
  Scenario: Sales manager
    Given  I login as a "sales manager"
    When I logout
    Then the page title should be "Login"
  @logout
  Scenario: Store manager
    Given  I login as a "store manager"
    When I logout
    Then the page title should be "Login"
