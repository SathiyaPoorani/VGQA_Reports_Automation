package driverImpactReport;
import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import Glint.LoginGlint;
import Glint.DriverImpactReport;

public class VivaDriverImpactReport extends VIVALogin {
	LoginGlint login;
	DriverImpactReport dir;

	@BeforeClass
	void setObject() {
		login = new LoginGlint(driver);
		dir = new DriverImpactReport(driver);

		login.login(prop.getProperty("email"), prop.getProperty("clientid"), prop.getProperty("password"));
		login.survey(prop.getProperty("survey"));
	}
	@Test(priority = 1)
	public void Tc_01() throws IOException {

		ExtentTest test = extentReport.createTest("Tc_01");
		test.log(Status.PASS, "Title: " + dir.DIRTitle());
		dir.DIRTitle();
		Assert.assertEquals("Driver Impact", dir.DIRTitle());
		test.addScreenCaptureFromPath(Screenshot("Tc_01"));
	}
	@Test(priority = 2)
	public void Tc_02() throws IOException, InterruptedException {
		ExtentTest test = extentReport.createTest("Tc_02");
		//test.log(Status.PASS, "Grouped checkbox for Scoresection is displaying");
		dir.grouped();
		test.addScreenCaptureFromPath(Screenshot("Tc_02"));
	}
	@Test(priority = 3)
	public void Tc_03() throws IOException, InterruptedException {
		ExtentTest test = extentReport.createTest("Tc_03");
		//test.log(Status.PASS, "Grouped checkbox for Scoresection is displaying");
		dir.ungrouped();
		test.addScreenCaptureFromPath(Screenshot("Tc_03"));

	}
	
	@Test(priority = 4)
	public void Tc_04() throws IOException, InterruptedException {
		ExtentTest test = extentReport.createTest("Tc_04");
		//test.log(Status.PASS, "Report is saved");
		dir.ChangeComparison(); ;
		test.addScreenCaptureFromPath(Screenshot("Tc_04"));
	
	}
	
	@Test(priority = 5)
	public void Tc_05() throws IOException, InterruptedException {
		ExtentTest test = extentReport.createTest("Tc_05");
		//test.log(Status.PASS, "Report is saved");
		dir.ChangeDriver(); ;
		test.addScreenCaptureFromPath(Screenshot("Tc_05"));
	}
	
//	@Test(priority = 6)
//	public void Tc_04() throws IOException, InterruptedException {
//		ExtentTest test = extentReport.createTest("Tc_06");
//		//test.log(Status.PASS, "Report is saved");
//		dir.SaveReport();
//		test.addScreenCaptureFromPath(Screenshot("Tc_06"));
//	}
	
	
}
