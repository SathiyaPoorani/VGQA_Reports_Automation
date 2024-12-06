package maven_testng.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MCQLocators {
	
	public WebDriver driver;
	public	MCQLocators	report;
	
	public MCQLocators(WebDriver newDriver) {
        driver = newDriver;
        PageFactory.initElements(driver, this);
    }
	
	//Locators Declaration
	
	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/glint-root[1]/div[1]/div[2]/div[1]/main[1]/div[1]/glint-report-landing[1]/glint-reports[1]/glint-panel[1]/div[1]/div[1]/div[1]/div[2]/div[1]/glint-report-tile-list[1]/ul[1]/li[1]/button[1]")
    @CacheLookup
    private WebElement execsummary;
	
    @FindBy(how = How.XPATH, using = "//div[@class='surveys']//li[8]//div[1]")
    @CacheLookup
    private     WebElement  Changing_Program;

    @FindBy(how = How.XPATH, using = "//div[@class='header mcqReport']")
    @CacheLookup
    private WebElement MCQbutton;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Settings']")
    @CacheLookup
    private WebElement settings_button;

    @FindBy(how = How.XPATH, using = "//div[@id='dropdownTrigger_glintDropdown_a646c268-3d0e-4caf-8c27-37995e4e0ade']")
    @CacheLookup
    private WebElement More_dropdown;

    @FindBy(how = How.XPATH, using = "//li[@id='option0']")
    @CacheLookup
    private WebElement Add_Section;

    @FindBy(how = How.XPATH, using = "//li[@id='option1']")
    @CacheLookup
    private WebElement search_comments;

    @FindBy(how = How.XPATH, using = "//div[@id='dropdownTrigger_glintDropdown_313fb2f8-97ed-4fbd-a8e6-ee01acd7ea70']")
    @CacheLookup
    private WebElement Manger_hierarchy_dropdown;

    @FindBy(how = How.XPATH, using = "//li[@id='option3']")
    @CacheLookup
    private WebElement Select_attribute22;




	public void clickexecsummary() {
        execsummary.click();
    }
	
    public  void     Click_Program_Change() {
        Changing_Program.click();
    }

    public void Click_MCQbutton(){
        MCQbutton.click();
    }
	
    public void Click_settingsbutton(){
        settings_button.click();
    }

    public void Click_More_dropdown(){
        More_dropdown.click();
    }

    public void Click_Add_Section(){
        Add_Section.click();
    }

    public void Click_search_comments(){
        search_comments.click();
    }

    public void Click_Manger_hierarchy_dropdown(){
        Manger_hierarchy_dropdown.click();
    }

    public void Click_Select_attribute22(){
        Select_attribute22.click();
    }

}

