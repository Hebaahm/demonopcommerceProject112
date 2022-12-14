package org.example.stepDefs;


import io.cucumber.java.en.Given;
import org.example.pages.P_3_HomePage;



public class D4_Search {

    P_3_HomePage P3 = new P_3_HomePage();



    @Given("user search for items in search box For {string}")
    public void userSearchForItemsInSearchBoxFor(String arg0) {
        P3.search().sendKeys(arg0);
        P3.search().submit();


    }

}
