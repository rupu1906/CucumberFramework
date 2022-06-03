Feature: Place the order for Products

@SmokeTest
Scenario Outline: Add the searched product in the bag and proceed to checkout


Given  User is on GreenCart Landing Page
When user searched with short name <Name> and extract actual name of the product
And added "3" items of the selected product to the cart
Then user proceeds to checkout and validate the <Name> items in checkout page 
And Verify if user has ability to enter promo code and place the order

Examples:
|Name|
|Tom|