package HeatMap_Pageobjects;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class heatmap_filters_pageobject {
	
	public WebDriver driver;
	
	public  String ActualTitle;
	
	public String ExpectedTitle;
	
	//public WebDriverWait wait;
	
	
public heatmap_filters_pageobject(WebDriver newdriver)
	{
		driver=newdriver;
		PageFactory.initElements( newdriver,this);
	}
		
                                             //view Report part	
	
@FindBy(how = How.XPATH, using="(//div[@data-label='Question'])[4]")
@CacheLookup
WebElement qus4;	

@FindBy(how = How.XPATH, using="//li[@data-value='ViewReport']")
@CacheLookup
WebElement viewReport;	

@FindBy(how = How.XPATH, using="(//li[@class='moveAction ng-star-inserted'])[3]")
@CacheLookup
WebElement takeAction;	


                                      //change survey 

@FindBy(how = How.XPATH, using="//div[@class='menuContainer applyMaxWidthMenuContainer']")
@CacheLookup
WebElement changeSurevy_dropdown;	
	

@FindBy(how = How.ID, using="option1")
@CacheLookup
WebElement select_Surevy;	
	
                                       //Filter Locators	
	
	
@FindBy(how = How.XPATH, using="//button[@class='addFilterButtonPanel ng-star-inserted']")
@CacheLookup
WebElement filter;

@FindBy(how = How.XPATH, using="//span[text()='Add Filters']")
@CacheLookup
WebElement Addfilter;

@FindBy(how = How.XPATH, using="//div[text()='Birth Year']")
@CacheLookup
WebElement Birthyear_filter;


@FindBy(how = How.XPATH, using="//div[@class='filterEditorRow ng-star-inserted']")
@CacheLookup
WebElement AgeNumber;

@FindBy(how = How.XPATH, using="//button[text()=' Done ']")
@CacheLookup
WebElement doneButton;

@FindBy(how = How.XPATH, using="//button[@class='btnWithVgIcon subtleBtn footerButton glintButton ng-star-inserted']")
@CacheLookup
WebElement closefilterIcon;

                                     // Mouse hover for score

@FindBy(how = How.XPATH, using="(//button[@class='content BUCKET_2 ng-star-inserted'])[2]")
@CacheLookup
WebElement mouse_hover;

@FindBy(how = How.XPATH, using="//div[@data-id='glintTooltip']")
@CacheLookup
WebElement mousehover_Score;


                                        // move after section

@FindBy(how = How.XPATH, using="(//button[@class='moveActionMenuButton popupMenuButton btnIcon glintButton'])[5]")
@CacheLookup
WebElement moveafter_dropdown;

@FindBy(how = How.XPATH, using="//span[text()=' Move After ']")
@CacheLookup
WebElement moveafter;

@FindBy(how = How.XPATH, using="(//button[@class='subMenuItemButton'])[1]")
@CacheLookup
WebElement moveafter_question;

                                          // Ungrouped element

@FindBy(how = How.XPATH, using="(//input[@type='radio'])[2]")
@CacheLookup
WebElement Ungrouped;
                                          //edit section

@FindBy(how = How.XPATH, using="(//div[@aria-label='undefinedmenu'])[2]")
@CacheLookup
WebElement threedot;

//@FindBy(how = How.XPATH, using="//li[@data-value='EDIT']")
@FindBy(how = How.XPATH, using="//li[@id='option0']")
@CacheLookup
WebElement editbutton;

@FindBy(how = How.XPATH, using="(//div[@aria-haspopup='listbox'])[12]")
@CacheLookup
WebElement editdropdown;

@FindBy(how = How.XPATH, using="//li[@id='option1']")
@CacheLookup
WebElement editdropdown_option;

@FindBy(how = How.XPATH, using="//div[@aria-labelledby='heatmapCellMetricConfigurationLabel']")
@CacheLookup
WebElement scoresdropdown;

@FindBy(how = How.ID , using="option4")
@CacheLookup
WebElement scoresdropdown_option;

@FindBy(how = How.XPATH, using="//div[@class='slideyHeaderTools']")
@CacheLookup
WebElement Donebutton;

                              //sorting

@FindBy(how = How.XPATH, using="(//div[@class='popupMenuContainer ng-star-inserted'])[12]")
@CacheLookup
WebElement sort_dropdown;

@FindBy(how = How.XPATH, using="(//div[@data-value='LOWEST_SCORE'])[1]")
@CacheLookup
WebElement sort_qus;

@FindBy(how = How.XPATH, using="(//div[@data-value='ALPHABETICAL'])[2]")
@CacheLookup
WebElement sort_population;



 
                                              //add section and delete section

@FindBy(how = How.XPATH, using="//div[@aria-label='Report Actions Menu']")
@CacheLookup
WebElement MoreDropdown;

@FindBy(how = How.XPATH, using="//li[@aria-label='Add section']")
@CacheLookup
WebElement addSection;

@FindBy(how = How.XPATH, using="//div[@data-id='QUESTION_OVERVIEW']")
@CacheLookup
WebElement addSection_survey;

@FindBy(how = How.XPATH, using="//div[@aria-label='Key Outcomemenu']")
@CacheLookup
WebElement addedSurvey_threeDot;

@FindBy(how = How.XPATH, using="//li[@aria-label='Remove']")
@CacheLookup
WebElement removeButton;

                                                   //benchmark link
@FindBy(how = How.XPATH, using="//button[@class='inlineBtnLink currentBenchmark glintButton ng-star-inserted']")
@CacheLookup
WebElement benchmark_link;

@FindBy(how = How.XPATH, using="(//label[@class='label ng-star-inserted'])[2]")
@CacheLookup
WebElement benchmark_text;
 
@FindBy(how = How.XPATH, using="(//input[@type='radio'])[9]")
@CacheLookup
WebElement internal_benchmarkt;

@FindBy(how = How.XPATH, using="(//div[@class=\"radioOption ng-star-inserted\"])[9]") //(//div[@class="radioOption ng-star-inserted"])[9]
@CacheLookup
WebElement external_benchmarkt;

@FindBy(how = How.XPATH, using="//button[@class='btnCta glintButton']")
@CacheLookup
WebElement Donebutton_benchmark;
                                              //export report

@FindBy(how = How.XPATH, using="//div[@aria-label='Report Export Options Menu']")
@CacheLookup
WebElement exportButton;

@FindBy(how = How.XPATH, using="//li[@id='option0']")
@CacheLookup
WebElement export_PPT;

@FindBy(how = How.XPATH, using="//button[@class='btnCta glintButton']")
@CacheLookup
WebElement export_PPT_button;


                                             //settings
@FindBy(how = How.XPATH, using="//button[@aria-label='Settings']")
@CacheLookup
WebElement settings_icon;

@FindBy(how = How.XPATH, using="//button[@data-id='slideyClose_SECTION_EDIT_SLIDEY']")
@CacheLookup
WebElement close_icon;

                                            // changing manager to mother name dropdown
@FindBy(how = How.XPATH, using="(//div[@aria-haspopup='listbox'])[7]")
@CacheLookup
WebElement Manager_dropdown;

public WebElement managerdropdown_button()
{
    WebElement mbutton = driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[7]"));
     return mbutton;
}

@FindBy(how = How.ID, using="option96")
@CacheLookup
WebElement Mothername_dropdown;


                                                   //view report method

public void click_Qus_Basepay() throws InterruptedException 
{
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
    
    Thread.sleep(3000);
    
    qus4.click();
}

public void click_viewReport() throws InterruptedException 
{
	Thread.sleep(3000);
    viewReport.click();   
}
public void click_takeAction()
{
    takeAction.click();
}

                                        //filters method

public void click_filter_method() 
{
	filter.click();
}

public void click_addfilter_method() 
{
	Addfilter.click();
}

public void click_birthyear_filter_method() 
{

	Birthyear_filter.click();	
}
public void select_ageNumber() 
{
	List<WebElement> els = driver.findElements(By.xpath("//input[@type='checkbox']"));
	for ( WebElement el : els ) 
	{
//    if (el.getAttribute("value").equals(" 1998 ")||(el.getAttribute("value")).equals(" 1999 "))
//	    {
//	        el.click();
//	    }
		el.click();
	 }
}
public void click_doneBtton() 
{
	doneButton.click();
}
public void click_closefiltericon() 
{
	closefilterIcon.click();
}
                                         // MOUSE HOVER METHOD

public void MouseHover_action() 
{
	WebElement ele = mouse_hover;
	Actions action = new Actions(driver);
	action.moveToElement(ele).perform();
}

public void get_mouseHoverSCORE() 
{
	System.out.println(mousehover_Score.getText());
	
	String ActualTitle = mousehover_Score.getText();
	//String ExpectedTitle =("Score 50\r\n"+"Company 50\r\n"+"Pulsed on Dec 20, 2023");
	String ExpectedTitle =("Score 50\r\n"+"Company_updated 50"+"Pulsed on Oct 13, 2019");
	Assert.assertEquals(ActualTitle , ExpectedTitle);
	
//	String getActualTitle = mousehover_Score.getText();
//	Assert.assertEquals(getActualTitle, "Score 50\r\n"
//			 	+"Company 50\r\n"
//			 	+"Pulsed on Dec 20, 2023");
}


                                              // move after method

public void click_dropdown_moveAfter() 
{
	moveafter_dropdown.click();
}

public void click_moveAfter() 
{
	moveafter.click();
}

public void select_onequestion_formoveAfter() 
{
	moveafter_question.click();
}

                                           // change survey method

public void click_surveyDropdown() throws InterruptedException 
{
		Thread.sleep(3000);
	changeSurevy_dropdown.click();
}

public void select_decemberSurvey() throws InterruptedException 
{
	Thread.sleep(3000);
	System.out.println(select_Surevy.getText());
	select_Surevy.click();
}   
                                               //ungrouped method

public void ungrouped_method() 
{
	Ungrouped.click();
}
                                             
                                              //edit section method
public void threedot_method() 
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,600)", "");
	threedot.click();
}

