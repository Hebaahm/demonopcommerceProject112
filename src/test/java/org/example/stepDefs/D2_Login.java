package org.example.stepDefs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P_2_LoginAndRest;
import org.testng.asserts.SoftAssert;


public class D2_Login {

    P_2_LoginAndRest P2 = new P_2_LoginAndRest();


    @Given("user go to login page")
    public void loginPage() throws InterruptedException {
        P2.logBtn().click();
        Thread.sleep(1500);
    }

    @Then("user enter email {string} and Password {string}")
    public void userEnterEmailAndPassword(String arg0, String arg1) {
        P2.email().sendKeys(arg0);
        P2.password().sendKeys(arg1);

    }

    @When("user clicks on login button")
    public void userClicksOnLoginButton() {
    P2.login().click();

    }
    @Then("Screen Navigate to home page")
    public void screenNavigateToHomePage() throws InterruptedException {

        SoftAssert soft = new SoftAssert();

        soft.assertTrue(P2.pageUrl().isDisplayed(), "login page");
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/", "Page Is Right");

        Thread.sleep(3000);
        soft.assertAll();
    }


}
