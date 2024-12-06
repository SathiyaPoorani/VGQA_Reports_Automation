
package testcase;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import maventest.maven_testng.Configuration;


public class ODS_test {
    
    private static final String SCREENSHOT_PATH = System.getProperty("user.dir") + "/test-output/screenshots/";
    private WebDriverWait wait;
    public Configuration config;
    private WebDriver driver;
    
    @BeforeClass
    public void setupClass() {
        // Create screenshots directory if it doesn't exist
        new File(SCREENSHOT_PATH).mkdirs();
    }
    
    @BeforeMethod
    public void setup() throws InterruptedException {
        driver = new ChromeDriver(); 
        //wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        config = new Configuration(driver);
        config.openBrowserODS();
        config.LoginCredentialsODS();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    
    @AfterMethod
    public void tearDown(ITestResult result) {
        // Take screenshot on test failure
        if (result.getStatus() == ITestResult.FAILURE) {
            takeScreenshot("FAILED_" + result.getName());
        }
        
        if (driver != null) {
            driver.quit();
        }
    }
    
    private     void    takeScreenshot(String baseFileName) {
        try {
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
            String fileName = baseFileName + "_" + timestamp + ".png";
            
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File destination = new File(SCREENSHOT_PATH + fileName);
            FileUtils.copyFile(screenshot, destination);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(description = "Verify config button functionality", groups = {"smoke"})
    public void TC_ODS_01() throws InterruptedException {
        config.clickconfig();
    }

    @Test(description = "Verify Survey Programs section", groups = {"regression"})
    public void TC_ODS_02() throws InterruptedException {
        config.clickconfig();
        config.clickprograms();
    }
   
    @Test(description = "Verify Survey Programs with screenshot", groups = {"regression"})
    public void TC_ODS_03() throws InterruptedException {
        config.clickconfig();
        config.clickprograms();
        takeScreenshot("survey_programs1hhhh1");
    }


    @Test(description = "Verify People page with screenshot", groups = {"regression"})
    public void TC_ODS_04() throws InterruptedException {
        config.clickconfig();
        config.clickpeople();
        takeScreenshot("people_page");
    }
 
    @Test(description = "Verify People Export functionality", groups = {"regression"})
    public void TC_ODS_05() throws InterruptedException {
        config.clickconfig();
        config.clickpeople();
        config.clickpplexport();
    }
 
    @Test(description = "Verify People page buttons", groups = {"regression"})
    public void TC_ODS_06() throws InterruptedException {
        config.clickconfig();
        config.clickpeople();
        config.checkpplpagebutton();
    }

    //Refactor Required
    @Test(description = "verify Attribute buttons" , groups ={"regression"})
    public void TC_ODS_07() throws InterruptedException {
        config.clickconfig();
        config.clickpeople();
        config.attrbuttoncheck();
    }
   
    @Test(description ="Verify Company admin in User Roles", groups={"regression"})
    public void TC_ODS_08() throws InterruptedException
    {
        config.clickconfig();
        config.clickpeople();
        config.clickcompanyadmin();
        //Thread.sleep(5000);
    }

    @Test(description ="Verify User Role1 in User Roles", groups={"regression"})
    public void TC_ODS_09() throws InterruptedException
    {
        config.clickconfig();
        config.clickpeople();
        config.clickUserrole1();
        Thread.sleep(5000);
    }
 
    @Test(description="Verify User role 2 in user roles", groups={"regression"})
    public void TC_ODS_10() throws InterruptedException
    {
        config.clickconfig();
        config.clickpeople();
        config.clickUserrole2();
        Thread.sleep(5000);
    }

    @Test(description="Verify User Attribute and Optional Attributes button",groups={"smoke"})
    public void TC_ODS_11() throws InterruptedException
    {
        config.clickconfig();
        config.clickpeople();
        config.peopleActions_button();
        config.clickuserattribute();
        //config.CAV_Button();

    }

    @Test(description="Verify Custom Attribute Visibility",groups={"smoke"})
    public void TC_ODS_12() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        config.clickconfig();
        config.clickpeople();
        config.peopleActions_button();
        config.clickuserattribute();
        config.CAV_Button();
        takeScreenshot("CAV");
    }

    @Test(description="Verify People Text",groups={"smoke"})
    public void TC_ODS_13() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        config.clickconfig();
        config.clickpeople();
        String expectedText="Active Employees (650)";
        String actualText = config.PeopleText();
        Assert.assertEquals(actualText, expectedText);
        System.out.println("Text matched");
    }

    @Test(description="Verify Whether we can click on any user or not")
    public void TC_ODS_14() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        config.clickconfig();
        config.clickpeople();
        config.clickanyuserbutton();
    }


    @Test(description="verify whether pencil button is displayed")
    public void TC_ODS_15() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        config.clickconfig();
        config.clickpeople();
        config.clickanyuserbutton();
        config.checkPencilButton();
    }


    @Test(description="Verify the Searchbox",groups={"smoke"})
    public void TC_ODS_16() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        config.clickconfig();
        config.clickpeople();
        config.searchBox("test");
        Thread.sleep(3000);
    }


    @Test(description="Verify the different Pages",groups={"smoke"})
    public void TC_ODS_17() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        config.clickconfig();
        config.clickpeople();
        config.Paginationbutton();
        Thread.sleep(3000);
    }

    @Test(description="Verify Import Button",groups={"smoke"})
    public void TC_ODS_18() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        config.clickconfig();
        config.clickpeople();
        config.ImportButton();
        Thread.sleep(3000);
    }

    @Test(description="Verify back Button",groups={"smoke"})
    public void TC_ODS_19() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        config.clickconfig();
        config.clickpeople();
        config.backbutton();
        Thread.sleep(3000);
    }

    @Test(description="Verify back Button",groups={"smoke"})
    public void TC_ODS_20() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        config.clickconfig();
        config.clickpeople();
        String expectedText="650";
        String actualText = config.Usercount();
        Assert.assertEquals(actualText, expectedText);
        System.out.println("Text matched");
    }
}
   