package Assignment.actions;

import Assignment.pages.HomePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePageImpl extends CoreActions {

//	private String title;

    public HomePageImpl(WebDriver bot)
    {
        super(bot);
    }

    @Step("check if the user has arrived on the correct  page")
    public void titleValidate()
    {
        String actualtitle= bot.getTitle();
        String expectedtitle= "My Store";

//		System.out.println("Validating the title");

        Assert.assertEquals(actualtitle, expectedtitle, "Title not matches");
    }

    @Step("mail")
    public void Email(final String mail) {
        waitForVisibility(HomePage.Email);
        enterText(HomePage.Email, mail);
    }
    @Step("Message")
    public void Message(final String msg) {
        waitForVisibility(HomePage.Msg);
        enterText(HomePage.Msg, msg);
    }
    @Step("Contact")
    public void Contact() {
        waitForVisibility(HomePage.contactUs);
        click(HomePage.contactUs);
    }
    @Step("Customer Service")
    public void CService() {
//        sleep(0.50);k
        click(HomePage.customerService);

    }
    @Step("Send")
    public void Submit() {
        waitForVisibility(HomePage.send);
        click(HomePage.send);
    }




}
