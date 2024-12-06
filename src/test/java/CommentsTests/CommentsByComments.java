package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import CommentsReport.CommentsComments;
import CommentsReport.Login;

public class CommentsByComments  extends VivaLogin {

	Login login ;
	CommentsComments commentscomments ;
	
	
	@BeforeClass
	void setObject() {
		login = new Login(driver);
		commentscomments = new CommentsComments(driver);
		
		login.login(prop.getProperty("email"),
				prop.getProperty("clientid"),
				prop.getProperty("password"));
        login.survey1(prop.getProperty("survey1"));	
      } 


	@Test
    void TC_CC_01() throws IOException, InterruptedException{
  	    ExtentTest test = extentReport.createTest("TC_CC01");
	    commentscomments.CommentsTitle();
        Assert.assertEquals("Comments",commentscomments.CommentsTitle());
        test.addScreenCaptureFromPath(Screenshot("TC_CC01"));
    }
    

    @Test
  	void TC_CC_02() throws InterruptedException, IOException {
  	    ExtentTest test = extentReport.createTest("TC_CC02");
	    commentscomments.Translateicon();
  		test.addScreenCaptureFromPath(Screenshot("TC_CC02"));
      }
    
  @Test
	void TC_CC_03() throws InterruptedException, IOException {
  	    ExtentTest test = extentReport.createTest("TC_CC03");
	    commentscomments.TabClick();
		test.addScreenCaptureFromPath(Screenshot("TC_CC03"));
    }
 
  @Test
	void TC_CC_04() throws IOException {
  	    ExtentTest test = extentReport.createTest("TC_CC04");
	    commentscomments.Bookmark();
		test.addScreenCaptureFromPath(Screenshot("TC_CC04"));
    }

  
  @Test
	void TC_CC_05() throws IOException {
  	    ExtentTest test = extentReport.createTest("TC_CC05");
	    commentscomments.collapsebtn();
		test.addScreenCaptureFromPath(Screenshot("TC_CC05"));
    }
    @Test
	void TC_CC_06() throws IOException {
  	    ExtentTest test = extentReport.createTest("TC_CC06");
	    commentscomments.loadmore();
		test.addScreenCaptureFromPath(Screenshot("TC_CC06"));
    }
 
    @Test
	void TC_CC_07() throws InterruptedException, IOException {
  	    ExtentTest test = extentReport.createTest("TC_CK07");	    
	    commentscomments.Quarantine();
		test.addScreenCaptureFromPath(Screenshot("TC_CO07"));
    }
  
    @Test
	void TC_CC_08() throws InterruptedException, IOException {
  	    ExtentTest test = extentReport.createTest("TC_CC08");
	    commentscomments.Redact();
		test.addScreenCaptureFromPath(Screenshot("TC_CC08"));
    }
    @Test
	void TC_CC_09() throws InterruptedException, IOException {
  	    ExtentTest test = extentReport.createTest("TC_CC09");
	    commentscomments.UnRedact();
	 
		test.addScreenCaptureFromPath(Screenshot("TC_CC09"));
		
    }

    @Test
    void TC_CC_10() throws InterruptedException, IOException {
  	    ExtentTest test = extentReport.createTest("TC_CC10");
	    commentscomments.flagged();
	    test.addScreenCaptureFromPath(Screenshot("TC_CC10"));
   }  
 
    @Test
	void TC_CC_11() throws InterruptedException, IOException {
  	    ExtentTest test = extentReport.createTest("TC_CC11");
	    commentscomments.Commentremove();
		test.addScreenCaptureFromPath(Screenshot("TC_CC11"));
    }  
  
	
}
