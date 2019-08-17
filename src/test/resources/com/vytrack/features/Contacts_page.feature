Feature: Contacts page functionality
  @wip
  Scenario: Verify titlegit
    Given I login using these credentials
    | username | salesmanager101 |
    | password | UserUser123     |

    When I navigate to "Customers" "Contacts"
    Then the page title should be "Customers - Contacts"
