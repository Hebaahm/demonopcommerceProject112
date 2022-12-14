package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P_5_WishList {

    public WebElement wBt11()
    {
        return Hooks.driver.findElement(By.id("add-to-wishlist-button-11"));
    }
    public WebElement wBt25()
    {
        return Hooks.driver.findElement(By.id("add-to-wishlist-button-25"));
    }
    public WebElement winadd(){return Hooks.driver.findElement(By.cssSelector("h2 a[href=\"/windows-8-pro\"]"));}
    public WebElement wPageBt(){return Hooks.driver.findElement(By.className("wishlist-label"));}
    public List<WebElement> product()
    {
        List<WebElement> productlist = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr[3]"));
        return productlist;
    }
    public WebElement sucssText () {
        return Hooks.driver.findElement(By.className("content"));
    }
    public WebElement ComparBt(){return Hooks.driver.findElement(By.className("compare-products"));}
    public WebElement pageTxt() {
        return Hooks.driver.findElement(By.className("page-title"));
    }
    public WebElement ComparePG(){return Hooks.driver.findElement(By.cssSelector("a[href=\"/compareproducts\"]"));}
    public WebElement comparetxt () {
        return Hooks.driver.findElement(By.className("page-title"));
    }

}
