package steps;

import org.openqa.selenium.support.PageFactory;

import basePack.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.FundTransferPage;

public class FundTransferStepsDefination extends BaseClass{
	FundTransferPage fundP;
	
	@Given("user is on Funds Transfer Webpage")
	public void user_is_on_Funds_Transfer_Webpage() {
		
		fundP=PageFactory.initElements(driver,FundTransferPage.class);
		 driver.get("https://bnscorporation.com/fund-transfer/");
	  
	}

	@When("he will select {string} from dropdownBox and enter {string} in amount field")
	public void he_will_select_from_dropdownBox_and_enter_in_amount_field(String UName, String Amnt) {
		fundP=PageFactory.initElements(driver,FundTransferPage.class);
		fundP.SelectPayee(UName);
		fundP.EnterAmount(Amnt);
		
	}

	@When("he will click on Transfer Button")
	public void he_will_click_on_Transfer_Button() {
		fundP=PageFactory.initElements(driver,FundTransferPage.class);
		fundP.ClickTransfer();
	
	}

	@Then("he should get Balance {string} and message {string}")
	public void he_should_get_Balance_and_message(String balances, String Massages) {
		fundP=PageFactory.initElements(driver,FundTransferPage.class);
		fundP.verifyBalance(balances);
		fundP.verifyMessage(Massages);
	}

}