public void editbutton_method() 
{
	editbutton.click();
}

public void editdropdown_method() 
{
	editdropdown.click();
}

public void select_editdropdown_option__method() 
{
	editdropdown_option.click();
}

public void scoresdropdown_method() 
{
	scoresdropdown.click();
}

public void select_scoresdropdown_option_method() 
{
	scoresdropdown_option.click();
}
public void Donebutton_method() 
{
	Donebutton.click();
}
public void MoreDropdown_method() 
{
	MoreDropdown.click();
}
public void addSection_method() 
{
	addSection.click();
}
                                                    // add section and remove method
public void addSection_survey_method() 
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,600)", "");
	addSection_survey.click();
}

public void addedSurvey_threeDot_method() 
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,1000)", "");
	addedSurvey_threeDot.click();
}

public void removeButton_method() 
{
	removeButton.click();
}

                                                         // benchmark link method
public void click_benchmark_link_method() 
{
	benchmark_link.click();
}
public void benchmark_text_method() 
{
	System.out.println(benchmark_text.getText());
}
public void select_internal_benchmark_method() 
{
	internal_benchmarkt.click();
}
public void select_external_benchmark_method() 
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,500)", "");
	external_benchmarkt.click();
}
public void click_doneButton_benchmark_method() 
{
	Donebutton_benchmark.click();
}
                                                       //export method
public void click_exportButton_method() 
{
	exportButton.click();
}
public void click_exportPPT_method() 
{
	export_PPT.click();
}
public void click_exportPPT_button_method() 
{
	export_PPT_button.click();
}

                                         //settings method
public void click_settingIcon_method()
{
	settings_icon.click();
}
public void click_closeIcon_method() throws InterruptedException 
{
	
//    WebElement frame3 = driver.findElement(By.xpath("(//iframe[@class='resizeDetector'])[3]"));	
//	  driver.switchTo().frame(frame3);
	
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,700)", "");
    
    Thread.sleep(3000);

    JavascriptExecutor js1 = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,-700)", "");
   
	close_icon.click();
}
                                       // manager to change attribute data method

public void click_managerDropdown_method()
{
	Manager_dropdown.click();
}
public void select_motherName_method() throws InterruptedException
{
	Mothername_dropdown.click();
}
public void click_managerDropdown()
{
	managerdropdown_button().click();
}
   

                                      // sorting
public void click_sortDropdown() throws InterruptedException
{
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,750)", "");
	sort_dropdown.click();
	Thread.sleep(5000);
}

public void click_sortQus_method()
{
	sort_qus.click();
}
 
public void click_SortPopulation_method()
{
	sort_population.click();
}

}