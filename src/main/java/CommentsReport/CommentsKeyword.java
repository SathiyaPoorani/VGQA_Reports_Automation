package CommentsReport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CommentsKeyword  extends SeleniumBase{
	
	public  CommentsKeyword(RemoteWebDriver driver){
		this.driver = driver;
		}
	
    public String KeyTitle() {
    	WebElement Keywords =  driver.findElement(By.xpath(properties.getProperty("key.title.xpath")));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].scrollIntoView();",Keywords);
		return Keywords.getText();
		}
    
	 public String KeyTooltip() throws InterruptedException {
		     WebElement Question =driver.findElement(By.xpath(properties.getProperty("ques.driver.xpath")));
	    	 ScrollintoElement(Question);
			 WebElement ticon= driver.findElement(By.xpath(properties.getProperty("key.tlicon.xpath")));
			 Actions act = new Actions(driver);
			 act.moveToElement(ticon).build().perform();
			 String tooltipmsg = driver.findElement(By.xpath(properties.getProperty("key.tltip.xpath"))).getText();
			 return tooltipmsg;
		}
	 public void KeyClick() {
		  driver.findElement(By.cssSelector(properties.getProperty("Key.cloud.css"))).click();
		  driver.findElement(By.xpath(properties.getProperty("key.slider.xpath")));
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.findElement(By.xpath(properties.getProperty("key.close.xpath"))).click();
		  }
	 public void KeyToggle() {
		 WebElement Question =driver.findElement(By.xpath(properties.getProperty("ques.driver.xpath")));
	     ScrollintoElement(Question);
		 WebElement Toggle=driver.findElement(By.xpath(properties.getProperty("key.toggle.xpath")));
		 Toggle.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath(properties.getProperty("key.table.xpath"))).click();
	    }
	 public void KeySort() {
       	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(properties.getProperty("key.sort.xpath"))).click();
		   }
	 public void Keycount()  {
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	KeySort();
	    	driver.findElement(By.xpath(properties.getProperty("key.count.xpath"))).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(properties.getProperty("key.slider.xpath")));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.xpath(properties.getProperty("key.close.xpath"))).click();
			}
	 public String Keyremove() {
		 WebElement Remove =driver.findElement(By.xpath(properties.getProperty("key.remove.xpath")));
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click();",Remove);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement option =driver.findElement(By.id(properties.getProperty("key.option.id")));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",option);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 return  driver.findElement(By.xpath(properties.getProperty("key.toaster.xpath"))).getText();
        }
	 
	

}
