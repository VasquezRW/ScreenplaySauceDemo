Feature: Login and test cart functionalities on the website

  @login
  Scenario: Login the website with the credentials provided
    Given the user opens the website
    When the user types in "standard_user" "secret_sauce" and cick login
    Then make sure the user is on the home page "PRODUCTS"

  @OrderBy
  Scenario: Order the products by the given value
    Given the user click on the dropdown button
    When click on "low-high"
    Then validate the items are ordered correctly

  @addToCart
  Scenario: Add 2 items and delete 1 from the cart
    Given add two items to the cart
    When click on cart then remove one item from the cart
    Then validate that the item is in the cart "Sauce Labs Onesie"

  @checkout
  Scenario: Do the checkout from the cart
    Given click on the checkout button
    When put in the fields the information "Wilmer" "Vasquez" "01059" then click continue and finish
    Then make sure we are on the checkout page "CHECKOUT: COMPLETE!"

  @logout
  Scenario: Logout from the website
    Given click on the menu
    When click on logout
    Then validate that we are at the login page "LOGIN"