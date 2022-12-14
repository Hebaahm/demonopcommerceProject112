package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P_5_WishList;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D10_Wish {

    P_5_WishList P5 = new P_5_WishList();

    @Then("user add item to Wishlist")
    public void userAddItemToWishlist() throws InterruptedException {
        P5.wBt25().click();
        Thread.sleep(3000);
        SoftAssert hasto = new SoftAssert();
        String expect = "The product is added";
        String actual = P5.sucssText().getText();
        hasto.assertTrue(actual.contains(expect));
        hasto.assertTrue(P5.sucssText().isDisplayed());
        hasto.assertAll();

    }

    @And("user select Windows-8-Pro and added to Wishlist")
    public void userSelectWindowsWishlist() throws InterruptedException {
        P5.winadd().click();
        P5.wBt11().click();
        Thread.sleep(3000);
        SoftAssert buy = new SoftAssert();
        String expect = "The product added ";
        String actual = P5.sucssText().getText();
        buy.assertTrue(actual.contains(expect));
        buy.assertTrue(P5.sucssText().isDisplayed());
        buy.assertAll();

    }

    @Then("user go to Wishlist page and view items")
    public void userGoToWishlistPageAndViewItems() throws InterruptedException {
        Thread.sleep(3000);
        P5.wPageBt().click();
        Thread.sleep(3000);
        for (double x = 0; x < P5.product().size(); x++) {
            String value = P5.product().get((int) x).getText();
            Assert.assertTrue(true, value);

        }
    }
}