package CommentsReport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CommentsQuestion extends SeleniumBase{
	
	public  CommentsQuestion(RemoteWebDriver driver){
		this.driver = driver;
		}
	
	public String QuestionTitle() {
		WebElement Question =driver.findElement(By.xpath(properties.getProperty("ques.title.xpath")));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView();",Question);
		return Question.getText();
		}

    public String QuestionTooltip() throws InterruptedException {
		WebElement tooltipicon= driver.findElement(By.xpath(properties.getProperty("ques.tlicon.xpath")));
		Actions act = new Actions(driver);
	    act.moveToElement(tooltipicon).build().perform();
		String tooltipmsg = driver.findElement(By.xpath(properties.getProperty("ques.tltip.xpath"))).getText();
		return tooltipmsg;
	}
   
    public String Questionvolume() {
		return driver.findElement(By.xpath(properties.getProperty("ques.volume.xpath"))).getText();
	}
    
    public String Questiondriver() {
		return driver.findElement(By.xpath(properties.getProperty("ques.driver.xpath"))).getText();
	}
    
    public void QuestionClick() {
	  driver.findElement(By.xpath(properties.getProperty("ques.driver.xpath"))).click();
	  driver.findElement(By.xpath(properties.getProperty("ques.slider.xpath")));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.xpath(properties.getProperty("ques.close.xpath"))).click();
	  }
       
    public void QuestionToggle() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	WebElement Topics=driver.findElement(By.xpath(properties.getProperty("overview.topics.xpath")));
    	ScrollintoElement(Topics);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement Toggle=driver.findElement(By.xpath(properties.getProperty("ques.toggle.xpath")));
        Toggle.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(properties.getProperty("ques.table.xpath"))).click();
    }
    
    public void Questioncount()  {
    	driver.findElement(By.xpath(properties.getProperty("ques.toggle.xpath"))).click();
    	driver.findElement(By.xpath(properties.getProperty("ques.table.xpath"))).click();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.findElement(By.xpath(properties.getProperty("ques.ccount.xpath"))).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(properties.getProperty("ques.slider.xpath")));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath(properties.getProperty("ques.close.xpath"))).click();
	}
    
    public void QuestionSort() {
	    driver.findElement(By.xpath(properties.getProperty("ques.sort.xpath"))).click();
	   }
   
    public boolean ConnectedTopics() {
   	 return driver.findElement(By.xpath(properties.getProperty("ques.topic.xpath"))).isEnabled();
   	}

    public String Questionremove() {
		 driver.findElement(By.xpath(properties.getProperty("ques.remove.xpath"))).click();
		 driver.findElement(By.id(properties.getProperty("ques.option.id"))).click();
		return  driver.findElement(By.xpath(properties.getProperty("ques.toaster.xpath"))).getText();
	}
    

}
