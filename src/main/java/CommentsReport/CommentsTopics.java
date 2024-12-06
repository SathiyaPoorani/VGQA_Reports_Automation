package CommentsReport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CommentsTopics extends SeleniumBase{
	
	public  CommentsTopics(RemoteWebDriver driver){
		this.driver = driver;
		}
	
	public String TopicsTitle() {
		WebElement Topics =driver.findElement(By.xpath(properties.getProperty("topic.title.xpath")));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView();",Topics);
		return Topics.getText();
		
	}
	
	public String TopicsTooltip() throws InterruptedException {
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 WebElement Cloud =driver.findElement(By.cssSelector(properties.getProperty("key.cloud.css")));
 	 ScrollintoElement(Cloud);
      WebElement tooltipicon= driver.findElement(By.xpath(properties.getProperty("topic.tlicon.xpath")));
      Actions mouse = new Actions(driver);
      mouse.moveToElement(tooltipicon).build().perform();
	  String tooltipmsg = driver.findElement(By.xpath(properties.getProperty("topic.tltip.xpath"))).getText();
	  return tooltipmsg;
	}
	
	public String BubbleTopics() throws InterruptedException {
	    WebElement Bubble = driver.findElement(By.xpath(properties.getProperty("topic.bubble.xpath")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", Bubble);
        Actions mouse = new Actions(driver);
 	    mouse.moveToElement(Bubble,155,25).build().perform();
	    String tooltipmsg = driver.findElement(By.xpath(properties.getProperty("topic.bubbletp.xpath"))).getText();
		return tooltipmsg;
	}
	
	public void TopicsClick() throws InterruptedException {
       WebElement Bubble = driver.findElement(By.xpath(properties.getProperty("topic.bubble.xpath")));
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",Bubble);
	    Actions Position = new Actions(driver);
	    Position.moveToElement(Bubble,155,25).click().build().perform();
	 
		driver.findElement(By.xpath(properties.getProperty("topic.slider.xpath")));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath(properties.getProperty("topic.close.xpath"))).click();
    }
	
	public void BubbleDrag() throws InterruptedException {
		WebElement Bubble = driver.findElement(By.xpath(properties.getProperty("topic.bubble.xpath")));
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", Bubble);
		Actions Position = new Actions(driver);
	    Position.dragAndDropBy(Bubble,255,35).perform();
	}
	
	public void TopicsToggle() {
		 WebElement Toggle = driver.findElement(By.xpath(properties.getProperty("topic.toggle.xpath")));
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("window.scrollBy(0,-250)", "");
		 Toggle.click();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.findElement(By.xpath(properties.getProperty("topic.table.xpath"))).click();
	    }
	 
	 public void TopicsSort() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(properties.getProperty("topic.sort.xpath"))).click();
		   }
	 
	 public void viewAll() {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.findElement(By.xpath(properties.getProperty("topic.viewall.xpath"))).click();
	 }
	
	 public void Topicscount() throws InterruptedException  {
			driver.findElement(By.xpath(properties.getProperty("topic.sort.xpath"))).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			Thread.sleep(2000);
			driver.findElement(By.xpath(properties.getProperty("topic.ccount.xpath"))).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath(properties.getProperty("topic.slider.xpath")));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.xpath(properties.getProperty("topic.close.xpath"))).click();
			driver.navigate().refresh();
	}
	
	 public String Topicsremove() {
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
          driver.findElement(By.xpath(properties.getProperty("topic.remove.xpath"))).click();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
          driver.findElement(By.id(properties.getProperty("topic.option.id"))).click();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
          return  driver.findElement(By.xpath(properties.getProperty("topic.toaster.xpath"))).getText();
    }


}
