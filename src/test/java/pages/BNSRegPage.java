package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import basePack.BaseClass;

public class BNSRegPage extends BaseClass{
	
	@FindBy(how=How.XPATH, using ="html/body/div/div[2]/form/input[1]")
    WebElement firstname;
    public void enterFirstName(String FN) {
        List<WebElement>list=driver.findElements(By.id("FN"));
        for(int i=0; i<list.size(); i++) {
            firstname=list.get(i);
            int x=firstname.getLocation().getX();
            if(x!=0) {
                firstname.sendKeys(FN);
                break;
            }
        }
        
    }
    @FindBy(how=How.NAME, using ="LName")
    WebElement lastname;
    public void enterLastName(String LN) {
        lastname.sendKeys(LN);
    }
    @FindBy(how=How.NAME, using ="Email")
    WebElement email;
    public void enterEmail(String EM) {
        email.sendKeys(EM);
    }
    @FindBy(how=How.NAME, using ="Pass")
    WebElement password;
    public void enterPassword(String PW) {
        password.sendKeys(PW);
    }
    @FindBy(how=How.NAME, using ="Phone")
    WebElement phone;
    
    public void enterPhone(String Pho) {
        phone.sendKeys(Pho);
    }
    @FindBy(how=How.NAME, using ="month")
    WebElement Month;
    public void selectMonth(String MN) {
        Select mselect=new Select(Month);
        mselect.selectByVisibleText(MN);
    }
    @FindBy(how=How.NAME, using ="day")
    WebElement Day;
    public void selectDay(String DY) {
        Select dayselect=new Select(Day);
        dayselect.selectByVisibleText(DY);
    }
    @FindBy(how=How.NAME, using ="year")
    WebElement Year;
    public void selectYear(String YR) {
        Select mselect=new Select(Year);
        mselect.selectByVisibleText(YR);
    }
    @FindBy(how=How.XPATH, using ="//*[@id=\"content\"]/article/div/div/div/div/section[1]/div/div/div/div/div/div/div/div/div[2]/input[7]")
    WebElement male;
    
    public void clickMale() {
        male.click();
    }
    @FindBy(how=How.XPATH, using ="//*[@id=\"content\"]/article/div/div/div/div/section[1]/div/div/div/div/div/div/div/div/div[2]/input[9]")
    WebElement female;
    
    public void clickFemale() {
        female.click();
    }
    
    @FindBy(name="SSN")
	WebElement SSNCheckBTN;
	public void clickSsnBTN() {
		SSNCheckBTN.click();
	}
    
    @FindBy(how=How.XPATH, using ="//*[@id=\"content\"]/article/div/div/div/div/section[1]/div/div/div/div/div/div/div/div/div[2]/input[12]")
    WebElement submitBtn;
    
    public void clickSubmit() {
        submitBtn.click();;
    }
}
