package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Assignment.actions.HomePageImpl;
import Assignment.Utility.CoreTestIntegration;
import Assignment.Utility.Listener;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;


@Test
@Epic("EPIC 2")
@Listeners(Listener.class)
public class EmailPageTest extends CoreTestIntegration{

    HomePageImpl home;

    @Test
    @Description("creating impl objects before class")
    public void initImpl() {
        home = new HomePageImpl(driver);
    }

    @Test(dependsOnMethods = "initImpl")
    @Description("test that the user is Invalid")
    @Severity(SeverityLevel.CRITICAL)
    @Story("STORY 2")
    @Feature("FEATURE 2")
    @Owner("Tehrim Ansari")
    public void test_assignment() {

        logStep("Clicked on contact us");
        home.Contact();

        logStep("Clicked on customer service");
        home.CService();

        logStep("entered email");
        home.Email("xyz.com");

        logStep("Entered the message");
        home.Message("Hello");

        logStep("submit");
        home.Submit();

    }

}

