package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P_Hoover;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import static org.example.StepDefs.Hooks.driver;

public class SD_Hoover {
    P_Hoover Hoover=new P_Hoover();
    @Given("Hoover to computer category")
    public void hovertocomputer(){
        Actions actions=new Actions(driver);
        actions.moveToElement(Hoover.Computer()).perform();
    }
    @When("select desktop category")
    public void selectdesktop(){
        Actions actions=new Actions(driver);
        actions.moveToElement(Hoover.Desktop()).click().perform();
    }
    @Then("verify select desktop category")
    public void Selecteddesktop(){
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/computers");
        String title=Hoover.pagetitle().getText();
        soft.assertNotEquals(title,title.toLowerCase());
        String titlespace=Hoover.pagetitle().getText().trim();
        soft.assertEquals(title,titlespace);
        soft.assertAll();
    }

}
