
package Conftest;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import maven_testng.Locators.LoginPOM;
import maven_testng.Locators.MCQLocators;

public class confi {

    public WebDriver driver;
    public WebDriverWait wait;
    public LoginPOM logtest;
    public	MCQLocators	response;
    

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
        logtest.enterClientId("qa20190329");
        logtest.clicksubmitButton();
        logtest.enterPassword("Dem0@pass2");
        logtest.clickpasssubmitButton();
        logtest.clickreportsbutton();
        Thread.sleep(5000);
        //driver.quit();
    }
    

    public void changingprogram_operation() throws  InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        response = new MCQLocators(driver);
        response.Click_Program_Change();

    }


    public void MCQ_Operation() throws  InterruptedException
     {
        response.Click_MCQbutton();
        
    }

    public void settingsbutton_Operation() throws InterruptedException
    {
        response.Click_settingsbutton();
    }

    public void More_dropdown_Operation() throws InterruptedException
    {
        response.More_dropdown();
    }

    public void Add_Section_Operation() throws InterruptedException
    {
        response.Add_Section();
    }

    public void search_comments_Operation() throws InterruptedException
    {
        response.search_comments();
    }

    public void Manger_hierarchy_dropdown_Operation() throws InterruptedException
    {
        response.Manger_hierarchy_dropdown();
    }

    public void Select_attribute22_Operation() throws InterruptedException
    {
        response.Select_attribute22();
    }
    
}