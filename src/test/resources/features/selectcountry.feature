@SelectCountry

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