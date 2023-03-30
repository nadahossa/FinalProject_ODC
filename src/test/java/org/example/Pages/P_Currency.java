package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDefs.Hooks.driver;

public class P_Currency {


    public WebElement ChangeCurrency(){
        return driver.findElement(By.cssSelector("select[id=\"customerCurrency\"]"));
    }
    public WebElement verfiy_currency(){

        return driver.findElement(By.className("prices"));
    }
}
