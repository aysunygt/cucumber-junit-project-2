Feature:


  Scenario: User should be able to place order and order seen in web table
    Given user is already logged in and on order page
    When user selects product type "Familybea"
    And user enters quantity 2
    And user enters customer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user selects credit card type "american express"
    And user enters card card number "1111222233334444"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table


  Scenario Template:
    Given user is already logged in and on order page
    When user selects product type "<productType>"
    And user enters quantity "<quantity>"
    And user enters customer name "<costumerName>"
    And user enters street "<street>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zipcode "<zipCode>"
    And user selects credit card type "<cardType>"
    And user enters card card number "<cardNumber>"
    And user enters expiry date "<expiryDate>"
    And user enters process order button
    Then user should see "<expectedName>" in first row of the web table

@femaleScientist
    Examples:Famous female scientist
      | productType | quantity | costumerName      | street            | city   | state   | zipCode | cardType | cardNumber       | expiryDate | expectedName      |
      | Familybea   | 2        | Sherlock Holmes   | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Sherlock Holmes   |
      | Familybea   | 4        | Marie Curie       | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Marie Curie       |
      | Familybea   | 2        | Rachel Carson     | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Rachel Carson     |
      | Familybea   | 3        | Katherina Johnson | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Katherina Johnson |
      | Familybea   | 1        | Marry Anning      | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Marry Anning      |
      | Familybea   | 2        | Lise Meitner      | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Lise Meitner      |

    @maleScientist
    Examples: Famous male scientist
      | productType | quantity | costumerName      | street            | city   | state   | zipCode | cardType | cardNumber       | expiryDate | expectedName      |
      | Familybea   | 2        | Albert Einstein   | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Albert Einstein   |
      | Familybea   | 2        | Charles Darwin    | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Charles Darwin    |
      | Familybea   | 2        | Alfred Nobel      | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Alfred Nobel      |
      | Familybea   | 2        | Archimedes        | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Archimedes        |
      | Familybea   | 2        | Alexander Fleming | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Alexander Fleming |
      | Familybea   | 2        | Carl Sagan        | 221B Baker Street | London | England | 50505   | visa     | 1111222233334444 | 12/23      | Carl Sagan        |
