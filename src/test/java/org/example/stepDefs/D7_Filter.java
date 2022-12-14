package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P_3_HomePage;
import org.testng.Assert;


public class D7_Filter {

    P_3_HomePage P3 = new P_3_HomePage();


    @Given("user select Apparel and go to sub category Shoes")
    public void userSelectApparelAndGoToSubCategoryShoes() {
        P3.aparel().click();
        P3.sho().click();

    }

    @Then("user select color red from CheckBox")
    public void uesrSelectColorRedFromCheckBox() {
        P3.red().click();

    }

    @Then("filter option view results")
    public void filterOpthionViewResults() throws InterruptedException {
        Thread.sleep(2000);
        for (double x = 0; x < P3.prices().size(); x++ )
        {
            String value = P3.pricesbox().get((int) x).getText();
            System.out.println("Itemes :" + value);
            Assert.assertTrue(true, value);
        }

    }
}
