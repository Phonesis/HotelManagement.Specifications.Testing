package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pageobjects.EntryCreationHomePage;

/**
 * Created by MPoole on 26/03/2017.
 */
public class EntryCreationAndDeletionSteps {

    private EntryCreationHomePage entryCreationHomePage;

    public EntryCreationAndDeletionSteps(){
        entryCreationHomePage = new EntryCreationHomePage();
    }

    @Given("^I have logged into the site$")
    public void i_have_logged_into_the_site() throws Throwable {
        entryCreationHomePage
                .PerformLogIn();
    }

    @Given("^created an entry$")
    @Then("^I should be able to create an entry$")
    public void i_should_be_able_to_create_an_entry() throws Throwable {
        entryCreationHomePage
                .CreateTestEntry(1);
    }

    @Then("^I should be able to create \"([^\"]*)\" entries$")
    public void i_should_be_able_to_create_entries(int entries) throws Throwable {
        entryCreationHomePage
                .CreateTestEntry(entries);
    }

    @Then("^I should be able to delete the entry$")
    public void i_should_be_able_to_delete_the_entry() throws Throwable {
        Assert.assertTrue(entryCreationHomePage.CanDeleteLastEntry());
    }

    @After("@EntryTest")
    public void TearDownBrowser(Scenario scenario)
    {
        TakeScreenshotIfFailing(scenario);
        entryCreationHomePage.ClosePage();
    }

    private void TakeScreenshotIfFailing(Scenario scenario) {
        if (scenario.isFailed()) {
            entryCreationHomePage.TakeScreenshot(scenario);
        }
    }
}
