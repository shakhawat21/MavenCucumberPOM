package basePack;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	protected static ExtentHtmlReporter extentHtmlreport;
	protected static ExtentReports report;
	protected static ExtentTest test;
	

	
	protected static WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
		//========================For Browser =========================================
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//==========For_Extent Report=============================
		
		extentHtmlreport=new ExtentHtmlReporter(System.getProperty("user.dir")+"\\test-output\\HtmlExtentReport.html");
		extentHtmlreport.config().setDocumentTitle("Automation Testing Report");
		extentHtmlreport.config().setReportName("Funtional Testing");
		extentHtmlreport.config().setTheme(Theme.STANDARD);
		
		report=new ExtentReports();
		report.attachReporter(extentHtmlreport);
		report.setSystemInfo("Host Name", "localhost");
		report.setSystemInfo("OS", "Windows");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("Testing Name", "Automation");
		report.setSystemInfo("Automation Tool", "Selenium");
		report.setSystemInfo("Tester Name", "Hossain");

	}
	@AfterMethod         ///Reports for Fail,Skip or Success (ITestResult)
	public void creatingReport(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, "Failed Test is : " +result.getName());
			test.log(Status.FAIL, "Failed Test is : " +result.getThrowable());
			
			
			String screenshotPath=getScreenShot(result.getName());
			test.addScreenCaptureFromPath(screenshotPath);
	
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP, "Skipped Test is:  "+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS){
			test.log(Status.PASS, "Passed Test is:  "+result.getName());
		}
		
	}           ///For Screen Shot ,[ dateName(*s), File, destination(*s), FileUtils And return ]*s=string
	public static String getScreenShot(String screenShotName) throws IOException {
		String dateName=new SimpleDateFormat("yyyy-mm-dd-hh-MM-ss").format(new Date());  ///For Auto Date
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); ///For screenshot
		String destination=System.getProperty("user.dir")+"\\ScreenShot\\"+screenShotName+" "+dateName+".png"; ///Destination
		FileUtils.copyFile(f, new File(destination));
		return destination;
	}
	
	@AfterTest
	public void teardown() {
		report.flush();
		//driver.quit();
	}
	
}