package Assignment.actions;

import Assignment.pages.CartPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartPageImpl extends CoreActions{

    public CartPageImpl(WebDriver bot) {
        super(bot);
    }

    @Step("Dress")
    public void Dress() {
        waitForVisibility(CartPage.dress);
        click(CartPage.dress);
    }

    @Step("Casual Dresses")
    public void CasualDress() {
        waitForVisibility(CartPage.dresstype);
        click(CartPage.dresstype);
    }



    @Step("Printed dress")
    public void PDress() {
        waitForVisibility(CartPage.printeddress);
        CartPage.productdressName=textRetriever(CartPage.ProductName); //printed dress
        CartPage.productdressprice=textRetriever(CartPage.ProductPrice); //$26
        System.out.println(CartPage.productdressprice);


        click(CartPage.printeddress);
    }
    @Step("In Cart")
    public void InCart() {
        waitForVisibility(CartPage.incartt);
        click(CartPage.incartt);
    }

    @Step("Check Out")
    public void CheckOut() {
        waitForVisibility(CartPage.checkout);
        click(CartPage.checkout);
    }

    @Step("Verifying the Product Name")
    public void nameCheck(){

        Assert.assertTrue(dataMatcher(CartPage.productdressName, CartPage.CartProductName));//softt assert
        System.out.println("Name checking complete");
    }

    @Step("Verifying the Product Price")
    public void priceCheck(){

        Assert.assertTrue(dataMatcher(CartPage.productdressprice, CartPage.CartProductPrice));
        System.out.println("Price checking completed");
    }

}
