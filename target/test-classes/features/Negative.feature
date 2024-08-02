@Negative
Feature: Create booking

  Scenario Outline: Create Booking with Valid Data
    Given Create booking with valid data for firstname "<firstname>" and lastname "<lastname>"
    When I send a POST request to the Create Booking API
    Then I should receive a status code 200
    And The response should contain the booking details

    Examples:
      | firstname | lastname |
      | John      | Doe      |
      | Jane      | Smith    |

  Scenario Outline: Create Booking with Invalid Data
    Given Create booking with invalid data for firstname "<firstname>" and lastname "<lastname>"
    When I send a POST request to the Create Booking API
    Then I should receive a status code 400
    And The response should contain an error message

    Examples:
      | firstname | lastname |
      |           | Doe      |
      | John      |          |
      | John      | Doe!     |

  Scenario Outline: Create Booking with Edge Case Data
    Given Create booking with edge case data for firstname "<firstname>" and lastname "<lastname>"
    When I send a POST request to the Create Booking API
    Then I should receive a status code 200
    And The response should contain the booking details

    Examples:
      | firstname         | lastname         |
      | AAAAAAAAAAAAAAAAA | BBBBBBBBBBBBBBBB |
      | @John             | Doe              |

  Scenario: Create Booking with Unauthorized Access
    Given I am not authenticated
    When I send a POST request to the Create Booking API
    Then I should receive a status code 401
    And The response should contain an authentication error message

  Scenario: Create Booking with Multiple Requests
    Given I send 1000 POST requests to the Create Booking API with valid data
    Then I should receive a status code 200 for all requests

  Scenario Outline: Validate Booking Response
    Given Create booking with valid data for firstname "<firstname>" and lastname "<lastname>"
    When I send a POST request to the Create Booking API
    Then I should receive a status code 200
    And The response should contain the booking details
    And The response should contain the correct firstname "<firstname>"
    And The response should contain the correct lastname "<lastname>"

    Examples:
      | firstname | lastname |
      | John      | Doe      |
      | Jane      | Smith    |

