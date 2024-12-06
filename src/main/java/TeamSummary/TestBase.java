package pageobjects;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.*;

import java.io.File;
import java.io.*;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;
    public ReportCardObject report;
    public GlintDashboardObject glint;
    public LoginPageObject loginfun;
    public CommentsCardObject comments;
    public DriverSummaryObject summary;
    public Properties prop;
    
    public void launchbrowser(){
        System.out.println("Launching Browser.");
        driver = new ChromeDriver();
        report = new ReportCardObject(driver);
        glint = new GlintDashboardObject(driver);
        loginfun = new LoginPageObject(driver);
        comments = new CommentsCardObject(driver);
        summary = new DriverSummaryObject(driver);
        driver.manage().window().maximize();
        driver.get("https://app.vgqa.glint.cloud-dev.microsoft/session/auth");
        zoomout();
        iwait();
    }

    public void closebrowser(){
        System.out.println("Closing Browser.");
        driver.quit();
    }

    public void login() throws InterruptedException {
        loginfun.setEmailid("qatester@glintinc.com");
        iwait();
        loginfun.setContinuebutton();
        iwait();
        loginfun.setCompanyid("qa20181217");
        iwait();
        loginfun.setContinuebutton();
        iwait();
        loginfun.setPassword("Dem0@pass2");
        iwait();
        loginfun.setContinuebutton();
    }
    
    
    public void login2() throws InterruptedException {
        loginfun.setEmailid("qatester+87@glintinc.com");
        iwait();
        loginfun.setContinuebutton();
        iwait();
        loginfun.setCompanyid("qa20220825");
        iwait();
        loginfun.setContinuebutton();
        iwait();
        loginfun.setPassword("Dem0@pass2");
        iwait();
        loginfun.setContinuebutton();
    }

    public void iwait(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public void ewait(int caseno , WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        switch (caseno){
            case 1:
                wait.until(ExpectedConditions.visibilityOfAllElements(element));
                break;
            case 2:
                wait.until(ExpectedConditions.elementToBeClickable(element));
                break;
            case 3:
                wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("p")));
                break;
            case 4:
                wait.until(ExpectedConditions.textToBePresentInElement(element,"Downloaded"));
                break;

        }
    }

    public void takescreenshot(String tname) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("C:/Users/VBhara01/OneDrive - dentsu/Automation Reports/"+tname+".png"));
        System.out.println("--------ScreenShot Captured--------");
    }

    public void scrollthepage(WebElement scroll){
        WebElement scrolltoelement = scroll;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", scrolltoelement);
    }
//    public void scrollupthepage(WebElement scroll){
//        WebElement scrolltoelement = scroll;
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,-250)", scrolltoelement);
//    }
    
    public void mousehover(WebElement mouse){
        Actions action = new Actions(driver);
        action.clickAndHold(mouse).build().perform();
    }
    public void mouseOver(WebElement locator) {
        Actions actions = new Actions(driver);
        actions.moveToElement(locator).perform();
    }  
    public void zoomout() {
    	JavascriptExecutor executor = (JavascriptExecutor)driver;
    	executor.executeScript("document.body.style.zoom = '0.75'");   	
    }
    public TestBase() {
		prop = new Properties();
		try {
		prop.load(new FileInputStream("AllLocator.properties"));
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
			}
	}
 
    
    
//    public class HomePage {
//        WebDriver driver;
//
//        @FindBy(id = "dropdownId")
//        WebElement dropdown;

}
