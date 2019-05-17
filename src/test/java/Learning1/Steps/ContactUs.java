package Learning1.Steps;

import cucumber.api.java8.En;

public class ContactUs implements En {
    public ContactUs() {
        Given("^I access webdriveruniversity contact us form$", () -> {
        });
        When("^I enter a valid first name$", () -> {
        });
        When("^I enter a valid last name$", () -> {
        });
        And("^I enter a valid email address$", () -> {
        });
        And("^I enter comments(\\d+)$", (Integer arg0) -> {
        });
        When("^I click on the submit button(\\d+)$", (Integer arg0) -> {
        });
        Then("^the information should successfully be submitted via the contact us form(\\d+)$", (Integer arg0) -> {
        });
    }
}
