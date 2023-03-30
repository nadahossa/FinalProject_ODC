package org.example.Pages;

import io.cucumber.messages.types.Hook;
import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.StepDefs.Hooks.driver;

public class P_Search {
    public WebElement Searchbar(){

        //return driver.findElement(By.id("small-searchterms"));
        WebElement Searchbar = Hooks.driver.findElement(By.id("small-searchterms"));
        return Searchbar;
    }
    public WebElement SearchBottom(){

       // return driver.findElement(By.className("search-box-button"));
        WebElement Searchbutton = Hooks.driver.findElement(By.className("search-box-button"));
        return Searchbutton;
    }
    public WebElement Searchresiult(){
        return driver.findElement(By.className("search-results"));
    }
    public List<WebElement> productList ()
    {
        List <WebElement> productTitles = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a"));
        return productTitles;
    }
}
