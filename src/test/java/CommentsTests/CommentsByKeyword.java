package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import CommentsReport.CommentsKeyword;
import CommentsReport.Login;

public class CommentsByKeyword  extends VivaLogin {

	Login login ;
	CommentsKeyword commentskeyword ;
	
	
	@BeforeClass
	void setObject() {
		login = new Login(driver);
		commentskeyword = new CommentsKeyword(driver);
		
		login.login(prop.getProperty("email"),
				prop.getProperty("clientid"),
				prop.getProperty("password"));
      login.survey(prop.getProperty("survey"));	
      }

	@Test
	void TC_CK_01() throws IOException{
		    ExtentTest test = extentReport.createTest("TC_CK01");
		    test.log(Status.PASS, "Title: "+commentskeyword.KeyTitle());
		    commentskeyword.KeyTitle();
			test.addScreenCaptureFromPath(Screenshot("TC_CK01"));

			}
	@Test
	void TC_CK_02() throws InterruptedException, IOException{
		ExtentTest test = extentReport.createTest("TC_CK02");
	    test.log(Status.PASS, "Keywords Tooltip: "+commentskeyword.KeyTooltip());
	    commentskeyword.KeyTooltip();
		test.addScreenCaptureFromPath(Screenshot("TC_CK02"));
		
	    }
	@Test
	void TC_CK_03() throws IOException {
		ExtentTest test = extentReport.createTest("TC_CK03");
	    test.log(Status.PASS, "Keywords are clickable");
	    commentskeyword.KeyClick();
		test.addScreenCaptureFromPath(Screenshot("TC_CK03"));
	    }
	@Test
	void TC_CK_04() throws IOException {
		ExtentTest test = extentReport.createTest("TC_CK04");
	    test.log(Status.PASS, "Toggle view is clickable");
	    commentskeyword.KeyToggle();
		test.addScreenCaptureFromPath(Screenshot("TC_CK04"));
		}
	@Test
	void TC_CK_05() throws IOException {
		ExtentTest test = extentReport.createTest("TC_CK05");
	    test.log(Status.PASS, "Keywords are sorted");
	    commentskeyword.KeySort();
		test.addScreenCaptureFromPath(Screenshot("TC_CK05"));
		}
	@Test
	void TC_CK_06() throws IOException  {
		ExtentTest test = extentReport.createTest("TC_CK06");
	    test.log(Status.PASS,"KeywordsCount are clickable");
	    commentskeyword.Keycount();
	    test.addScreenCaptureFromPath(Screenshot("TC_CK06"));
	}
	
	@Test
	void TC_CK_07() throws IOException {
		ExtentTest test = extentReport.createTest("TC_CK07");
	    test.log(Status.PASS, "Keywords Section is removed");
	    commentskeyword.Keyremove();
		test.addScreenCaptureFromPath(Screenshot("TC_CK07"));
		
	}
}
