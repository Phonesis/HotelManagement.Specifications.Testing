$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/EntryCreationAndDeletion.feature");
formatter.feature({
  "line": 2,
  "name": "EntryCreationAndDeletion",
  "description": "As a user\r\nI want to be able to create entries and delete them",
  "id": "entrycreationanddeletion",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@EntryTest"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Create an entry",
  "description": "",
  "id": "entrycreationanddeletion;create-an-entry",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@EntryTest"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I have logged into the site",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I should be able to create an entry",
  "keyword": "Then "
});
formatter.match({
  "location": "EntryCreationAndDeletionSteps.i_have_logged_into_the_site()"
});
formatter.result({
  "duration": 4388938311,
  "status": "passed"
});
formatter.match({
  "location": "EntryCreationAndDeletionSteps.i_should_be_able_to_create_an_entry()"
});
formatter.result({
  "duration": 3934015960,
  "status": "passed"
});
formatter.after({
  "duration": 1129895146,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Create multiple entries",
  "description": "",
  "id": "entrycreationanddeletion;create-multiple-entries",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@EntryTest"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I have logged into the site",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I should be able to create \"3\" entries",
  "keyword": "Then "
});
formatter.match({
  "location": "EntryCreationAndDeletionSteps.i_have_logged_into_the_site()"
});
formatter.result({
  "duration": 3917981281,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 28
    }
  ],
  "location": "EntryCreationAndDeletionSteps.i_should_be_able_to_create_entries(int)"
});
formatter.result({
  "duration": 11234733955,
  "status": "passed"
});
formatter.after({
  "duration": 1476383730,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Delete an entry",
  "description": "",
  "id": "entrycreationanddeletion;delete-an-entry",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@EntryTest"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I have logged into the site",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "created an entry",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I should be able to delete the entry",
  "keyword": "Then "
});
formatter.match({
  "location": "EntryCreationAndDeletionSteps.i_have_logged_into_the_site()"
});
formatter.result({
  "duration": 3778979350,
  "status": "passed"
});
formatter.match({
  "location": "EntryCreationAndDeletionSteps.i_should_be_able_to_create_an_entry()"
});
formatter.result({
  "duration": 3958531046,
  "status": "passed"
});
formatter.match({
  "location": "EntryCreationAndDeletionSteps.i_should_be_able_to_delete_the_entry()"
});
formatter.result({
  "duration": 3065388452,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat steps.EntryCreationAndDeletionSteps.i_should_be_able_to_delete_the_entry(EntryCreationAndDeletionSteps.java:42)\r\n\tat ✽.Then I should be able to delete the entry(src/test/java/features/EntryCreationAndDeletion.feature:20)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 11492970225,
  "status": "passed"
});
});