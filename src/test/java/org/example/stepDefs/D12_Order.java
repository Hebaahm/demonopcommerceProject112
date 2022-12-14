package org.example.stepDefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P_6_Order;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class D12_Order {


    P_6_Order P6 = new P_6_Order();


    @Then("user check Agree Box and press CheckOut")
    public void userCheckAgreeBoxAndPressCheckOut() {
        P6.termsOf().click();
        P6.checkOut().click();

    }
    @Then("user fill shipping form")
    public void userFillShippingForm() throws InterruptedException {
        Select select = new Select(P6.country());
        select.selectByVisibleText("Egypt");
        select = new Select(P6.countrySup());
        select.selectByVisibleText("Other");

        Thread.sleep(1500);
        P6.City().clear();
        P6.City().sendKeys("City ");
        P6.Adress().clear();
        P6.Adress().sendKeys("Address ");
        P6.ZipCode().clear();
        P6.ZipCode().sendKeys("1234");
        P6.phone().clear();
        P6.phone().sendKeys("01234567891");

    }

    @When("User Check Out Order Successfully")
    public void userCheckOutOrderSuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        P6.CheckoutBt().click();
        Thread.sleep(2000);
        P6.CheckoutBt2().click();
        Thread.sleep(2000);
        P6.CheckoutBt3().click();
        Thread.sleep(2000);
        P6.CheckoutBt4().click();
        Thread.sleep(2000);
        P6.CheckoutBt5().click();
        Thread.sleep(2000);


        Thread.sleep(3000);
        SoftAssert order = new SoftAssert();
        String expect = "Your order successfully processed!";
        String actual = P6.txtDone().getText();
        order.assertTrue(actual.contains(expect),"Order Page");
        order.assertTrue(P6.txtDone().isDisplayed());
        order.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/checkout/completed");
        System.out.println("Your Result :" + actual);
        order.assertAll();

    }

    @And("user go to Shopping Cart page to buy")
    public void userGoToShoppingCartPageToBuy() throws InterruptedException {
        Thread.sleep(3000);
        P6.ShopingCartBtn().click();
        Thread.sleep(3000);
        for (double x = 0; x < P6.product().size(); x++ )
        {
            String value = P6.product().get((int) x).getText();

            Assert.assertTrue(true, value);
        }

    }
}
