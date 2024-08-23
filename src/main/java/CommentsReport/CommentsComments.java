package CommentsReport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CommentsComments extends SeleniumBase{
	
	public  CommentsComments(RemoteWebDriver driver){
		this.driver = driver;
		} 
	
	 public String CommentsTitle() throws InterruptedException  {
			WebElement Comments =driver.findElement(By.xpath(properties.getProperty("comsec.title.xpath")));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].scrollIntoView();",Comments);
			return Comments.getText();
			}
		
	public void Translateicon() throws InterruptedException {
			 WebElement Canvas =driver.findElement(By.xpath(properties.getProperty("topic.canvas.xpath")));
		 	 ScrollintoElement(Canvas);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	         driver.findElement(By.xpath(properties.getProperty("comsec.translate.xpath")))
	               .click(); 
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

			 String translate = driver.findElement(By.xpath(properties.getProperty("comsec.translate1.xpath")))
					                  .getText();
			 System.out.println(translate);
		 }
		 
	public void TabClick() throws InterruptedException {
			 driver.findElement(By.xpath(properties.getProperty("comsec.tab.xpath")))
			       .click();
		 	   
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

			 driver.findElement(By.xpath(properties.getProperty("comsec.tab1.xpath")))
			       .click(); 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 	    
	         driver.findElement(By.xpath(properties.getProperty("comsec.tab2.xpath")))
	               .click(); 
		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 	   
			 driver.findElement(By.xpath(properties.getProperty("comsec.tab3.xpath")))
			       .click(); 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 	    
	         driver.findElement(By.xpath(properties.getProperty("comsec.tab4.xpath")))
	               .click(); 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 	  
	         driver.findElement(By.xpath(properties.getProperty("comsec.allcom.xpath")))
	               .click(); 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 	    
	     }
		
	public void Bookmark()  {
		     WebElement star = driver.findElement(By.xpath(properties.getProperty("comsec.star.xpath")));
		     Actions act = new Actions(driver);
		 	 act.doubleClick(star).build().perform();
		     String bookmarkcount = driver.findElement(By.xpath(properties.getProperty("comsec.bookmark.xpath")))
		    		                      .getText();
		     System.out.println(bookmarkcount);
		}
		
		
	public void collapsebtn() {
			  driver.findElement(By.xpath(properties.getProperty("comsec.expand.xpath")))
			        .click(); 
			}
		 
	public void loadmore() {
			 collapsebtn();
			 driver.findElement(By.xpath(properties.getProperty("comsec.load.xpath")))
			       .click(); 

		 }
		 
	public void Quarantine() throws InterruptedException  {
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
//	    JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("window.scrollBy(0,-250)", "");
        
        WebElement Commentstitle =driver.findElement(By.xpath(properties.getProperty("comsec.title.xpath")));
        ScrollintoElement(Commentstitle);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.findElement(By.xpath(properties.getProperty("comsec.tab3.xpath"))).click(); 

       // profanity.click();
	   // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	 	    
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
//        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("window.scrollBy(0,-250)", "");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		

	 
	    WebElement option=driver.findElement(By.xpath(properties.getProperty("comsec.option.xpath")));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        Actions action =new Actions(driver);
        action.moveToElement(option).click().build().perform();
	    //ScrollintoElement(option);
	   // option.click();
	    driver.findElement(By.xpath(properties.getProperty("comsec.quaratine.xpath")))
	          .click();
	    String quarantine = driver.findElement(By.xpath(properties.getProperty("comsec.Qcount.xpath")))
	    		                  .getText();
		System.out.println(quarantine);
		driver.findElement(By.xpath(properties.getProperty("comsec.close.xpath")))
        .click();
		     
		}
		 
	public void Redact() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
         WebElement redact= driver.findElement(By.xpath(properties.getProperty("comsec.redact.xpath"))); 
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click();",redact);
         driver.findElement(By.xpath(properties.getProperty("comsec.redactdg.xpath")))
               .click();

		 }
		 
	public void UnRedact() throws InterruptedException {
			 WebElement Unredact= driver.findElement(By.xpath(properties.getProperty("comsec.unredact.xpath"))); 
			 JavascriptExecutor executor = (JavascriptExecutor)driver;
			 executor.executeScript("arguments[0].click();",Unredact);
			 driver.findElement(By.xpath(properties.getProperty("comsec.unredactdg.xpath")))
			       .click();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
         }
		 
	public void flagged() throws InterruptedException {
			 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			 //Thread.sleep(5000);

		WebElement Commentstitle =driver.findElement(By.xpath(properties.getProperty("comsec.title.xpath")));
        ScrollintoElement(Commentstitle);
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
  
			 driver.findElement(By.xpath(properties.getProperty("comsec.pii.xpath")))
			       .click(); 
		    // Thread.sleep(5000);
	         String Bgclr = driver.findElement(By.xpath(properties.getProperty("comsec.flag.xpath")))
	        		              .getCssValue("background"); 
	         System.out.println(Bgclr);
	          
	         driver.findElement(By.xpath(properties.getProperty("comsec.tab3.xpath")))
	               .click(); 
			 //Thread.sleep(5000);
	         String Bgclr1 = driver.findElement(By.xpath(properties.getProperty("comsec.flag1.xpath")))
	        		               .getCssValue("background"); 
	         System.out.println(Bgclr1);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
//			 WebElement Representative1 =driver.findElement(By.xpath("(//p[@class='vg-layout-header-title'])[5]"));
//		        ScrollintoElement(Representative1);

	         driver.findElement(By.xpath(properties.getProperty("comsec.tab4.xpath"))).click(); 
	    	 Thread.sleep(5000);
	         String Bgclr2 = driver.findElement(By.xpath(properties.getProperty("comsec.flag2.xpath")))
	        		               .getCssValue("background"); 
	         System.out.println(Bgclr2);

		 }
		 
	public String Commentremove() {
			 WebElement Canvas =driver.findElement(By.xpath(properties.getProperty("topic.canvas.xpath")));
		 	 ScrollintoElement(Canvas);
			 driver.findElement(By.xpath(properties.getProperty("comsec.remove.xpath")))
			       .click();
			 driver.findElement(By.id(properties.getProperty("comsec.option.id")))
			       .click();
			 return  driver.findElement(By.xpath(properties.getProperty("comsec.toaster.xpath")))
					       .getText();
	       }
}



