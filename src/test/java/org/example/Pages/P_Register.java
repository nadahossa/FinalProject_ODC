package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.example.StepDefs.Hooks.driver;

public class P_Register {

    public WebElement Register(){
        return driver.findElement(By.className("ico-register"));
    }
    public WebElement Mgender(){
        return driver.findElement(By.id("gender-male"));
    }
    public WebElement Fgender(){
        return driver.findElement(By.id("gender-female"));
    }
    public WebElement FName(){
        return driver.findElement(By.id("FirstName"));
    }
    public WebElement LName(){
        return driver.findElement(By.id("LastName"));
    }
    public WebElement D(){
        return driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));

    }
    public WebElement M(){

        return driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));

    }
    public WebElement Y(){

        return driver.findElement(By.xpath("//select[3]"));

    }
    public WebElement Email(){
        return driver.findElement(By.id("Email"));
    }
    public WebElement Password(){
        return driver.findElement(By.id("Password"));
    }
    public WebElement confirmPassword(){
        return driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement RegisterButton(){
        return driver.findElement(By.id("register-button"));
    }
    public WebElement MessageReg(){
        return driver.findElement(By.className("result"));
    }

}
