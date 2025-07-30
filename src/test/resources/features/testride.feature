@TestRideVehicle
Feature: Book a Test Ride on TVS Motor Website

Background: 
Given User click on test ride button

@TestRideVehicle1
Scenario Outline: Book a test ride with entering the user details.
When  User will be navigated to Book a test ride page
Then User enters the "<UserDetails>" and "<TestRideVehicleModelName>"
##And User enters "<TestRideVehicleModelName>"


Examples:
|UserDetails|TestRideVehicleModelName|
|TestUser1  |Apache RR 310           |
|TestUser2  |Apache RTR 310          | 

@Aboutus
Scenario: Navigate to About Us Page and Verify Content.
When User Click on About Us Menu
Then User Click on Overview section
Then Overview Page will be displayed and verify it







