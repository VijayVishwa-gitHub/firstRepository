Feature: User Login
  I want to use this template for my feature file

  #Scenario: Successful Login
  #Given the user is on eCommerce Login page
  #When the user enters valid credentials(username: "balajivijay2410@gmail.com", password: "Tester@1234")
  #And the user clicks login button
  #Then the user is taken to My Account page
  #And the user should see a welcome message
  
  Scenario Outline: Unsuccessful Login
    Given the user is on eCommerce Login page
    When the user enter credentials "<email>" and "<password>"
    Then the user clicks login button
    And the user should see a welcome message

    Examples: 
      | email                     | password    |
      | balajivijay410@gmail.com  | Tester@1234 |
      | balajivijay2410@gmail.com | Tester@1234 |
