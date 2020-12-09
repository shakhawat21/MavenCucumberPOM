package runnerPack;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin={"html:target/cucumber-html-report",
				"json:target/cucumber-reports/cucumber.json",
				"junit:target/cucumber-reports/cucumber.xml"},
		
		
features = "src/test/resources/Features",
glue = {"steps"},

		
tags={"@BMICalculator,@FundTransfer", //features tags
				
"@NoHeightNoWeight,@HeightButNoWeight,"
+ "@ValidPayeeNoAmount,@ValidPayeeInvalidAmount"}//scenario tags

)

public class RunnerTest extends AbstractTestNGCucumberTests{
	

}
