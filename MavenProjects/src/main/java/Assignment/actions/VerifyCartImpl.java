package Assignment.actions;

import Assignment.pages.home.verifyCart;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class VerifyCartImpl extends CoreActions{

    public VerifyCartImpl(WebDriver bot) {
        super(bot);
    }

    @Step("Dress")
    public void Dress() {
        waitForVisibility(verifyCart.dress);
        click(verifyCart.dress);
    }

    @Step("Casual Dresses")
    public void CasualDress() {
        waitForVisibility(verifyCart.dresstype);
        click(verifyCart.dresstype);
    }

    @Step("In Cart")
    public void InCart() {
        waitForVisibility(verifyCart.incart);
        click(verifyCart.incart);
    }

    @Step("Check Out")
    public void CheckOut() {
        waitForVisibility(verifyCart.checkout);
        click(verifyCart.checkout);
    }

}
