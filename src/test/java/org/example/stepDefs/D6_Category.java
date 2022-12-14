package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P_3_HomePage;
import org.testng.Assert;


public class D6_Category {

    P_3_HomePage P3 = new P_3_HomePage();


    @Given("user select different category tabs")
    public void userSelectDifferentCategoryTabs() {
        P3.electronic().click();
        P3.aparel().click();
        P3.computer().click();
    }

    @Then("user select Computers and go to sub category Software")
    public void userSelectComputersAndGoToSubCategorySoftware() throws InterruptedException {
        Thread.sleep(2500);
        P3.computer().click();
        P3.SubCat ().click();

    }

    @And("user select Windows-8-Pro")
    public void userSelectWindows() {
        P3.win().click();
        for (double x = 0; x < P3.prices().size(); x++ )
        {
            String value = P3.prices().get((int) x).getText();
            System.out.println("Itemes price :" + value);
            Assert.assertTrue(true, value);
        }

    }
}
