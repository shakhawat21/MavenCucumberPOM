package steps;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.support.PageFactory;

import basePack.BaseClass;
import dataHelper.BDDExcelFileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BNSRegPage;

public class BNSExcelStepDefination extends BaseClass{
	BNSRegPage bnsp=PageFactory.initElements(driver, BNSRegPage.class);
    List<HashMap<String,String>>datamap;
    
 public BNSExcelStepDefination() throws IOException{

       datamap= BDDExcelFileReader.getdata(System.getProperty("user.dir")+"//src//test//resources//TestData//BNSData.xlsx", "Data1");
    }

	@Given("User is on BNS login webpage")
	public void user_is_on_BNS_login_webpage() {
		driver.get("https://bnscorporation.com/bns-login/");

	}

	@When("User will enter and click and select {string}")
	public void user_will_enter_and_click_and_select(String string) throws InterruptedException {
		 int index=Integer.parseInt(string)-1;
	        
	        bnsp.enterFirstName(datamap.get(index).get("First Name"));    
	        bnsp.enterLastName(datamap.get(index).get("Last Name"));
	        bnsp.enterEmail(datamap.get(index).get("Email"));
	        bnsp.enterPassword(datamap.get(index).get("Password"));
	        bnsp.enterPhone(datamap.get(index).get("Phone"));
	        
	        bnsp.selectMonth(datamap.get(index).get("Month"));
	        
	        
	        bnsp.selectDay(datamap.get(index).get("Day"));
	        
	        Thread.sleep(3000);
	        bnsp.selectYear(datamap.get(index).get("Year"));
	        
	        if(datamap.get(index).get("Gender").equalsIgnoreCase("Male")) {
	            bnsp.clickMale();
	        }
	        else {
	            bnsp.clickFemale();
	        }
	        Thread.sleep(5000);
	    }


	

	@When("User click on submit button")
	public void user_click_on_submit_button() {
		bnsp.clickSubmit();

	}

	@Then("User should create new account successfully\"")
	public void user_should_create_new_account_successfully() {
		 System.out.println("User has created new account successfully");
	    
	}
	
	}




