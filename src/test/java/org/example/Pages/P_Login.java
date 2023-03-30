package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.StepDefs.Hooks.driver;

public class P_Login {
    public WebElement loginBtn(){
        return driver.findElement(By.className("ico-login"));
    }
    public WebElement email(){
        return driver.findElement(By.id("Email"));
    }
    public WebElement Password(){
        return driver.findElement(By.id("Password"));
    }
    public WebElement butonlogin(){
        return driver.findElement(By.className("login-button"));
    }
    public WebElement Verfiylogin(){
        return driver.findElement(By.className("ico-account"));
    }
    public  WebElement Errormessage(){
        return driver.findElement(By.className("message-error"));
    }
}
