
Feature: Login as different people using maps

  @wip
  Scenario Outline: Verify title
    Given I login using these credentials
      | username | <username> |
      | password | <password> |
    When I navigate to "Customers" "Contacts"
    Then the page title should be "All - Contacts - Customers"

    Examples:
      | username        | password    |
      | salesmanager101 | UserUser123 |
      | salesmanager102 | UserUser123 |
      | salesmanager103 | UserUser123 |