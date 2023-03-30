@smoke
  Feature: Search
    Scenario: Search by item name
      Given Enter item name"book"
      When click to search icon
      Then verify the search done by name

      Scenario: Search by serial number of the product
        Given Enter serial number of the product
        When click to search icon
        Then verify the search done by serial