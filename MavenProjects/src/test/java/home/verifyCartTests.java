package home;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Assignment.actions.HomePageImpl;
import Assignment.actions.VerifyCartImpl;
import Core.CoreTestIntegration;
import Core.Listener;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Test
@Epic("EPIC 3")
@Listeners(Listener.class)
public class verifyCartTests extends CoreTestIntegration{

    VerifyCartImpl cart;

    @Test
    @Description("creating impl objects before class")
    public void initImpl() {
        cart = new VerifyCartImpl(bot);
    }

    @Test(dependsOnMethods = "initImpl")
    @Description("Verification of cart")
    @Severity(SeverityLevel.CRITICAL)
    @Story("STORY 3")
    @Feature("FEATURE 3")
    @Owner("Tehrim Ansari")
    public void test_assignment() {

        logStep("Clicked on Dress");
        cart.Dress();

        logStep("Clicked on DressType");
        cart.CasualDress();

        logStep("Clicked on Add to Cart");
        cart.InCart();

        logStep("Clicked on Checkout");
        cart.CheckOut();




    }

}
