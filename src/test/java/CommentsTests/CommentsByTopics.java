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

import CommentsReport.CommentsTopics;
import CommentsReport.Login;

public class CommentsByTopics extends VivaLogin {

	Login login ;
	CommentsTopics commentstopics ;
	
	
	@BeforeClass
	void setObject() {
		login = new Login(driver);
		commentstopics = new CommentsTopics(driver);
		
		login.login(prop.getProperty("email"),
				prop.getProperty("clientid"),
				prop.getProperty("password"));
      login.survey(prop.getProperty("survey"));	
      }
	
	@Test
	void TC_CT_01() throws IOException{
		 ExtentTest test = extentReport.createTest("TC_CT01");
		    test.log(Status.PASS, "Title: "+commentstopics.TopicsTitle());
		    commentstopics.TopicsTitle();
		    Assert.assertEquals("Topics",commentstopics.TopicsTitle());
		    test.addScreenCaptureFromPath(Screenshot("TC_CT01"));
		}
	
	@Test
	void TC_CT_02() throws InterruptedException, IOException{
		 ExtentTest test = extentReport.createTest("TC_CT02");
		    test.log(Status.PASS, "Topics Tooltip: "+commentstopics.TopicsTooltip());
		    commentstopics.TopicsTooltip();
		    test.addScreenCaptureFromPath(Screenshot("TC_CT02"));
	    }
	
	@Test
	void TC_CT_03() throws InterruptedException, IOException {
		 ExtentTest test = extentReport.createTest("TC_CT03");
		    test.log(Status.PASS, "Bubbles Tooltip: "+commentstopics.BubbleTopics());
		    commentstopics.BubbleTopics();
		    test.addScreenCaptureFromPath(Screenshot("TC_CT03"));
	    }
	
	@Test
	void TC_CT_04() throws InterruptedException, IOException {
		 ExtentTest test = extentReport.createTest("TC_CT04");
		    test.log(Status.PASS, "Topics Bubble is clickable");
		    commentstopics.TopicsClick();
		    test.addScreenCaptureFromPath(Screenshot("TC_CT04"));
	    }
	
	@Test
	void TC_CT_05() throws InterruptedException, IOException {
		 ExtentTest test = extentReport.createTest("TC_CT05");
		    test.log(Status.PASS, "Bubbles are dragable");
		    commentstopics.BubbleDrag();
		    test.addScreenCaptureFromPath(Screenshot("TC_CT05"));
	    }
	
	@Test
	void TC_CT_06() throws IOException {
		 ExtentTest test = extentReport.createTest("TC_CT06");
		    test.log(Status.PASS, "Toggle view");
		    commentstopics.TopicsToggle();
	     	test.addScreenCaptureFromPath(Screenshot("TC_CT06"));
	    }

     @Test
     void TC_CT_07() throws IOException {
    	 ExtentTest test = extentReport.createTest("TC_CT07");
		    test.log(Status.PASS, "Topics are sortable");
		    commentstopics.TopicsSort();
	        test.addScreenCaptureFromPath(Screenshot("TC_CT07"));
    	}
     
     @Test
     void TC_CT_08() throws IOException {
    	 ExtentTest test = extentReport.createTest("TC_CT08");
		    test.log(Status.PASS, "ViewAll button is clickable");
		    commentstopics.viewAll();
	        test.addScreenCaptureFromPath(Screenshot("TC_CT08"));
    	}
     
     @Test
     void TC_CT_09() throws IOException, InterruptedException {
    	 ExtentTest test = extentReport.createTest("TC_CT09");
		    test.log(Status.PASS, "TopicsCount is clickable");
		    commentstopics.Topicscount();
	        test.addScreenCaptureFromPath(Screenshot("TC_CT09"));
	    }
     
     @Test
     void TC_CT_10() throws IOException {
    	 ExtentTest test = extentReport.createTest("TC_CT10");
		    test.log(Status.PASS, "Topics section is removed ");
		    commentstopics.Topicsremove();
	        test.addScreenCaptureFromPath(Screenshot("TC_CT10"));
	    }
	

}
