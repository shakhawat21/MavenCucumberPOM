package steps;

import org.openqa.selenium.support.PageFactory;

import basePack.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BMInewPage;


public class BMInewStepDefination extends BaseClass{
	BMInewPage bmiP;
	
	@Given("user is on BMI Calculator Webpages")
	public void user_is_on_BMI_Calculator_Webpages() {
		bmiP=PageFactory.initElements(driver,BMInewPage.class );
		driver.get("https://bnscorporation.com/bmi-calculator/");


	}

	@When("he will enter {string} in height_field and {string} in weight _field")
	public void he_will_enter_in_height_field_and_in_weight__field(String heit, String weit) {
		bmiP=PageFactory.initElements(driver,BMInewPage.class );
		bmiP.EnterHeight(heit);
		bmiP.EnterWeight(weit);
	    
	}

	@When("he Click on Calculate Button")
	public void he_Click_on_Calculate_Button() {
		bmiP=PageFactory.initElements(driver,BMInewPage.class );
		bmiP.ClickCalculateBMI();

	}

	@Then("he should get BMI {string} and Catagory {string}")
	public void he_should_get_BMI_and_Catagory(String bmiInd, String bmiCat) {
		bmiP=PageFactory.initElements(driver,BMInewPage.class );
		bmiP.verifyBMIValue(bmiInd);
		bmiP.verifyBMICategory(bmiCat);

	}

	@Then("he should get message {string}")
	public void he_should_get_message(String MessageRcvd) {
		bmiP=PageFactory.initElements(driver,BMInewPage.class );
		bmiP.verifyMessage(MessageRcvd);

	}

}
