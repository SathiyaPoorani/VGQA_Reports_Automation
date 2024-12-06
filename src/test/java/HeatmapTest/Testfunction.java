package HeatMap_TestFunction;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestBase.LoginTestbase;

public class Login_Testfuction extends LoginTestbase{
	
	
@BeforeMethod
public void launchBrowser() throws InterruptedException 
{
	openBrowser();
	LoginCredentials();
}
	
@Test
public void getPageTitle()
{
	System.out.println(driver.getTitle());
}

@Test
public void launchHeatmap() throws InterruptedException 
{	
	open_heatmapReport();
	changesurevy_method();
}


@Test
public void ViewReport_Heatmap() throws InterruptedException
{
	open_heatmapReport();
	changesurevy_method();
	Thread.sleep(3000);
	viewReport_method();
    driver.navigate().back();
    Thread.sleep(3000);
    driver.navigate().refresh();
}

@Test
public void TakeAction_Goal() throws InterruptedException 
{
	open_heatmapReport();
	changesurevy_method();
	Thread.sleep(3000);
	takeAction_method();
	Thread.sleep(3000);
    get_GoalTitle();
    driver.navigate().back();
    driver.navigate().refresh();
}

@Test
public void saveHeatmap_Report() throws InterruptedException
{
	
	open_heatmapReport();
	changesurevy_method();
	Thread.sleep(3000);
	viewReport_method();
	Thread.sleep(3000);
	saveAS_Report_method();
	}

@Test

public void delete_savedReports() throws InterruptedException
{
	deletereport();
}


@Test
public void select_Filters() throws InterruptedException
{
	open_heatmapReport();
	Addfilter_report();
}


@Test
public void get_mouseHover_score() throws InterruptedException 
{
	open_heatmapReport();
	changesurevy_method();
	mouseHover_method();
}


@Test
public void set_moveAfter_Question() throws InterruptedException
{
	open_heatmapReport();
	changesurevy_method();
	moveafter_method();
}

@Test
public void get_Ungrouped_qus() throws InterruptedException 
{	
	open_heatmapReport();
	changesurevy_method();
	select_ungrouped();
}

@Test
public void set_Editsection() throws InterruptedException
{
	open_heatmapReport();
	changesurevy_method();
	edit_Report();
}

@Test
public void set_AddsectionandRemove() throws InterruptedException
{
	open_heatmapReport();
	changesurevy_method();
	addsection_report_RemoveReport();
}

@Test
public void Add_benchmarklinkReport() throws InterruptedException
{
	open_heatmapReport();
	changesurevy_method();
	benchmark_reportlink();
}
@Test
public void openSettings_closeSettings() throws InterruptedException
{
	open_heatmapReport();
	changesurevy_method();
	Settings_Close_Report();
}
@Test
public void changingDropdown_saveData_GetText() throws InterruptedException
{
	open_heatmapReport();
	changesurevy_method();
	choose_ManagerTo_MotherName();
	saveAS_Report_method();
	get_saved_ReportText();
}

@Test
public void sorting() throws InterruptedException 
{	
	open_heatmapReport();
	changesurevy_method();
	select_sortOption();
}

}
