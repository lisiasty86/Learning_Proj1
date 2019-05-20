package Learning1.Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import cucumber.api.DataTable;
import io.cucumber.datatable.DataTable;
//import gherkin.ast.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ContactUs {
    WebDriver driver;

    @Before()
    public void setup() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/llis/Desktop/MOJE/PROGRAMOWANIE/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }

    @After()
    public void tearDown() {
        //this.driver.manage().deleteAllCookies();
        //this.driver.close();
        //this.driver.quit();
    }

    @Given("I access webdriveruniversity contact us form")
    public void iAccessWebdriveruniversityContactUsForm() {
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
        /*WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement buttonClicable;
        buttonClicable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath()));
        buttonClicable.click();*/
    }

    @When("I enter a valid first name")
    public void iEnterAValidFirstName() {
        driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys("Tom");
    }

    @When("^I enter a valid last name$")
    public void iEnterAValidLastName(DataTable dataTable) {
        //List<List<String>> data = dataTable.raw();
        List<List<String>> data = dataTable.asLists(String.class);

        driver.findElement(By.xpath("//*[@name='last_name']")).sendKeys(data.get(0).get(1));
    }

    @And("I enter a valid email address")
    public void iEnterAValidEmailAddress() {
        driver.findElement(By.xpath("//*[@name='email']")).sendKeys("webdriveruniversity@outlook.com");
    }

    @And("I enter comments{int}")
    public void iEnterComments(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);

        driver.findElement(By.xpath("//*[@name='message']")).sendKeys(data.get(0).get(0));
        //driver.findElement(By.xpath("//*[@name='message']")).sendKeys(data.get(0).get(1));
    }

    @When("I click on the submit button{int}")
    public void iClickOnTheSubmitButton(int arg0) {

    }

    @Then("the information should successfully be submitted via the contact us form{int}")
    public void theInformationShouldSuccessfullyBeSubmittedViaTheContactUsForm(int arg0) {
    }
}
