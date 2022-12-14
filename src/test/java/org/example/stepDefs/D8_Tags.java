package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P_3_HomePage;


public class D8_Tags {

    P_3_HomePage P3 = new P_3_HomePage();

    @Given("user select category Apparel")
    public void userSelectCategoryApparel() {
        P3.aparel().click();

    }

    @Then("user select tag name from list")
    public void userSelectTagNameFromList() throws InterruptedException {
        P3.tag1().click();
        Thread.sleep(3000);


    }

    @And("user could select another tag")
    public void userCouldSelectAnotherTag() throws InterruptedException {
        P3.tag2().click();
        Thread.sleep(1500);

    }
}
