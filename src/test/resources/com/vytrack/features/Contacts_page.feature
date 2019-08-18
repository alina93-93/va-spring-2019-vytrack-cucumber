Feature: Contacts page functionality


  Scenario: Verify title
    Given I login using these credentials
      | username | salesmanager101 |
      | password | UserUser123     |
    When I navigate to "Customers" "Contacts"
    Then the page title should be "All - Contacts - Customers"

  Scenario: Verify contact create details
    Given I login as a driver
    And I navigate to "Customers" "Contacts"
    When I click on customer with email "mbrackstone9@example.com"
    Then contact creation details should display correctly
      | Created At | Aug 14, 2019, 2:20 PM |
      | Owner      |  cyber tek            |