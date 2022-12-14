package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P_2_LoginAndRest {

    public WebElement logBtn()
    {
        return Hooks.driver.findElement(By.className("ico-login"));
    }

    public WebElement email() {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement password() {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement login() {return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
    }

    public WebElement pageUrl() {
        return Hooks.driver.findElement(By.className("ico-account"));
    }
    public WebElement forPass(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));
    }
    public WebElement sEmail(){
        return Hooks.driver.findElement(By.name("send-email"));
    }
    public WebElement actualtxt(){
        return Hooks.driver.findElement(By.className("content"));
    }

}
