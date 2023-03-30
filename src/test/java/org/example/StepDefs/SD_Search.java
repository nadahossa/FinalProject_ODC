package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P_Search;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class SD_Search {
    P_Search Search=new P_Search();
    String searchTerm=null;
    SoftAssert soft= new SoftAssert();

    @Given("^Enter item name\"(.*?)\"")
    public void EnterName(String searchTerm){
        //Search.Searchbar().click();
        Search.Searchbar().sendKeys(searchTerm);
            this.searchTerm=searchTerm;
        }

    @When("click to search icon")
    public void SearchButton(){
        Search.SearchBottom().click();
    }
    @Then("verify the search done by name")
    public void VerfiySearchbyname(){
      //  WebElement Account= Search.Searchresiult().getSize();
        int numberOfItems =Search.productList().size();
        int check;
        soft.assertFalse(numberOfItems<=0,"No Relevant Search Items For This Search Term");
        soft.assertAll();
        ArrayList<String> productListS=new ArrayList();
        for(int i =0;i<numberOfItems;i++)
        {
            productListS.add(Search.productList().get(i).getText());
            check= productListS.get(i).toUpperCase().indexOf(searchTerm.toUpperCase());
            soft.assertTrue( check==-1,"One Of Search Results Is Irrelevant To Search Term");
            soft.assertAll();
        }
    }
    @Given("Enter serial number of the product")
    public void enterserial(){
        Search.Searchbar().sendKeys("AS_551_LP");

    }
    @Then("verify the search done by serial")
    public void VerfiySearchbyserial(){
        //  WebElement Account= Search.Searchresiult().getSize();

    }

}
