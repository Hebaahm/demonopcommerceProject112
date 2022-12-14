package org.example.stepDefs;

import io.cucumber.java.en.Then;
import org.example.pages.P_5_WishList;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D11_Compare {

    P_5_WishList P5 = new P_5_WishList();


    @Then("user add mobile to compare list")
    public void userAddMobileToCompareList() throws InterruptedException {
        P5.ComparBt().click();
        Thread.sleep(3000);
        SoftAssert getto = new SoftAssert();
        String expect = "The product added";
        String actual = P5.sucssText().getText();
        getto.assertTrue(actual.contains(expect));
        getto.assertTrue(P5.sucssText().isDisplayed());
        getto.assertAll();

    }

    @Then("user go to Compare Page")
    public void userGoToComparePage() {
        P5.ComparePG().click();
        SoftAssert h11 = new SoftAssert();
        String expect = "Compare products";
        String actual = P5.pageTxt().getText();
        h11.assertTrue(actual.contains(expect));
        h11.assertTrue(P5.comparetxt().isDisplayed());
        h11.assertAll();
        for (double x = 0; x < P5.product().size(); x++) {
            String value = P5.product().get((int) x).getText();
            System.out.println("List Items : " + value);
            Assert.assertTrue(true, value);

        }

    }
}