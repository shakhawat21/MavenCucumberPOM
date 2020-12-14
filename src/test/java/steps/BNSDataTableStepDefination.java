package steps;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import basePack.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BNSRegPage;

public class BNSDataTableStepDefination extends BaseClass{
	BNSRegPage bnsp;
	@Given("user is on BNS signup  webpage")
	public void user_is_on_BNS_signup_webpage() {
		bnsp=PageFactory.initElements(driver,BNSRegPage.class);
		 driver.get("https://bnscorporation.com/bns-login/");
	}

	@When("user will enter data from fllowing table")
	public void user_will_enter_data_from_fllowing_table(DataTable table1) {
		bnsp=PageFactory.initElements(driver,BNSRegPage.class);
	    List<String>data1=table1.row(1);
	    bnsp.enterFirstName(data1.get(0));
	    bnsp.enterLastName(data1.get(1));
	    bnsp.enterEmail(data1.get(2));
	    bnsp.enterPassword(data1.get(3));
	    bnsp.enterPhone(data1.get(4));
	    //bnsp.enterPhoneNo(data1.get(4));
	    
	}

	@When("user will select from following table")
	public void user_will_select_from_following_table(DataTable table2) {
		bnsp=PageFactory.initElements(driver,BNSRegPage.class);
		List<String>data2=table2.column(1);
		bnsp.selectMonth(data2.get(0));
		
		bnsp.selectDay(data2.get(1));
		bnsp.selectYear(data2.get(2));
	    
	}

	@When("user will click on following table")
	public void user_will_click_on_following_table(DataTable table3) {
		bnsp=PageFactory.initElements(driver,BNSRegPage.class);
		List<String>data3=table3.column(0);
		bnsp.clickMale();
	}

	@When("user will click on SSN check box")
	public void user_will_click_on_SSN_check_box() {
		bnsp=PageFactory.initElements(driver,BNSRegPage.class);
		bnsp.clickSsnBTN();
	}

	@Then("user should create new account successfully")
	public void user_should_create_new_account_successfully() {
		System.out.println("user should create new account successfully");
	    
	}



}
