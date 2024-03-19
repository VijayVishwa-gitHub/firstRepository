Feature: Fetching data from Excel

  Scenario: User trying to login
    When User opens the application
    And Enter email and password from excel
      | Excel      | Location                  | Sheet  |
      | Testing xl | C:\\Users\\admin\\Desktop | sheet1 |
    Then user is able to login
