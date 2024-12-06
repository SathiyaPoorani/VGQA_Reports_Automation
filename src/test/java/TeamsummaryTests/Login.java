import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.glintqa.az.glintinc.com/session/auth");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("email")).sendKeys("qatester@glintinc.com");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("clientUuid")).sendKeys("qa20191108");
        driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
        Thread.sleep(3000);
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
}
