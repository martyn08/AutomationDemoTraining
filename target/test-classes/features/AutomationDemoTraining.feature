@GoogleSearch @test
Feature: Google Search
  As a web user
  I want to be able to register
  So that I can access the job site

  Scenario: Web account registration
    Given i'm on registration page
    When i enter my "First name" in the text boxes
    And i enter my "Last name" in the text boxes
    And i click on "check boxes" to confirm my sex my gender
    And i click on "radio button" to confirm my Years of Experience
    And i enter "Date" on date picker
    And i click on "check boxes" to confirm my Profession
    #And i click to confirm Checkbox to confirm "Selenium Webdriver" i've used
    And i click on "continents" on multi select box to choose where i'm from
    And i clicked on "commands" i use in selenium
    And i click on "choose file" to upload image
    And i click to "Download link" to upload my file
    Then i click on submit button
