package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P_3_HomePage {
    public WebElement Select(){
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> prices()
    {
        List<WebElement> prices = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        return prices;
    }
    public List<WebElement> pricesbox()
    {
        List<WebElement> prices = Hooks.driver.findElements(By.className("prices"));
        return prices;
    }
    public List<WebElement> pricesValu()
    {
        List<WebElement> prices = Hooks.driver.findElements(By.className("product-price"));
        return prices;
    }

public List<WebElement> productlist()
{
    List<WebElement> Plist = Hooks.driver.findElements(By.className("product-title"));
    return Plist;
}
    public WebElement computer() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/computers\"]"));
    }
    public WebElement aparel() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));
    }
    public WebElement electronic() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/electronics\"]"));
    }
    public WebElement SubCat () {
        return Hooks.driver.findElement(By.cssSelector("h2 a[href=\"/software\""));
    }
    public WebElement win(){
        return Hooks.driver.findElement(By.cssSelector("h2 a[href=\"/windows-8-pro\"]"));
    }
    public List<WebElement> TextItm()
    {
        List<WebElement> TextL = Hooks.driver.findElements(By.className("product-title"));
        return TextL;
    }
    public WebElement sho(){
        return Hooks.driver.findElement(By.cssSelector("h2 a[href=\"/shoes\"]"));
    }
    public WebElement red() {
        return Hooks.driver.findElement(By.id("attribute-option-15"));
    }
    public WebElement tag1() { return Hooks.driver.findElement(By.cssSelector("a[href=\"/awesome\"]"));}
    public WebElement tag2() { return Hooks.driver.findElement(By.cssSelector("a[href=\"/cool\"]"));}
    public WebElement fText () {
        return Hooks.driver.findElement(By.className("page-title"));
    }
    public WebElement search() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

}
