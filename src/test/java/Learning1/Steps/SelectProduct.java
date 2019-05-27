package Learning1.Steps;

import Learning1.utils.DriverFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SelectProduct extends DriverFactory {
    /*WebDriver driver;

    @Before()
    public void setup() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/llis/Desktop/MOJE/PROGRAMOWANIE/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
    }*/

    @Given("^user navigate to \"([^\"]*)\" website$")
    public void userNavigateToWebsite(String url) {
        this.getDriver().manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        getDriver().get(url);
    }

    @When("^user clicks on \"([^\"]*)\"$")
    public void userClicksOn(String button) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        WebElement buttonClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(button)));
        System.out.println("jestem tutaj");

        buttonClick.click();
        System.out.println("jestem tutaj po kliknieciu");
    }

    @Then("user should be presented with a promo alert")
    public void userShouldBePresentedWithAPromoAlert() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        WebElement buttonClick2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='button' and text()='Proceed']")));
        buttonClick2.click();

        System.out.println("przycisk widoczny");

        //driver.manage().deleteAllCookies();
        //driver.quit();

    }
}
