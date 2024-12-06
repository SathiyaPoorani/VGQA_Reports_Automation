package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import CommentsReport.CommentsSlider;
import CommentsReport.DashboardLogin;

public class CommentsSliderTest extends VivaLogin {
        
		 DashboardLogin  dashboardlogin;
		 CommentsSlider commentsslider;
		 

		@BeforeClass
			void setObject() {
			 dashboardlogin = new DashboardLogin(driver);
			 commentsslider = new CommentsSlider(driver);
				
				dashboardlogin.Dashboardlogin(prop.getProperty("email"),
						prop.getProperty("clientid"),
						prop.getProperty("password"));
		        	      } 
		@Test
	    void TC_CS_01() throws IOException, InterruptedException{
		    commentsslider.commentsCount();
	       
	    }
		@Test
		 void TC_CS_02() {
			commentsslider.ViewCommentsLink();
		 }
		
		@Test
		 void TC_CS_03() throws InterruptedException {
			commentsslider.AllComments();
		 }
		
		@Test
		 void TC_CS_04() throws InterruptedException {
			commentsslider.Representative();
		 }
		@Test
		 void TC_CS_05() throws InterruptedException {
			commentsslider.Bookmark();
		 }
		@Test
        void TC_CS_06() throws InterruptedException {
	     commentsslider.BookmarkDriver();
 }	
       @Test
        void TC_CS_07() throws InterruptedException {
	     commentsslider.Prescriptive();
 }	
       @Test
       void TC_CS_08() throws InterruptedException {
	     commentsslider. DriverClickable();
}	 
       
       @Test
       void TC_CS_09() throws InterruptedException {
	     commentsslider.Teamsname();
}	
       @Test
       void TC_CS_10() throws InterruptedException {
	     commentsslider.LoadMore();
}	    
       
       @Test
       void TC_CS_11() throws InterruptedException {
	     commentsslider.ViewcommentsButton();
}	    
       
       @Test
       void TC_CS_12() throws InterruptedException {
	     commentsslider.sentimentcircle();
	     Assert.assertEquals("Overall favorability is mostly positive",commentsslider.sentimentcircle());
}	
       
       
       
}
