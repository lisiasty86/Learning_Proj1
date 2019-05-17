package Learning1.Steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ContactUs {
    WebDriver driver;

    @Before()
    public void setup() throws IOException {
        //System.setProperty("webdriver.chrome.driver\", \"C:\\\\Users\\\\llis\\\\Desktop\\\\MOJE\\\\PROGRAMOWANIE\\\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    @Given("I access webdriveruniversity contact us form")
    public void iAccessWebdriveruniversityContactUsForm() {
    }

    @When("I enter a valid first name")
    public void iEnterAValidFirstName() {
    }

    @When("^I enter a valid last name$")
    public void iEnterAValidLastName() {
    }

    @And("I enter a valid email address")
    public void iEnterAValidEmailAddress() {
    }

    @And("I enter comments{int}")
    public void iEnterComments(int arg0) {

    }

    @When("I click on the submit button{int}")
    public void iClickOnTheSubmitButton(int arg0) {

    }

    @Then("the information should successfully be submitted via the contact us form{int}")
    public void theInformationShouldSuccessfullyBeSubmittedViaTheContactUsForm(int arg0) {
    }
}
