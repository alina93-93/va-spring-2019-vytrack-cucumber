Feature: Navigation menu options

  Scenario Outline: verify page titles
    Given I login as a "<user>"
    When I navigate to "<tab>" "<module>"
    Then the page title should be "<title>"

    Examples: drivers
      | user   | tab        | module          | title                                                        |
      | driver | Fleet      | Vehicles        |              |
      | driver | Fleet      | Vehicles Model  | Vehicles Model - Entities - System - Car - Entities - System |
      | driver | Customers  | Accounts        | Accounts - Customers                                         |
      | driver | Customers  | Contacts        | Contacts - Customers                                         |
      | driver | Activities | Calendar Events | Calendar Events - Activities                                 |
      | driver | System     | Jobs            | Jobs - System                                                |

    Examples: sales managers
      | user          | tab        | module          | title                                                              |
      | sales manager | Fleet      | Vehicles        | All - Car - Entities - System - Car - Entities - System            |
      | sales manager | Fleet      | Vehicles Model  | All - Vehicles Model - Entities - System - Car - Entities - System |
      | sales manager | Customers  | Accounts        | All - Accounts - Customers                                         |
      | sales manager | Customers  | Contacts        | All - Contacts - Customers                                         |
      | sales manager | Activities | Calendar Events | All - Calendar Events - Activities                                 |
      | sales manager | System     | Jobs            | All - Jobs - System                                                |

    Examples: store managers
      | user          | tab        | module          | title                                                              |
      | store manager | Fleet      | Vehicles        | All - Car - Entities - System - Car - Entities - System            |
      | store manager | Fleet      | Vehicles Model  | All - Vehicles Model - Entities - System - Car - Entities - System |
      | store manager | Customers  | Accounts        | All - Accounts - Customers                                         |
      | store manager | Customers  | Contacts        | All - Contacts - Customers                                         |
      | store manager | Activities | Calendar Events | All - Calendar Events - Activities                                 |
      | store manager | System     | Jobs            | All - Jobs - System                                                |

