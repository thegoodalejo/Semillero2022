#Author: juan.henaor@sophossolutions.com
Feature: Search Accommodation

  Scenario: Search Accommodation by Booking
    Given I was in the "https://www.booking.com"
    When I want to search for an accommodation on the booking page
      | Lugar        | San Andrés, Colombia |
      | Check-in     | 4 septiembre 2022    |
      | Check-out    | 8 septiembre 2022    |
      | Adultos      |                    2 |
      | Habitaciones |                    2 |
    Then To find an accommodation according to my need
