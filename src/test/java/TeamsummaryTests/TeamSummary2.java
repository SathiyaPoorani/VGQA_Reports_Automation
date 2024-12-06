import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.ReportCardObject;
import pageobjects.TestBase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.lang.reflect.Method;

public class TeamSummary2 extends TestBase {
	

	ReportCardObject cardObject = new ReportCardObject(driver);
	
	
    public String testname;

    @BeforeMethod
    public void open(Method tname) throws InterruptedException {
        launchbrowser();
        login2();
        testname = tname.getName();
        System.out.println("Test Name :" +testname);
        glint.clickReportsheading();
        iwait();
        glint.adhoc();
        driver.navigate().refresh();
        iwait();
        glint.adhoc();
//        glint.clickReportsheading();
        glint.clickAdHoc();
        zoomout();
    }

    @AfterMethod
    public void close() throws IOException {
        takescreenshot(testname);
        closebrowser();
    }
    
    @Test
    //To Verify team summary report card is available.
    public void TC_001() throws InterruptedException, IOException {
        Thread.sleep(2000);
        Assert.assertEquals(report.getreportcardheading(),"Team Summary");
        takescreenshot(testname);

//        Assert.assertEquals(report.getreportheading(),"Team Summary");

    }
    }
