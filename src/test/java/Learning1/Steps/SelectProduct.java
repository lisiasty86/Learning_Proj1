package Learning1.Steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SelectProduct {
    WebDriver driver;

    @Before()
    public void setup() throws IOException {
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
    }

    @Given("^user navigate to \"([^\"]*)\" website$")
    public void userNavigateToWebsite(String url) {
    }

    @When("^user clicks on \"([^\"]*)\"$")
    public void userClicksOn(String button) {
    }

    @Then("user should be presented with a promo alert")
    public void userShouldBePresentedWithAPromoAlert() {
    }
}
