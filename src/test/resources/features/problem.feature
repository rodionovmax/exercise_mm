Feature: Resolving Problem
  Utilizing Java, Cucumber and the Page Object Model

  Scenario: Verify the right count of values appear on the screen
    Given Table with Labels and Values
      | Labels        | Values        |
      | Value 1       | $122,365.24   |
      | Value 2       | $599.00       |
      | Value 3       | $850,139.99   |
      | Value 4       | $23,329.50    |
      | Value 5       | $566.27       |
      | Total Balance | $1,000,000.00 |
    When I check all values
    Then Values count is correct

#    Examples:
#

#    Scenario Outline: Verify the values on the screen are greater than 0
#      Given Table with <labels> and <values>
#      When I check all values
#      Then All values suppose to be greater than 0

#      Examples:
#        | labels    | values      |
#        | lbl_val_1 | $122,365.24 |
#        | lbl_val_2 | $599.00     |
#        | lbl_val_3 | $850,139.99 |
#        | lbl_val_4 | $23,329.50  |
#        | lbl_val_5 | $566.27     |