package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P_4_ShoppingCart;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D9_Shoping {

    P_4_ShoppingCart P4 = new P_4_ShoppingCart();

    @And("user add item to Shopping cart")
    public void addItemsToShop() throws InterruptedException {
        Thread.sleep(2000);
        P4.shoeAdd().click();
        Select heba = new Select(P4.size());
        heba.selectByVisibleText("10");
        P4.selectColor().click();
        P4.addCart().click();
        Thread.sleep(3000);
        SoftAssert buy = new SoftAssert();
        String expect = "product added";
        String actual = P4.sucssText().getText();
        buy.assertTrue(actual.contains(expect));
        buy.assertTrue(P4.sucssText().isDisplayed());
        buy.assertAll();

    }

    @Then("user go to Electronics category")
    public void userGoToElectronicsCategory() {
        P4.electronic().click();
    }

    @And("user select Cell phones Subcategory")
    public void userSelectCellPhonesSubcategory() {
        P4.SubElctronic().click();
    }

    @Then("user select Mobile HTC One M-8")
    public void userSelectMobileHTCOneM()  {
        P4.HTC_M8().click();
    }

    @Then("user add mobiles to Quantity")
    public void userAddMobilesToQuantity() throws InterruptedException {
        P4.HTCadd().clear();
        P4.HTCadd().sendKeys("1");
        Thread.sleep(2000);
        for (double x = 0; x < P4.pricesValu().size(); x++ )
        {
            String value = P4.pricesValu().get((int) x).getText();
            System.out.println(" Item Price : "+value);
            Assert.assertTrue(true, value);
        }


    }
    @Then("user add mobile to Shopping cart")
    public void userAddMobileToShoppingCart() throws InterruptedException {
        P4.HTCcart().click();
        Thread.sleep(3000);
        SoftAssert mobile = new SoftAssert();
        String expect = "The product added";
        String actual = P4.sucssText().getText();
        mobile.assertTrue(actual.contains(expect));
        mobile.assertTrue(P4.sucssText().isDisplayed());
        mobile.assertAll();
        Thread.sleep(1500);

    }

    @And("user go to Shopping Cart page")
    public void userGoToShoppingCartPage() throws InterruptedException {
        Thread.sleep(3000);
        P4.ShopingCartBtn().click();
    }
    @Then("user update Shopping cart Quantity")
    public void userUpdateShoppingCartQuantity() throws InterruptedException {
        Thread.sleep(2000);

        P4.quantylst1().clear();
        P4.quantylst1().sendKeys("2");
        P4.quantylst2().clear();
        P4.quantylst2().sendKeys("1");
        P4.updatCart().click();
        Thread.sleep(2000);

    }
    @And("user remove one of items from cart")
    public void userRemoveOneOfItmesFromCart() throws InterruptedException {
        P4.removeItm().click();
        Thread.sleep(1500);
    }


    @Then("user select size and color")
    public void userSelectSizeAndColor() throws InterruptedException {
        Thread.sleep(2000);
        P4.shoeAdd().click();
        Select sizeN = new Select(P4.size());
        sizeN.selectByVisibleText("11");
        P4.selectColor().click();


    }

    @Then("user select Mobile HTC One Mini Blue")
    public void userSelectMobileHTCOneMiniBlue() throws InterruptedException {
        P4.HTCblue().click();
        P4.ComparBtn().click();
        Thread.sleep(3000);
        SoftAssert get = new SoftAssert();
        String expect = "The product added";
        String actual = P4.sucssText().getText();
        get.assertTrue(actual.contains(expect));
        get.assertTrue(P4.sucssText().isDisplayed());
        get.assertAll();
    }

}
