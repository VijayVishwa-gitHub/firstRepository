
Feature: Running Tag 1
  I want to use this template for my feature file

  @tag1
  Scenario: Running Tag 1
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    
  @tag2
  Scenario Outline: Running Tag2
    Given I want to write a step with "<name>"
    When I check for the <value> in step
    Then I verify the "<status>" in step

    Examples: 
      | name  | value | status  |
      | Vijay |     5 | success |
      | Manoj |     7 | Fail    |


Scenario: Running both Tag1 and Tag2
Given There are multiple tags available
Then Print statetment will be executed 