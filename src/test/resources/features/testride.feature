@TestRideVehicle
Feature: Book a Test Ride on TVS Motor Website

@TestRideVehicle1
Scenario Outline: Book a test ride with entering the user details.
Given User click on test ride button
When  User will be navigated to Book a test ride page
Then User enters the "<UserDetails>" and "<TestRideVehicleModelName>"
##And User enters "<TestRideVehicleModelName>"


Examples:
|UserDetails|TestRideVehicleModelName|
|TestUser1  |Apache RR 310           |
|TestUser2  |Apache RTR 310          | 







