#Author: juan.morap@sophossolutions.com
Feature: I as a user want to find alogamiento wax to the beach with good classification and the most economical

  Scenario: Find Acoommodation booking
    Given since I am on the page 'https://www.booking.com/index.html?utm_campaign=Booking+Name&utm_medium=cpc&utm_term=b3YDyMo0k8Dj47_gBBiUxA&utm_source=bing&label=msn-b3YDyMo0k8Dj47_gBBiUxA-80470531814527%3Atikwd-80470558197349%3Aloc-43%3Aneo%3Amte%3Alp142144%3Adec%3Aqsbooking&msclkid=e2af48372585113662da2ad4d5b8014e&aid=375648'
    When I want to look for an accommodation on page
      | place     | San Andrés |
      | Check-in  | 31-08-2022 |
      | Check-out | 04-09-2022 |
      | cantAdult |          2 |
      | bedrooms  |          2 |
    Then find an accommodation according to my need
