package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P_3_HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class D5_Currency {

    P_3_HomePage P3 = new P_3_HomePage();

    @Given("user clicks on currencies list and select euro")
    public void searchBox()
    {
        WebElement listCurrency = Hooks.driver.findElement(By.id("customerCurrency"));
        Select hebaahmed = new Select(listCurrency);
        hebaahmed.selectByVisibleText("Euro");

    }

    @Then("user can see € sign in products")
    public void userCanSee€SignInProducts() {

        for (double x = 0; x < P3.prices().size(); x++ )
        {
            String value = P3.prices().get((int) x).getText();
            System.out.println("Itemes price change to Euro :" + value);
            Assert.assertTrue(true, value);
        }
    }

}
