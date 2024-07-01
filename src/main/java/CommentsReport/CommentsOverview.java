package CommentsReport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CommentsOverview extends SeleniumBase{
	
	public  CommentsOverview(RemoteWebDriver driver){
		this.driver = driver;
		}
	
	public String commentsTitle() throws InterruptedException {
		Thread.sleep(3000);
        return driver.findElement(By.xpath(properties.getProperty("comment.title.xpath")))
        		     .getText();
		}
	
	public boolean Commentscount() {
	 return driver.findElement(By.xpath(properties.getProperty("comments.count.xpath")))
			      .isDisplayed();
	  }

	public String Count() {
	 return driver.findElement(By.xpath(properties.getProperty("comments.count.xpath")))
			      .getText();
	  }
	
	public String OverviewTooltip() throws InterruptedException {
		WebElement ticon= driver.findElement(By.xpath(properties.getProperty("comment.icon.xpath")));
		Actions act = new Actions(driver);
		act.moveToElement(ticon).build().perform();
		String tooltipmsg = driver.findElement(By.xpath(properties.getProperty("comment.sentittool.xpath")))
				                  .getText();
		return tooltipmsg;
	  }
		
	public String sentimenttext() {
		 return driver.findElement(By.xpath(properties.getProperty("comment.senti.xpath")))
				      .getText();
		}
	
	public boolean topicsButton() {
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         return driver.findElement(By.xpath(properties.getProperty("comment.topic.xpath")))
        		      .isEnabled();
		}
	
     public void topicsclick() throws InterruptedException {
    	 driver.findElement(By.xpath(properties.getProperty("comment.topic.xpath")))
		       .click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    }
	
     public void topicsclose() throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(By.xpath(properties.getProperty("comment.close.xpath")))
              .click();
		}

	public void topicslink() {
   	 driver.findElement(By.xpath(properties.getProperty("comment.toplink.xpath")))
           .click();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(55));
	 
		 }
	
	public String Sectionremove() {
		driver.navigate().refresh();
   	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.findElement(By.xpath(properties.getProperty("comment.remove.xpath")))
           .click();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     driver.findElement(By.id(properties.getProperty("comment.option.id")))
           .click();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 return  driver.findElement(By.xpath(properties.getProperty("comment.toaster.xpath")))
			       .getText();
         } 
}


