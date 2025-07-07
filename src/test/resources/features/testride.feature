@BuyVehicles
Feature:Book a Test Ride on TVS Motor Website

@BuyVehicle1
Scenario Outline: Book a test ride with entering the user details.
Given User click on test ride button
When  User will be navigated to Book a test ride page
Then User enters the "<UserDetails>"


Examples:
|UserDetails|
|TestUser1  |
|TestUser2  |

