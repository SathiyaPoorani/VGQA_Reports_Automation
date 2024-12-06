/*
package Conftest;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import maventest.maven_testng.LoginPOM;
import maventest.maven_testng.Ovr_Res;
import maventest.maven_testng.ReportsPagePOM;

public class confi {

    public WebDriver driver;
    public WebDriverWait wait;
    public LoginPOM logtest;
    public	ReportsPagePOM	esreport;
    public ReportsPagePOM	pchange;
    public Ovr_Res	overall;

    public void openBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vgqa.glint.cloud.dev.microsoft/session/auth");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(2000);
    }

    public void LoginCredentials() throws InterruptedException {
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logtest = new LoginPOM(driver);
        logtest.enterEmailId("qatester@glintinc.com");
        logtest.clickContinueButton();
        logtest.enterClientId("qa20240909");
        logtest.clicksubmitButton();
        logtest.enterPassword("Dem0@pass2");
        logtest.clickpasssubmitButton();
        logtest.clickreportsbutton();
        //WebDriverWait wwait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	//wwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='tab-4']"))).click();
        logtest.clickreportsbutton();
        Thread.sleep(5000);
        //driver.quit();
    }
    
    public void ExecSummary() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	esreport = new ReportsPagePOM(driver);
    	esreport.clickexecsummary();
    	Thread.sleep(4000);
    	
    
    }
    
    public void ProgramChanging() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	pchange= new ReportsPagePOM(driver);
    	pchange.clickchangeprogram();
    	Thread.sleep(4000);	
    }
    
    public void Heatmap() throws InterruptedException{
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	pchange.clickhmap();
    }
    
    public void moree() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	pchange = new ReportsPagePOM(driver);
    	pchange.moreclick();
    	Thread.sleep(4000);
	}
    
    public void SettingsButton() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	pchange.settingsbutton();
    }
    
    public void ReportExport() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	pchange.reportexport();
    }

    public void OpenOvr() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	overall = new Ovr_Res(driver);
    	overall.clickovrres();
    }
    public void OpenComments() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	overall.clickovrres();
    	overall.clickcomments();
    }
    public void Screenshot_Scores() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	overall.Scores_ss();
    }

    public void pChanging() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	pchange= new ReportsPagePOM(driver);
    	pchange.clickchangeprogram();
        driver.navigate().back();
        logtest.clickreportsbutton();
    	Thread.sleep(4000);
    		
    }


    public void ClickDropdown() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	overall.clickdropdown();
    }

    public void Clickaddsection()   throws InterruptedException
    {
        overall.clickaddsection();
    }

    public void Clickaddsurveyresultsbtn()   throws InterruptedException
    {
        overall.clickaddsurveyresultsbtn();
    }

    public void ClickreportexporttoPDF() throws InterruptedException
    {
        overall.clickreportexporttopdf();
    }

    public void save_operation() throws InterruptedException
    {
        overall.save_report();
    }

    public void settings_button() throws InterruptedException
    {
        overall.clicksettingsbtn();
    }
}
    */