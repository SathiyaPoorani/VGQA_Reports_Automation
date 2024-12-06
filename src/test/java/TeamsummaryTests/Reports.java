import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Reports {

    public WebDriver driver;
    @BeforeMethod
    public void start() throws InterruptedException {
//        login();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.glintqa.az.glintinc.com/session/auth");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.id("email")).sendKeys("qatester@glintinc.com");
        driver.findElement(By.id("email")).sendKeys("qatester@glintinc.com");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
//        driver.findElement(By.id("clientUuid")).sendKeys("qa20191108");
        driver.findElement(By.id("clientUuid")).sendKeys("qa20191108");
        driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
        Thread.sleep(3000);
//        driver.findElement(By.id("password")).sendKeys("Dem0@pass2");
        driver.findElement(By.id("password")).sendKeys("Dem0@pass2");
        Thread.sleep(3000);	driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.id("tab-4")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Recurring");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@data-id='39f7e9e5-6178-49c1-a151-5976ea5d16ac']")).click();
        driver.findElement(By.xpath("//div[@class='engagementReport header']")).click();
        Thread.sleep(3000);
    }

    @Test(priority = 1)
    public void Tc_G_01() throws InterruptedException {
        WebElement Title =driver.findElement(By.xpath("//h1[text()=' Executive Summary Report ']"));
        String s = Title.getText();
        Assert.assertEquals("Executive Summary Report", s);
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void Tc_G_0203() throws InterruptedException {
        driver.findElement(By.xpath("(//i[@class='down glintIcon'])[6]")).click();
        String As = driver.findElement(By.xpath("(//span[text()='Add section'])[1]")).getText();
        Assert.assertEquals(As, "Add section");
        String Sc=driver.findElement(By.xpath("//span[text()='Search Comments']")).getText();
        Assert.assertEquals(Sc, "Search Comments");
        driver.findElement(By.id("option0")).click();
    }
    @Test(priority = 3)
    public void Tc_G_0407() throws InterruptedException {
        driver.findElement(By.xpath("(//i[@class='down glintIcon'])[6]")).click();
        driver.findElement(By.xpath("//li[@data-value='ADD_SECTION']")).click();
        driver.findElement(By.xpath("//div[@data-id='PULSE_RESULTS']")).click();
        Thread.sleep(3000);
        JavascriptExecutor j=(JavascriptExecutor)driver;
        j.executeScript("window.scrollBy(0,4500)");
        Thread.sleep(3000);
        String element= driver.findElement(By.xpath("//*[contains(text( ),'November 2019 Recurring survey-20191113 Pulse Results')]")).getText();
        Assert.assertEquals(element, "November 2019 Recurring survey-20191113 Pulse Results");


    }

//    @DataProvider(name = "logindata")
//    public String[][] getdata(){
//        String [][] data = new String[1][2];
//
//        data[0][0] = "qatester@glintinc.com";       //1st Data
//        data[0][1] = "qa20191108";
//        data[0][2] = "Dem0@pass2";
//
//        data[1][0] = "qatester@glintinc.com";       //2nd Data
//        data[1][1] = "qa20191108";
//        data[1][2] = "Dem0@pass2";
//
//        return data;
//    }


    @AfterMethod
    public void close() {
        driver.quit();
    }
}
