package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P_Login;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.StepDefs.Hooks.driver;

public class SD_Login {
    P_Login Login=new P_Login();
    @Given("navigate to url")
    public void urlwebsite(){
        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @And("Go to login page")
    public void loginpage(){

        Login.loginBtn().click();

    }
    @When("Enter valid email and valid password")
    public void entervaliddata(){
        Login.email().sendKeys("nada@yahoo.com");
        Login.Password().sendKeys("123456");
    }
    @And("click on login button")
    public void buttonlogin(){
        Login.butonlogin().click();

    }
    @Then("verify the user login successfully")
    public void signin(){
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");

        soft.assertTrue(Login.Verfiylogin().isDisplayed());
        soft.assertAll();
    }


    @When("Enter invalid email and valid password")
    public void invalid_email(){
        Login.email().sendKeys("hossam@gmail.com");
        Login.Password().sendKeys("123456");
    }

    @Then("verify the user don't login successfully")
    public void dontlogin(){
        SoftAssert soft=new SoftAssert();
        String color=driver.findElement(By.className("message-error")).getCssValue("color");
        soft.assertTrue(color.contains("228, 67, 75, 1"));
        String message=Login.Errormessage().getText();
        soft.assertTrue(message.contains("Login was unsuccessful."));
        soft.assertAll();

    }
}
