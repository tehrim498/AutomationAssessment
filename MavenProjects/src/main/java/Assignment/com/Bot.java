package Assignment.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bot {

    private final WebDriver driver;
    public Bot() {
        this.driver = new ChromeDriver();
    }

    public WebDriver getBot() {
        return driver;
    }
}
