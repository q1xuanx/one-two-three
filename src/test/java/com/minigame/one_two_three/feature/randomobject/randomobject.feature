Feature: Check result when user chose zero, one or two
  Scenario: User chose zero
    Given The list button is show
    When The user chose Bua
    Then Bot will response result
      | If bot chose | then     |
      | Bua          | DRAW     |
      | Keo          | USER     |
      | Bao          | BOT      |
  Scenario: User chose one
    Given The list button is show
    When The user chose Keo
    Then Bot will response result
      | If bot chose | then     |
      | Bua          | BOT      |
      | Keo          | DRAW     |
      | Bao          | USER     |
  Scenario: User chose two
    Given The list button is show
    When The user chose Bao
    Then Bot will response result
      | If bot chose | then     |
      | Bua          | USER     |
      | Keo          | BOT      |
      | Bao          | DRAW     |
