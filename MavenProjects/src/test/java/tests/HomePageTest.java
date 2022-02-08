package tests;
import org.testng.annotations.Test;
import Assignment.Utility.CoreTestIntegration;
import Assignment.Utility.Listener;

import Assignment.actions.HomePageImpl;
import io.qameta.allure.*;

import org.testng.annotations.Listeners;


@Test
@Epic("EPIC 1")
@Listeners(Listener.class)
public class HomePageTest extends CoreTestIntegration{

    HomePageImpl home;

    @Test
    @Description("creating impl objects before class")
    public void initImpl() {
        home = new HomePageImpl(driver);
    }

    @Test(dependsOnMethods = "initImpl")
    @Description("test that the user is valid")
    @Severity(SeverityLevel.CRITICAL)
    @Story("STORY 1")
    @Feature("FEATURE 1")
    @Owner("Tehrim Ansari")
    public void test_assignment() {


        logStep("Validating the title");
        home.titleValidate();

        logStep("Clicked on contact us");
        home.Contact();

        logStep("Clicked on customer service");
        home.CService();

        logStep("entered email");
        home.Email("tehrim0611@gmail.com");

        logStep("Entered the message");
        home.Message("Hello");

        logStep("submit");
        home.Submit();

    }

}

