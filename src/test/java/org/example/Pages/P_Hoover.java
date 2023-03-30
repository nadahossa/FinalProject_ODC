package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDefs.Hooks.driver;

public class P_Hoover {
    public WebElement Computer(){
        WebElement Computerbutton= driver.findElement(By.cssSelector("a[href=\"/computers\"]"));
        return Computerbutton;
    }
    public WebElement Desktop(){
        WebElement Desktop= driver.findElement(By.cssSelector("a[href=\"/computers\"]"));
        return Desktop;
    }
    public WebElement pagetitle(){
        return driver.findElement(By.className("page-title"));
    }

}
