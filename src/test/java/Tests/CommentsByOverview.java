package Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import CommentsReport.CommentsOverview;
import CommentsReport.Login;


public class CommentsByOverview extends VivaLogin{

	Login login ;
	CommentsOverview commentsOverview ;
	
	
	@BeforeClass
	void setObject() {
		login = new Login(driver);
		commentsOverview = new CommentsOverview(driver);
		
		login.login(prop.getProperty("email"),
				prop.getProperty("clientid"),
				prop.getProperty("password"));
      login.survey(prop.getProperty("survey"));	
      }
	
	@Test
	void TC_CO_01() throws IOException, InterruptedException{
		ExtentTest test = extentReport.createTest("TC_CO01");
		test.log(Status.INFO, "Title:"+commentsOverview.commentsTitle());
		test.assignCategory("SMOKE TEST");
		test.assignAuthor("QA - Sathiya");
		commentsOverview.commentsTitle();
		Assert.assertEquals(commentsOverview.commentsTitle(), "Comments");
		test.addScreenCaptureFromPath(Screenshot("TC_CO01"));
		}
	
	@Test
	void TC_CO_02() throws IOException{
		ExtentTest test = extentReport.createTest("TC_CO02");
		test.log(Status.INFO, "Commentscount is displayed");
		test.assignCategory("SMOKE TEST");
		test.assignAuthor("QA - Sathiya");
		commentsOverview.Commentscount();
		test.addScreenCaptureFromPath(Screenshot("TC_CO02"));
		}
	
	@Test
	void TC_CO_03() throws IOException{
		ExtentTest test = extentReport.createTest("TC_CO03");
		test.log(Status.INFO, "Commentscount:"+commentsOverview.Count());
		test.assignCategory("SMOKE TEST");
		test.assignAuthor("QA - Sathiya");
		test.addScreenCaptureFromPath(Screenshot("TC_CO03"));
		}
	
	@Test
	void TC_CO_04() throws InterruptedException, IOException{
		ExtentTest test = extentReport.createTest("TC_CO04");
		test.log(Status.INFO, "Commentsoverview Tooltip: "+commentsOverview.OverviewTooltip());
		test.assignCategory("SMOKE TEST");
		test.assignAuthor("QA - Sathiya");
		commentsOverview.OverviewTooltip();
		test.addScreenCaptureFromPath(Screenshot("TC_CO04"));
		}
	
	@Test
	void TC_CO_05() throws IOException{
		ExtentTest test = extentReport.createTest("TC_CO05");
		test.log(Status.INFO,"SentimentText:" +commentsOverview.sentimenttext());
		test.assignCategory("SMOKE TEST");
		test.assignAuthor("QA - Sathiya");
		commentsOverview.sentimenttext();
		test.addScreenCaptureFromPath(Screenshot("TC_CO05"));
		}
	
	@Test
	void TC_CO_06() throws IOException{
		ExtentTest test = extentReport.createTest("TC_CO06");
		test.log(Status.INFO, "Topics are clickable in overview section");
		test.assignCategory("SMOKE TEST");
		test.assignAuthor("QA - Sathiya");
		commentsOverview.topicsButton();
		test.addScreenCaptureFromPath(Screenshot("TC_CO06"));
		}
	
	@Test
	void TC_CO_07() throws InterruptedException, IOException{
		ExtentTest test = extentReport.createTest("TC_CO07");
		test.log(Status.INFO, "Topicsbutton is clickable");
		test.assignCategory("SMOKE TEST");
		test.assignAuthor("QA - Sathiya");
		commentsOverview.topicsclick();
		test.addScreenCaptureFromPath(Screenshot("TC_CO07"));
		}
	
	@Test
	void TC_CO_08() throws InterruptedException, IOException{
		ExtentTest test = extentReport.createTest("TC_CO08");
		test.log(Status.INFO, "CommentsSlider is closed");
		test.assignCategory("SMOKE TEST");
		test.assignAuthor("QA - Sathiya");
		commentsOverview.topicsclose();
		test.addScreenCaptureFromPath(Screenshot("TC_CO08"));
		}
	
	@Test
	void TC_CO_09() throws IOException{
		ExtentTest test = extentReport.createTest("TC_CO09");
		test.log(Status.INFO, "Topicslink navigates to Topics Section");
		test.assignCategory("SMOKE TEST");
		test.assignAuthor("QA - Sathiya");
		commentsOverview.topicslink();
		test.addScreenCaptureFromPath(Screenshot("TC_CO09"));
		}

	@Test
	void TC_CO_10() throws IOException{
		ExtentTest test = extentReport.createTest("TC_CO10");
		test.log(Status.INFO, "Commentsoverview Section is removed "
				+ " Toaster message:  "+commentsOverview.Sectionremove());
		test.assignCategory("SMOKE TEST");
		test.assignAuthor("QA - Sathiya");
		commentsOverview.Sectionremove();
		test.addScreenCaptureFromPath(Screenshot("TC_CO10"));
		}
	
	
	
}


