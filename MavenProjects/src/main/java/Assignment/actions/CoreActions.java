package Assignment.actions;

import Assignment.Utility.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoreActions {

    protected final WebDriver bot;
    protected final WebDriverWait waiter;

    protected CoreActions(WebDriver bot) {
        this.bot = bot;
        this.waiter = new WebDriverWait(bot, 10);
    }

    protected boolean waitForVisibility(By element) {
        boolean isVisible = true;
        try {
            Logger.step(element+" is waiting for visibility");
            waiter.until(ExpectedConditions.visibilityOfElementLocated(element));
        } catch (TimeoutException te) {
            isVisible = false;
        }
        return isVisible;
    }

    protected void click(By element) {
        bot.findElement(element).click();
        Logger.step(element+"is clicked successfully ");
    }

    protected void enterText(By element, String text) {
        bot.findElement(element).sendKeys(text);
        Logger.step(text+"is entered successfully in "+element);
    }
    protected String textRetriever(By element){
        Logger.step("Retrieving text from "+element);
        return bot.findElement(element).getText();
    }

    protected boolean dataMatcher(String data, By element){
        String text= textRetriever(element);

        if(text.equals(data)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void sleep(double sec) {
        try {
            Logger.step("Driver is going in sleeping state");
            Thread.sleep((long) (sec * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
