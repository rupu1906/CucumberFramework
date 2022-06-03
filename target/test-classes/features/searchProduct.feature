Feature: Search and place the order for Product

Scenario Outline: Search Experience for product search in both home and offers page
Given  User is on GreenCart Landing Page
When user searched with short name <Name> and extract actual name of the product
Then user search for <Name> short name in offer page
And validate product name in offer page matches with Landing page

Examples:
|Name|
|Tom|
|Beet|


