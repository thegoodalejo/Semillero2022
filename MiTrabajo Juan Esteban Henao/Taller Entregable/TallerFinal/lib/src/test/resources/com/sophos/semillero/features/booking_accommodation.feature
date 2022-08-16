#Author: juan.henaor@sophossolutions.com
Feature: Search Accommodation

  Scenario: Search Accommodation by Booking
    Given Me as a user
    When I want to search for an accommodation on the "https://www.booking.com" page
      | Lugar        | San Andrés, Colombia |
      | Check-in     | 31 agosto 2022       |
      | Check-out    | 4 septiembre 2022    |
      | Adultos      |                    2 |
      | Habitaciones |                    2 |
    Then To find an accommodation according to my need
