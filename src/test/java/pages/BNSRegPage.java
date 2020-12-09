package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import basePack.BaseClass;

public class BNSRegPage extends BaseClass{
	
	@FindBy(how=How.ID, using="FN")
	WebElement firstname;
	
	public void enterFirstName(String fname) {
		List<WebElement>list=driver.findElements(By.id("FN"));
		for(int i=0; i<list.size();i++) {
			firstname=list.get(i);
			int x=firstname.getLocation().getX();
			if(x!=0) {
				firstname.sendKeys(fname);
				break;
			}
		
		}
		
	}
	@FindBy(id="LN")
	WebElement lastname;
	public void enterLastName(String lname) {
		lastname.sendKeys(lname);
	}
	@FindBy(xpath="//*[@id=\"EM\"]")
	WebElement email;
	public void enterEmail(String Em) {
		email.sendKeys(Em);
	}
	
	@FindBy(name="Pass")
	WebElement password;
	public void enterPassword(String pWord) {
		password.sendKeys(pWord);
	}
	
	@FindBy(id="PH")
	WebElement PhoneNo;
	public void enterPhoneNo(String pNo) {
		PhoneNo.sendKeys(pNo);
	}
	
	@FindBy(id="MN")
	WebElement monthName;
	
	public void SelectMonth(String mon) {
		Select monnthSelect=new Select(monthName);
		monnthSelect.selectByVisibleText(mon);
	}
	
	
	@FindBy(id="DY")
	WebElement daySelect;
	public void selectDay(String day) {
		Select deySelect=new Select(daySelect);
		deySelect.selectByVisibleText(day);
	}
	
	@FindBy(id="YR")
	WebElement yearSelect;
	public void selectYear(String year) {
		Select yerSelect =new Select(yearSelect);
		yerSelect.selectByVisibleText(year);
	}
	@FindBy(xpath="//*[@id=\"content\"]/article/div/div/div/div/section[1]/div/div/div/div/div/div/div/div/div[2]/input[7]")
	WebElement MaleRadioBTN;
	public void clickOnMaleRadioBTN() {
		MaleRadioBTN.click();
	}
	@FindBy(xpath="//*[@id=\"content\"]/article/div/div/div/div/section[1]/div/div/div/div/div/div/div/div/div[2]/input[9]")
	WebElement FemaleRadioBTN;
	public void clickOnFemaleRadioBTN() {
		FemaleRadioBTN.click();
	}
	
	@FindBy(name="SSN")
	WebElement SSNCheckBTN;
	public void clickSsnBTN() {
		SSNCheckBTN.click();
	}
	
	@FindBy(xpath="//*[@id=\"content\"]/article/div/div/div/div/section[1]/div/div/div/div/div/div/div/div/div[2]/input[12]")
	WebElement submitBtn;
	public void clickOnSubmitBTN() {
		submitBtn.click();
	}     

}
