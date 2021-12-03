/** Section 25: Extent Reporting Basics
for Test Execution results in Framew…*/

package jayashreeautomation1.ExtentReports2Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	
	
	ExtentReports extent;
	
	@BeforeTest
	
	
	public void config() {
		
		String path =System.getProperty("user.dir")+"\\reports\\index.html";
		System.out.println(path);//stores the report here

		ExtentSparkReporter reporter = new ExtentSparkReporter(path);

		reporter.config().setReportName("Weblolo Automation Results");

		reporter.config().setDocumentTitle("Ende Test Results");
		
		extent =new ExtentReports();

		extent.attachReporter(reporter);

		extent.setSystemInfo("Tester", "Jayashree Hemmige");
		
		
		
		
	}
	
	
	@Test
	
	public void initialDemo() {
		
		extent.createTest("LOLO Demo");
		
		System.setProperty("webdriver.chrome.driver", "/Users/jayashreehemmige/Downloads/chromedriver");

		WebDriver driver =new ChromeDriver();

		driver.get("https://rahulshettyacademy.com");

		System.out.println(driver.getTitle());
		
		extent.flush();
	}

}
