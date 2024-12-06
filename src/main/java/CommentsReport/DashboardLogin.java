package CommentsReport;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DashboardLogin extends SeleniumBase {

	public DashboardLogin(RemoteWebDriver driver){
		this.driver = driver;
		}
		
	public void Dashboardlogin(String email,String clientid,String password){
		type(driver.findElement(By.id(properties.getProperty("LoginPage.email.id"))),email);
		driver.findElement(By.className(properties.getProperty("LoginPage.Continue1.ClassName"))).click();
		
		type(driver.findElement(By.id(properties.getProperty("LoginPage.clientid.id"))),clientid);
        driver.findElement(By.xpath(properties.getProperty("LoginPage.Continue2.xpath"))).click();
        
        type(driver.findElement(By.id(properties.getProperty("LoginPage.password.id"))),password);
		driver.findElement(By.xpath(properties.getProperty("LoginPage.submit.xpath"))).click();
		
		driver.findElement(By.id(properties.getProperty("Dash.login.id"))).click();
		}

	
}


