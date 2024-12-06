import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.LoginPageObject;
import pageobjects.TestBase;

public class LoginFunction extends TestBase {


    @BeforeMethod
    public void open() throws InterruptedException {
        launchbrowser();
        login();
    }

    @Test
    public void logintest(){
        iwait();
        driver.findElement(By.id("reportEditButton"));
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vgqa.glint.cloud-dev.microsoft/qa20220428/dashboard");
    }

    @AfterMethod
    public void close(){
        closebrowser();
    }
}
