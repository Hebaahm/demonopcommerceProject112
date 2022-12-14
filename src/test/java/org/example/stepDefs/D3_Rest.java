package org.example.stepDefs;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P_2_LoginAndRest;
import org.testng.asserts.SoftAssert;


public class D3_Rest {

    P_2_LoginAndRest P2 = new P_2_LoginAndRest();


    @Then("user clicks on Forget password Link")
    public void userClicksOnForgetPasswordLink() {
        P2.forPass().click();

    }

    @Then("user enter email {string}")
    public void userEnterEmail(String arg0) {
        P2.email().sendKeys(arg0);

    }

    @When("user clicks on Recover button")
    public void userClicksOnRecoverButton() {
    P2.sEmail().click();
    }

    @Then("Success massage appears in green on screen")
    public void successMassageAppearsInGreenOnScreen() throws InterruptedException {
        String expectedResult = "Email with instructions has been sent to you.";
        String actualResult = P2.actualtxt().getText();

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(actualResult.contains(expectedResult));
        soft.assertTrue(P2.actualtxt().isDisplayed(), "message appeare");

        System.out.println("Your Actual Result is :" + actualResult);

        Thread.sleep(3000);
        soft.assertAll();
    }


}
