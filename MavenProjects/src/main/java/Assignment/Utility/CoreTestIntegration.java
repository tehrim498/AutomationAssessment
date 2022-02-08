package Assignment.Utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class CoreTestIntegration {

    protected static final String URL = "http://automationpractice.com/";

    protected WebDriver driver;
    public CoreTestIntegration() {
        this.driver = new ChromeDriver();
    }

    public WebDriver getBot() {
        return driver;
    }


    @BeforeClass
    public void openBrowser() {
        driver = new CoreTestIntegration().getBot();
        driver.get(URL);
    }

    protected static void logStep(String step) {
        Logger.step(step);
    }


    @AfterClass
    public void close() {
        driver.quit();
    }

}

