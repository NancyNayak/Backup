@smoke
Feature: Wikipedia main Page
  As a Wikipedia User
  I want  an main page to be displayed
  Sp that I can search page of interest

  Scenario: Display Feature Article
    Given  I am on Wikipedia Page
    Then  today feature article Displayed

  Scenario: search for Country
    Given  I am on Wikipedia Page
    And I search for "India"
    Then "India" should be  displayed in the header

