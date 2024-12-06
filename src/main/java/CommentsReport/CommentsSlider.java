package CommentsReport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CommentsSlider extends SeleniumBase{

	public  CommentsSlider(RemoteWebDriver driver){
		this.driver = driver;
		}
	
	public String commentsCount() throws InterruptedException {
		String CommentsCount= driver.findElement(By.xpath(properties.getProperty("dash.comcount.xpath"))).getText();
		 return CommentsCount;
		}
	
	public void ViewCommentsLink() {
	   WebElement ViewLink =driver.findElement(By.xpath(properties.getProperty("dash.viewlink.xpath")));
	   ViewLink.click();
	}
	
	public String AllComments() throws InterruptedException {
		Thread.sleep(5000);
		String AllComments = driver.findElement(By.xpath(properties.getProperty("slider.allcomments.xpath"))).getText();
		return AllComments;
	}
	
	public String Representative() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath(properties.getProperty("dash.slider.xpath")));
		driver.findElement(By.xpath(properties.getProperty("dash.slider.xpath"))).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.id(properties.getProperty("dropdown.rep.id"))).click();
		String Representative = driver.findElement(By.xpath(properties.getProperty("slider.represent.xpath"))).getText();
		return Representative;
	}
	public String Bookmark() throws InterruptedException {
		
		driver.findElement(By.xpath(properties.getProperty("dash.slider.xpath")));
		driver.findElement(By.xpath(properties.getProperty("dash.slider.xpath"))).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.id(properties.getProperty("dropdown.book.id"))).click();
		String Bookmark = driver.findElement(By.xpath(properties.getProperty("slider.bookmark.xpath"))).getText();
		return Bookmark;
	}
	public String BookmarkDriver() throws InterruptedException {
		Bookmark();
		String BookmarkDriver = driver.findElement(By.xpath(properties.getProperty("slider.driver.xpath"))).getText();
		System.out.println(BookmarkDriver);
		return BookmarkDriver;
	}
	
	public String Prescriptive() throws InterruptedException {
		
		driver.findElement(By.xpath(properties.getProperty("dash.slider.xpath")));
		driver.findElement(By.xpath(properties.getProperty("dash.slider.xpath"))).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.id(properties.getProperty("dropdown.pres.id"))).click();
		String Prescriptive = driver.findElement(By.xpath(properties.getProperty("slider.prescriptive.xpath"))).getText();
		return Prescriptive;
	}
	public void DriverClickable() {
		
		driver.findElement(By.xpath(properties.getProperty("slider.driverclickable.xpath"))).click();
	}
	
	public String Teamsname() {
		DriverClickable();
		String Teamnames = driver.findElement(By.xpath(properties.getProperty("slider.team.xpath"))).getText();
		System.out.println(Teamnames );
		return Teamnames;
	}
	public void LoadMore() {
		
		driver.findElement(By.xpath(properties.getProperty("slider.loadmore.xpath"))).click();
	}
	public void ViewcommentsButton() {
		driver.findElement(By.xpath(properties.getProperty("slider.viewcomments.xpath"))).click();
	}
	
	public String sentimentcircle() {
		
		WebElement senticircle=driver.findElement(By.xpath(properties.getProperty("slider.sentibox.xpath")));
		Actions action = new Actions(driver);
		action.moveToElement(senticircle).build().perform();
		WebElement sentiment_tip = driver.findElement(By.xpath(properties.getProperty("slider.sentitip.xpath")));
		return sentiment_tip.getText();
	}
	
	
	
}
