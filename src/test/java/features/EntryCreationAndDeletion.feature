@EntryTest
Feature: EntryCreationAndDeletion
  As a user
  I want to be able to create entries and delete them

  @EntryTest
Scenario: Create an entry
  Given I have logged into the site
  Then I should be able to create an entry

  @EntryTest
Scenario: Create multiple entries
  Given I have logged into the site
  Then I should be able to create "3" entries

  @EntryTest
Scenario: Delete an entry
  Given I have logged into the site
  And created an entry
  Then I should be able to delete the entry