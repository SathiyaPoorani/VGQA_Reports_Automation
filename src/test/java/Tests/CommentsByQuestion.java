package Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import CommentsReport.CommentsQuestion;
import CommentsReport.Login;

public class CommentsByQuestion extends VivaLogin {

	Login login ;
	CommentsQuestion commentsquestion ;
	
	
	@BeforeClass
	void setObject() {
		login = new Login(driver);
		commentsquestion = new CommentsQuestion(driver);
		
		login.login(prop.getProperty("email"),
				prop.getProperty("clientid"),
				prop.getProperty("password"));
      login.survey(prop.getProperty("survey"));	
      }
	
	@Test
	void TC_CQ_01() throws IOException{
		 ExtentTest test = extentReport.createTest("TC_CQ01");
		test.log(Status.PASS, "Title:"+commentsquestion.QuestionTitle());
		commentsquestion.QuestionTitle();
		Assert.assertEquals("Questions",commentsquestion.QuestionTitle());
		test.addScreenCaptureFromPath(Screenshot("TC_CQ01"));
		}
	
	@Test
	void TC_CQ_02() throws InterruptedException, IOException{
		 ExtentTest test = extentReport.createTest("TC_CQ02");
		 test.log(Status.PASS,"Question Tooltip: "+commentsquestion.QuestionTooltip());
		 commentsquestion.QuestionTooltip();
		test.addScreenCaptureFromPath(Screenshot("TC_CQ02"));
	    }
	
	@Test
	void TC_CQ_03() throws IOException {
		 ExtentTest test = extentReport.createTest("TC_CQ03");
		 test.log(Status.PASS,"QuestionVolume: "+commentsquestion.Questionvolume());
		 commentsquestion.Questionvolume();
		test.addScreenCaptureFromPath(Screenshot("TC_CQ03"));
	    }
	
	@Test
	void TC_CQ_04() throws IOException {
		 ExtentTest test = extentReport.createTest("TC_CQ04");
		test.log(Status.PASS, "QuestionDriver: "+commentsquestion.Questiondriver());
		commentsquestion.Questiondriver();
		System.out.println(commentsquestion.Questiondriver());
		test.addScreenCaptureFromPath(Screenshot("TC_CQ04"));
	    }
	
	@Test
	void TC_CQ_05() throws IOException {
		 ExtentTest test = extentReport.createTest("TC_CQ05");
		 test.log(Status.PASS,"Question is Clickable");
		 commentsquestion.QuestionClick();
		test.addScreenCaptureFromPath(Screenshot("TC_CQ05"));
		}
	
	@Test
	void TC_CQ_06() throws IOException {
		 ExtentTest test = extentReport.createTest("TC_CQ06");
		test.log(Status.PASS, "Question Section toggle view");
		commentsquestion.QuestionToggle();
		test.addScreenCaptureFromPath(Screenshot("TC_CQ06"));
		}
	
	@Test
	void TC_CQ_07() throws IOException  {
		 ExtentTest test = extentReport.createTest("TC_CQ07");
		 test.log(Status.PASS, "Questioncount is Clickable ");
		 commentsquestion.Questioncount();
	    test.addScreenCaptureFromPath(Screenshot("TC_CQ07"));
	    }
	
	@Test
	void TC_CQ_08() throws IOException {
		 ExtentTest test = extentReport.createTest("TC_CQ08");
		    test.log(Status.PASS, "Question is sortable");
		    commentsquestion.QuestionSort();
		try {
			test.addScreenCaptureFromPath(Screenshot("TC_CQ08"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	
	@Test
	void TC_CQ_09() throws IOException {
		 ExtentTest test = extentReport.createTest("TC_CQ09");
		    test.log(Status.PASS, "ConnectedTopics is clickable");
		    commentsquestion.ConnectedTopics();
		System.out.println(commentsquestion.ConnectedTopics());
		try {
			test.addScreenCaptureFromPath(Screenshot("TC_CQ09"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	    }
	
	@Test
	void TC_CQ_10() throws IOException {
		 ExtentTest test = extentReport.createTest("TC_CQ10");
		test.log(Status.PASS, "Section is removed"+commentsquestion.Questionremove());
		commentsquestion.Questionremove();
		test.addScreenCaptureFromPath(Screenshot("TC_CQ10"));
	    }
	
}
