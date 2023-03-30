package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P_Currency;
import org.example.Pages.P_Register;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class SD_Currency {
    P_Currency Currency =new P_Currency();

    @Given("Navigate to url")
    public void Register_Page(){

    }
    @When("change currency")
    public void changeCurrency(){
        Select select = new Select(Currency.ChangeCurrency());
        select.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
    }
    @Then("Verify currency change")
    public void Verify_currency_change(){
        SoftAssert soft=new SoftAssert();
        String price = Currency.verfiy_currency().getText();
        soft.assertTrue(price.contains("€"));
        soft.assertAll();

    }

}
