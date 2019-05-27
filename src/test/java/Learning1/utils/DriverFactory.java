package Learning1.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public static WebDriver driver;

    public WebDriver getDriver() {

        try {
            //Read Config
            ReadConfigFile file = new ReadConfigFile();
            String browserName = file.getBrowser();

            switch (browserName) {

                case "firefox":
                    if (null == driver) {
                        System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
                        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                        driver = new FirefoxDriver();
                        //setup
                    }
                    break;

                case "chrome":
                    if (null == driver) {
                        System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
                        driver = new ChromeDriver();
                        driver.manage().window().maximize();
                        //setup
                    }
                    break;
            }

        } catch (Exception e) {
            System.out.println("unable to load browser: " + e.getMessage());
        } finally {
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        }
        return driver;
    }





}
