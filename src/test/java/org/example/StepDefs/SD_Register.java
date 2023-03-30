package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.StepDefs.Hooks.driver;

public class SD_Register {
    P_Register RegisterPage =new P_Register();

 @Given("go to sign up page")
    public void Register_Page(){
        RegisterPage.Register().click();
    }
    @When("enter valid data")
    public void valid_data(){
        RegisterPage.Fgender().click();
        RegisterPage.FName().sendKeys("Nada");
        RegisterPage.LName().sendKeys("Hossam");
        Select Day = new Select(RegisterPage.D());
        Day.selectByValue("28");
        Select Month = new Select(RegisterPage.M());
        Month.selectByValue("9");
        Select Year = new Select(RegisterPage.Y());
        Year.selectByValue("1991");
        RegisterPage.Email().sendKeys("nada@yahoo.com");
        RegisterPage.Password().sendKeys("123456");
        RegisterPage.confirmPassword().sendKeys("123456");
    }
    @And("click on Register button")
    public void RegButt(){
        RegisterPage.RegisterButton().click();
    }
    @Then("verify the user sign up successfully")
    public void Register(){
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(RegisterPage.MessageReg().isDisplayed());
        String color=driver.findElement(By.className("result")).getCssValue("color");
        soft.assertTrue(color.contains("76, 177, 124, 1"));
        soft.assertAll();
    }

    @When("enter invalid data")
    public void invalid_data(){
        RegisterPage.Fgender().click();
        RegisterPage.FName().sendKeys("Nada");
        RegisterPage.LName().sendKeys("Hossam");
        RegisterPage.Email().sendKeys("nadayahoo.com");
        RegisterPage.Password().sendKeys("123456");
        RegisterPage.confirmPassword().sendKeys("123456");
    }
    @Then("verify the user dont sign up")
    public void invalidRegister(){
     Assert.assertTrue(RegisterPage.RegisterButton().isDisplayed());

    }

}
