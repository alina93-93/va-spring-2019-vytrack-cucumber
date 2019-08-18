Feature: Navigation menu options


  @navigation
  Scenario: Go to Fleet, Vehicles as a driver
    Given I login as a "driver"
    When I navigate to "Fleet" "Vehicles"
    Then the page title should be "Car - Entities - System - Car - Entities - System"
    And default page number should be 1


  @navigation
  Scenario: Go to Fleet, Vehicles as a somenoe else
    Given I login as a "driver"
    When I navigate to "Fleet" "Vehicles"
    Then the page title should be "Car - Entities - System - Car - Entities - System"
    And default page number should be 11





  Scenario: Go to Fleet, Vehicles as a sales manager
    Given I login as a "sales manager"
    When I navigate to "Fleet" "Vehicles"
    Then the page title should be "All - Car - Entities - System - Car - Entities - System"