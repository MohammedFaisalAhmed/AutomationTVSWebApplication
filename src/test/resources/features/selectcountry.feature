@SelectCountryAndGoToAppsDownload

Feature:  Select Country on TVS Website to View Region-Specific Vehicle Information

@Country
Scenario Outline: Select Kuwait from the country list to view localized vehicle information
Given User click on the Select Country icon
When  User verifies the presence of the country list in the dropdown
Then User selects the country "<Country>" from the list
Then The Selected country-specific website should open in a new tab

Examples:
|Country|
|Kuwait |

@DownloadApp
Scenario: Select android and ios App
Given User click on TVS Connect Google play button
When User will be navigated to the new window and verify the wordings
Then User click on books button
Then User click on Ebooks button
##Then User will be navigated to the new window and click on install on devices button
##Then User comes to main Window and click on User icon

@RoadSideAssistance
Scenario: Select Road Side Assistance button
Given User click on Road Side Assistance number 

@SelectState
Scenario: Select state from the dropdown
Given User Selects Karnataka from the dropdown















