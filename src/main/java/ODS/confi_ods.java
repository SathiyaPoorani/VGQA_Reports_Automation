/*package Conftest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import maventest.maven_testng.LoginPOM;
import maventest.maven_testng.ODS;


public class confi_ods {
    public WebDriver driver;
    public WebDriverWait wait;
    public LoginPOM logtestODS;
    public ODS ods;

    public void openBrowserODS() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vgqa.glint.cloud.dev.microsoft/session/auth");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(2000);
    }
    public void LoginCredentialsODS() throws InterruptedException {
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logtestODS = new LoginPOM(driver);
        logtestODS.enterEmailId("qatester@glintinc.com");
        logtestODS.clickContinueButton();
        logtestODS.enterClientId("qa20240909");
        logtestODS.clicksubmitButton();
        logtestODS.enterPassword("Dem0@pass2");
        logtestODS.clickpasssubmitButton();
        Thread.sleep(5000);
        //driver.quit();
    }

    public void configbutton() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ods = new ODS(driver);
        ods.clickconfig();
        //Thread.sleep(5000);
    }

    public void Survey_Programs() throws InterruptedException {
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    ods.Clickprograms();
    Thread.sleep(5000);
    }

    public void People() throws InterruptedException {
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    ods.clickpeople();
    Thread.sleep(5000);
    }

    public  void ClickPeopleExport() throws InterruptedException {
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    ods.clickpplexport();
    Thread.sleep(5000);
    }

    public void PeoplePageButtonCheck() throws InterruptedException {
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    ods.checkpplpagebutton();
    Thread.sleep(5000);
    }

    public void AttributeButtonCheck() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ods.buttoncheck();
        Thread.sleep(5000);
    }

    public void CompanyAdmin() throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ods.Clickcyadmin();
    }

    public void Urole1() throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ods.ClickUserrole1();
    }

    public void Urole2() throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ods.ClickUserrole2();
    }

    public void Actions_Button() throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ods.PeopleActions_button();
    }

    public void AttributeVisibility() throws InterruptedException
    {
        ods.clickuserattribute();
    }

    public void CAV_button() throws InterruptedException
    {
        ods.CAV_Button();
    }

    public String CheckPeopleText() throws InterruptedException
    {
               return ods.PeopleText();
    }

    public void clickanyuser() throws InterruptedException
    {
        ods.Clickanyuserbutton();
    }

    public void Check_Pencil_button() throws InterruptedException
    {
        ods.Pencilbuttoncheck();
    }

    public void check_text_box()    throws  InterruptedException
    {
        ods.Searchbox("test");
    }

   }

*/