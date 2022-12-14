package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P_1_Registarion {

    public WebElement registBtn()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }

    public WebElement GenderType() {return Hooks.driver.findElement(By.id("gender-female"));}

    public WebElement firstNam()
    {
        return  Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement lastNam()
    {
        return  Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement Birthday()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement Birthmonth()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement Birthyear()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }


    public WebElement email()
    {
        return  Hooks.driver.findElement(By.id("Email"));
    }



    public WebElement passtxt()
    {
        return  Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirmpassTxt()
    {
        return  Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement creatBtn() {return Hooks.driver.findElement(By.id("register-button"));}
    public WebElement result()
    {
        return  Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }
    public WebElement pagebody(){return Hooks.driver.findElement(By.className("page-body"));}
    public WebElement txtcolor(){return Hooks.driver.findElement(By.className("result"));}

}
