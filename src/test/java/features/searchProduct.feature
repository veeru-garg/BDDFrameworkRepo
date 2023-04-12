Feature: Search and Place the order for products

  @OfferPage
  Scenario Outline: Search Experience for product search in both home and offers page
    Given User in on GreenCart Landing page
    When user search with shortname <Name> and extracted actual name of product
    Then user searched for <Name> shortname in offers page
    And Validate product name in offers page matches with Landing page
    Examples:
      | Name |
      | Tom  |
      | Beet |
