@BuyVehicles
Feature: Users will buy Vehicle

@BuyVehicle1
Scenario Outline: User1 will buy vehicle by using valid credentials.
Given User will navigate to the TVS website
When User Click on Buy Vehicle 
Then User will click on "<Vehicle Type>"


Examples:
|Vehicle Type|
|SCOOTER     |