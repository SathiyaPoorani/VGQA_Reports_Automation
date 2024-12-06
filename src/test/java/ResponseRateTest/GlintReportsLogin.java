package glintReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GlintReportsLogin {
	
	
	public WebDriver driver;

	@BeforeMethod
	public void open() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.vgqa.glint.cloud-dev.microsoft/session/auth");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("qatester@glintinc.com");
		driver.findElement(By.xpath("/html/body/glint-session-root/div/glint-session-auth/form/section/footer/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("clientUuid")).sendKeys("qa20230121");
		driver.findElement(By.xpath("/html/body/glint-session-root/div/glint-session-client/form/section/footer/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Dem0@pass2");
		driver.findElement(By.xpath("/html/body/glint-session-root/div/glint-session-login/form/section/footer")).click();
		Thread.sleep(30000);
	}

	
	@Test
	public void TC_00() throws InterruptedException {
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Engagement test']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Response Rate Report')]")).click();
		
		
	}
	@Test
	public void TC_001() throws InterruptedException {            //new report>>select a repo type
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Engagement test']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[.//span[text()='New Report']]")).click();
		//driver.findElement(By.xpath("//button[@class='btnCta btnWithVgIcon glintButton ng-star-inserted']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='menuButton text small glintButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("option4")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class=\"btnWithVgIcon subtleBtn footerButton glintButton ng-star-inserted\"]")).click();
		driver.findElement(By.xpath("//span[text()='Add Filters']")).click();
		
		
		
	}
	
	@Test
	public void TC_002() throws InterruptedException {            //add filters>>question responses
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btnCta btnWithVgIcon glintButton ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='menuButton text small glintButton']")).click();
	 	Thread.sleep(2000);
		driver.findElement(By.id("option4")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btnWithIcon addFiltersButton glintButton ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Question Responses")).click();
		WebElement uploadElement = driver.findElement(By.cssSelector(".list>li"));
		uploadElement.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(), ' Benefits ')]//input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(), 'Accountability')]//input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class=\"btnSm btnCta glintButton ng-star-inserted\"]")).click();
	
	
	}
	@Test
	public void TC_003() throws InterruptedException {         //back button
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Engagement test']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Response Rate Report')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"btnWithVgIcon subtleBtn glintButton ng-star-inserted\"]")).click();
		
		
		
	}
	
	@Test
	public void TC_004() throws InterruptedException {           //settings
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Response Rate Report')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='btnWithVgIcon btnSlim glintButton ng-star-inserted']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"configureSection\"]/glint-slidey/div/div[3]/div/div/section/div/glint-report-section-form/form/div/div/div[2]/label/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btnCta glintButton']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("dropdownTrigger_glintDropdown_d0326e97-aa9b-4d82-b155-d8b8b031821f")).click();
		
		driver.findElement(By.xpath("//*[@class='btnCta btnWithVgIcon glintButton ng-star-inserted']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='inlineBtnLink glintButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btnIcon slideyClose glintButton']")).click();
		
	}
	@Test
	
	
	public void TC_005() throws InterruptedException {    //export and share>> PDF
	 driver.findElement(By.linkText("Reports")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Engagement test']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),'Response Rate Report')]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@aria-label=\"Report Export Options Menu\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[@id=\"option1\"]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[text()=' Generate PDF ']")).click();
	}
	
	
	@Test
	public void TC_006() throws InterruptedException {     //export and share>> save
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Engagement test']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Response Rate Report')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@aria-label=\"Report Export Options Menu\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@id=\"option4\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}
	
	@Test

public void TC_007() throws InterruptedException {    //export and share>>report of power point
driver.findElement(By.linkText("Reports")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//span[text()='Engagement test']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[contains(text(),'Response Rate Report')]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//div[@aria-label=\"Report Export Options Menu\"]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//li[@id=\"option0\"]")).click();
Thread.sleep(1000);




	}
    
	@Test
	public void TC_008() throws InterruptedException {        //view report
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Engagement test']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Response Rate Report')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()=' View Report '])[1]")).click();
		
	}
    
	@Test
	public void TC_009() throws InterruptedException {        //More
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Engagement test']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Response Rate Report')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"menuButton glintButton btnSlim\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='option0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Comments']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@class=\"plus glintIcon\"])[2]")).click();
	}
	
	@Test
	public void TC_010() throws InterruptedException {
		driver.findElement(By.linkText("Reports")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Engagement test']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Response Rate Report')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class=\"menuButton text glintButton\"])[1]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//span[text()='Alphabetical']")).click();
		driver.findElement(By.xpath("//li[@id=\"option3\"]")).click();
	}





	
	
//	@AfterMethod
//	public void close(){
//		driver.quit();
//	}
}
	
	
	
	
	

