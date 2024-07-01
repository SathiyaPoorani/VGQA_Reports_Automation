package Tests;

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
	    test.log(Status.PASS, "Title: "+commentscomments.CommentsTitle());
	    commentscomments.CommentsTitle();
        Assert.assertEquals("Comments",commentscomments.CommentsTitle());
        test.addScreenCaptureFromPath(Screenshot("TC_CC01"));
    }
    

    @Test
  	void TC_CC_02() throws InterruptedException, IOException {
  	    ExtentTest test = extentReport.createTest("TC_CC02");
	    test.log(Status.PASS, "Translate icon is clickable");
	    commentscomments.Translateicon();
  		test.addScreenCaptureFromPath(Screenshot("TC_CC02"));
      }
    
  @Test
	void TC_CC_03() throws InterruptedException, IOException {
  	    ExtentTest test = extentReport.createTest("TC_CC03");
	    test.log(Status.PASS, "Tabs are Switchable");
	    commentscomments.TabClick();
		test.addScreenCaptureFromPath(Screenshot("TC_CC03"));
    }
 
  @Test
	void TC_CC_04() throws IOException {
  	    ExtentTest test = extentReport.createTest("TC_CC04");
	    test.log(Status.PASS, "Able to bookmark the comments");
	    commentscomments.Bookmark();
		test.addScreenCaptureFromPath(Screenshot("TC_CC04"));
    }

  
  @Test
	void TC_CC_05() throws IOException {
  	    ExtentTest test = extentReport.createTest("TC_CC05");
	    test.log(Status.PASS, "Able to expand questions");
	    commentscomments.collapsebtn();
		test.addScreenCaptureFromPath(Screenshot("TC_CC05"));
    }
    @Test
	void TC_CC_06() throws IOException {
  	    ExtentTest test = extentReport.createTest("TC_CC06");
	    test.log(Status.PASS, "Able to click Loadmore button");
	    commentscomments.loadmore();
		test.addScreenCaptureFromPath(Screenshot("TC_CC06"));
    }
 
    @Test
	void TC_CC_07() throws InterruptedException, IOException {
  	    ExtentTest test = extentReport.createTest("TC_CK07");
	    test.log(Status.PASS, "Able to Quarantine comments");
	    commentscomments.Quarantine();
		test.addScreenCaptureFromPath(Screenshot("TC_CO07"));
    }
  
    @Test
	void TC_CC_08() throws InterruptedException, IOException {
  	    ExtentTest test = extentReport.createTest("TC_CC08");
	    test.log(Status.PASS, "Able to Redact comments");
	    commentscomments.Redact();
		test.addScreenCaptureFromPath(Screenshot("TC_CC08"));
    }
    @Test
	void TC_CC_09() throws InterruptedException, IOException {
  	    ExtentTest test = extentReport.createTest("TC_CC09");
	    test.log(Status.PASS, "Able to Quarantine comments");
	    commentscomments.UnRedact();
		test.addScreenCaptureFromPath(Screenshot("TC_CC09"));
    }

    @Test
    void TC_CC_10() throws InterruptedException, IOException {
  	    ExtentTest test = extentReport.createTest("TC_CC10");
	    test.log(Status.PASS, "Flagged Comments");
	    commentscomments.flagged();
	    test.addScreenCaptureFromPath(Screenshot("TC_CC10"));
   }  
 
    @Test
	void TC_CC_11() throws InterruptedException, IOException {
  	    ExtentTest test = extentReport.createTest("TC_CC11");
	    test.log(Status.PASS, "Comments Section is removed");
	    commentscomments.Commentremove();
		test.addScreenCaptureFromPath(Screenshot("TC_CC11"));
    }  
  
	
}
