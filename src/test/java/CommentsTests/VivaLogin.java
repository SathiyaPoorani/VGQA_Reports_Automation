package Tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import CommentsReport.SeleniumBase;

public class VivaLogin extends SeleniumBase implements ITestListener  {
	protected Properties prop;
	ExtentReports extentReport ;
	ExtentSparkReporter spark ;
	ExtentTest test ;
	
	@BeforeClass
	public void ExtentReports(ITestContext context){
	
    spark = new ExtentSparkReporter("ExtentReport.html");
    spark.config().setDocumentTitle("Comments Report");
    spark.config().setReportName("Comments Overview Section");
    spark.config().setTimeStampFormat("EEEE, MMMM dd, YYYY, hh:mm a '('zzz')'");
    extentReport = new ExtentReports();
	extentReport.attachReporter(spark);
	extentReport.setSystemInfo("Testername", "Sathiya");
	}

    public void onTestStart(ITestResult result) {
       test = extentReport.createTest(result.getMethod().getMethodName());
        System.out.println("Test started: " + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test case passed is " + result.getName());
		 test.pass("Test passed");
		 System.out.println("Test passed: " + result.getName()); 
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test case failed is " + result.getMethod().getMethodName());
		test.log(Status.FAIL, "Cause is " + result.getThrowable());
		 test.fail("Test failed: " + result.getThrowable());
		 System.out.println("Test failed: " + result.getName());
    }

	public void onTestSkipped(ITestResult result) {
		test = extentReport.createTest(result.getMethod().getMethodName());
		test.log(Status.SKIP, "Test case Skipped is " + result.getMethod().getMethodName());
		 test.skip("Test skipped");
		 System.out.println("Test skipped: " + result.getName());
	}
	
	@AfterClass
	public void generateReports(ITestContext context) {
	  extentReport.flush();
	}
	
	@BeforeTest
	public void setup() {
		prop = new Properties();
		try {
			prop.load(new FileInputStream("Test_data.properties"));
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
				}
		
		
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://app.vgqa.glint.cloud-dev.microsoft/session/auth");
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='60%'");
		}
	

	
	@AfterTest
	public void quit() {
	  driver.quit();
	  } 

}
