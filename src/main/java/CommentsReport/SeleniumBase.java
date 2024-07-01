package CommentsReport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBase {
	
	protected RemoteWebDriver driver =null;
	protected static WebDriverWait wait = null;
	protected Properties properties = null;
	
	public SeleniumBase() {
		properties = new Properties();
		try {
		properties.load(new FileInputStream("VivaLocators.properties"));
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
			}
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void click(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void type(WebElement element,String data) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.clear();
		element.sendKeys(data);
	}
	public String Screenshot(String name) throws IOException {
		File Source = driver.getScreenshotAs(OutputType.FILE);
		File Dest =new File("C:\\Users\\SPoora01\\Pictures\\Automation Screenshot\\"+name+".png");
		FileHandler.copy(Source, Dest);
		return Dest.getAbsolutePath();
	}
	public void ScrollintoElement(WebElement Scroll) {
		WebElement Scrollelement = Scroll; 
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView();",Scrollelement);
	}
	


}



