package tests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import Assignment.actions.CartPageImpl;
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
@Epic("EPIC 3")
@Listeners(Listener.class)
public class CartPageTest extends CoreTestIntegration{

    CartPageImpl cart;

    @Test
    @Description("creating impl objects before class")
    public void initImpl() {
        cart = new CartPageImpl(driver);
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

        logStep("Clicked on Printed dress");
        cart.PDress();

        logStep("Clicked on Add to Cart");
        cart.InCart();

        logStep("Clicked on Checkout");
        cart.CheckOut();

        logStep("verify Product Name");
        cart.nameCheck();

        logStep("verify Product Price");
        cart.priceCheck();



    }

}
