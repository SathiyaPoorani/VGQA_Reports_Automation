package driverImpactReport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	public WebDriver driver;

	@BeforeTest
	public void Login() {
		
//	try 
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://app.vgqa.glint.cloud-dev.microsoft/session/auth");
			iwait();
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys("qatester@glintinc.com");
			driver.findElement(By.xpath("/html/body/glint-session-root/div/glint-session-auth/form/section/footer/button")).click();
			iwait();
			driver.findElement(By.id("clientUuid")).sendKeys("qa20161215");
			iwait();
			driver.findElement(By.xpath("/html/body/glint-session-root/div/glint-session-client/form/section/footer/button")).click();
			iwait();
			driver.findElement(By.id("password")).sendKeys("Dem0@pass2");
			iwait();
			driver.findElement(By.xpath("/html/body/glint-session-root/div/glint-session-login/form/section/footer/button")).click();
			iwait();iwait();
			driver.findElement(By.xpath("//*[@id=\'tab-4\']")).click();
		
		} 
//catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//}
	}
	
		//WebElement login = driver.findElement(By.xpath("/html/body/glint-session-root/div/glint-session-auth/form/section/input"));
	
	public void iwait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}




