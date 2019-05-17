Feature: Submit data to webdriveruniversity.com using contact us form

  @contactus2
  Scenario: Submit valid data via contact us form
    Given I access webdriveruniversity contact us form
    When I enter a valid first name
    When I enter a valid last name
      | woods | jackson | jones |
    And I enter a valid email address
    And I enter comments2
      | example comment one | example comment two |
    When I click on the submit button2
    Then the information should successfully be submitted via the contact us form2