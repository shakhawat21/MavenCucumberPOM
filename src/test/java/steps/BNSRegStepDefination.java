package steps;

import org.openqa.selenium.support.PageFactory;

import basePack.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BNSRegPage;

public class BNSRegStepDefination extends BaseClass{
	BNSRegPage bns;
	@Given("User is on BNS Registration form  webpage")
	public void user_is_on_BNS_Registration_form_webpage() {
		bns=PageFactory.initElements(driver,BNSRegPage.class);
		   driver.get("https://bnscorporation.com/bns-login/");
	    
	}

	@When("User will enter {string} in FirstName field, {string} in LastName field,{string} in Email field, {string} in Password field, {string} in Phone Field")
	public void user_will_enter_in_FirstName_field_in_LastName_field_in_Email_field_in_Password_field_in_Phone_Field(String FN, String LN, String EM, String PW, String PH) {
		bns=PageFactory.initElements(driver,BNSRegPage.class);
		bns.enterFirstName(FN);
		bns.enterLastName(LN);
		bns.enterEmail(EM);
		bns.enterPassword(PW);
		bns.enterPhoneNo(PH);
	    
	}

	@When("User will select birthday {string} from month dropdown, {string} from day dorpdownn, {string} from year dropdown")
	public void user_will_select_birthday_from_month_dropdown_from_day_dorpdownn_from_year_dropdown(String MN, String DY, String YR) {
		bns=PageFactory.initElements(driver,BNSRegPage.class);
		bns.SelectMonth(MN);
		bns.selectDay(DY);
		bns.selectYear(YR);
		
	}

	@When("User will click on {string} radiobutton")
	public void user_will_click_on_radiobutton(String GNDR) throws InterruptedException {
		bns=PageFactory.initElements(driver,BNSRegPage.class);
		if(GNDR.equalsIgnoreCase("Male")) {
			bns.clickOnMaleRadioBTN();
		}else if(GNDR.equalsIgnoreCase("Female")) {
			bns.clickOnFemaleRadioBTN();
		}
	    Thread.sleep(4000);
	}

	@When("User click on SSN Checkbox")
	public void user_click_on_SSN_Checkbox() {
		bns=PageFactory.initElements(driver,BNSRegPage.class);
	    bns.clickSsnBTN();
	}

	@Then("User should create new account successfully")
	public void user_should_create_new_account_successfully() {
		bns=PageFactory.initElements(driver,BNSRegPage.class);
	    System.out.println("User has created new account successfully");
	}

}
