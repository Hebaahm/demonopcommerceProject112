package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P_1_Registarion;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;


public class D1_Registre {

    P_1_Registarion P1 = new P_1_Registarion();

    @Given("user go to register page")
    public void registerPage()  {
        P1.registBtn().click();
        System.out.println("Register page open");
    }


    @Then("user select gender type")
    public void userSelectGenderType() {
        P1.GenderType().click();
    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String arg0, String arg1) {
        P1.firstNam().sendKeys(arg0);
        P1.lastNam().sendKeys(arg1);
    }

    @Then("user enter date of birth")
    public void userEnterDateOfBirth() throws InterruptedException {
        Select select = new Select(P1.Birthday());
        select.selectByIndex(4);

        select = new Select(P1.Birthmonth());
        select.selectByVisibleText("May");

        select = new Select(P1.Birthyear());
        select.selectByVisibleText("1981");

        Thread.sleep(1500);
    }

    @Then("user enter email {string} field and company name and check options")
    public void userEnterEmailField(String arg0) {
        P1.email().sendKeys(arg0);

    }

    @And("user enter Password fields {string} {string}")
    public void userEnterPassword(String arg0, String arg1) {
        P1.passtxt().sendKeys(arg0);
        P1.confirmpassTxt().sendKeys(arg1);
    }

    @Then("user clicks on register button")
    public void userClicksBut() {
        P1.creatBtn().submit();
    }

    @Then("success message is displayed in Screen")
    public void successMsgIsShown() throws InterruptedException {
        String expectedResult = "Your registration completed";
        String actualResult = P1.pagebody().getText();
        String textColor = P1.txtcolor().getCssValue("color");
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(actualResult.contains(expectedResult));
        soft.assertTrue(P1.result().isDisplayed(), "Register Successfully");
        soft.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/registerresult/1?returnUrl=/", "Page Is Right");
        System.out.println("Your Actual Result is :" + actualResult);
        System.out.println(textColor);
        Thread.sleep(3000);
        soft.assertAll();
    }
}
