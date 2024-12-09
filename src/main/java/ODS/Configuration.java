package ODS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Configuration {

    // WebDriver instance
    public WebDriver driver;
    public LoginPOM logtestODS;
    public	Configuration	confi;


    public   Configuration(WebDriver newDriver) {
        driver = newDriver;
        PageFactory.initElements(driver, this);
    }

   

    // Page Object Model (ODS) elements
    @FindBy(how = How.XPATH, using = "/html/body/glint-root/div/div[2]/div/glint-header/header/div[3]/div/div/ul/li[2]/a")
    @CacheLookup
    public WebElement configu;

    @FindBy(how = How.XPATH, using = "//li[@data-id='programs']//div[@class='circle']")
    @CacheLookup
    public WebElement programs;

    @FindBy(how = How.XPATH, using = "//li[@data-id='people']//div[@class='circle']")
    @CacheLookup
    public WebElement people;

    @FindBy(how = How.XPATH, using = "//button[@class='btnWithVgIcon btnExport glintButton']")
    @CacheLookup
    public WebElement pplexport;

    @FindBy(how = How.XPATH, using = "//button[@class='btnCta glintButton']")
    @CacheLookup
    public WebElement exportbtn;

    @FindBy(how = How.XPATH, using = "//div[@class='sidePane filterList ng-star-inserted']//div[1]//ul[1]//li[3]//div[1]")
    @CacheLookup
    public WebElement inacemp;

    @FindBy(how = How.XPATH, using = "//*[@id=\"vg-panel0\"]/div/div/div/div[1]/glint-facet-list/div[1]/ul/li[5]/div")
    @CacheLookup
    public WebElement supportemp;

    @FindBy(how = How.XPATH, using = "//button[@id='peopleActionsDropdown']")
    @CacheLookup
    public WebElement peopleactions;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Manage User Attributes']")
    @CacheLookup
    public WebElement manageuserattr;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Active Attributes']")
    @CacheLookup
    public WebElement activeattr;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Derived Attributes']")
    @CacheLookup
    public WebElement derivedattr;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Optional System Attributes']")
    @CacheLookup
    public WebElement optionalattr;

    @FindBy(how = How.XPATH, using = "//span[normalize-space()='Hierarchy Groups']")
    @CacheLookup
    public WebElement hierarchygrp;

    @FindBy(how = How.XPATH, using = "//*[@id=\"vg-panel0\"]/div/div/div/div[1]/glint-facet-list/div[2]/ul/li[1]/div")
    @CacheLookup
    public WebElement companyadmin;

    @FindBy(how = How.XPATH, using = "//*[@id=\"vg-panel0\"]/div/div/div/div[1]/glint-facet-list/div[2]/ul/li[2]/div")
    @CacheLookup
    public WebElement Userrole_1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"vg-panel0\"]/div/div/div/div[1]/glint-facet-list/div[2]/ul/li[3]/div")
    @CacheLookup
    public WebElement Userrole_2;

    @FindBy(how = How.XPATH, using = "//*[@id=\"manageAttributesSlidey\"]/div/div[3]/div/div/section/div/div[2]/div[2]/table/tbody/tr[9]/td[4]/vg-menu/div/button")
    @CacheLookup
    public WebElement user_attribute_eg;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='Edit attribute']")
    @CacheLookup
    public WebElement edit_attribute_button;

    @FindBy(how = How.XPATH, using = "//*[@id=\"editAttributeDialog\"]/div/div[2]/div/form/div[2]/div/glint-toggle")
    @CacheLookup
    public WebElement checkboxCAV;

    @FindBy(how = How.XPATH, using = "/html/body/glint-root/div/div[2]/div/main/div/glint-config/div/div/section/glint-core-people-ng/glint-core-people-list/div/glint-panel/div/header/div[1]/div[1]/div/div/div/h1")
    @CacheLookup
    public WebElement ppltext;

    @FindBy(how = How.XPATH, using = "//h1[@class='userName']//button[@aria-label='Edit']")
    @CacheLookup
    public WebElement pencilbtn;

    @FindBy(how = How.XPATH, using = "(//input[@placeholder='Search People'])[1]")
    @CacheLookup
    public WebElement search_box;

    @FindBy(how=How.XPATH, using = "//*[@id=\"vg-panel0\"]/div/div/div/div[2]/table/tfoot/tr/td/glint-paging/div/nav/ol/li[3]/a")
    @CacheLookup
    public WebElement Paginationbtn;

    @FindBy(how=How.XPATH, using="(//button[@class='btnWithIcon btnImport glintButton'])[1]")
    @CacheLookup
    public WebElement importbtn;

    @FindBy(how=How.XPATH, using="(//button[@aria-label='Back'])[1]")
    @CacheLookup
    public WebElement backbtn;

    @FindBy(how=How.XPATH,using="//p[normalize-space()='650']")
    @CacheLookup
    public WebElement usercount;

    // Methods for interacting with the elements in ODS

    public void clickconfig()
    {
        confi = new Configuration(driver); 
        confi.configu.click(); 
    }

    public void clickprograms() 
    {
        confi.programs.click(); 
    }

    public void clickpeople() 
    {
        confi.people.click();
    }

    public void clickpplexport() { 
        confi.pplexport.click(); 
        confi.exportbtn.click();
    }

    public void checkpplpagebutton() { 
        confi.inacemp.click(); 
        confi.supportemp.click(); 
    }

    public void attrbuttoncheck() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        confi.peopleactions.click();
        confi.manageuserattr.click();
        activeattr.click();
        confi.derivedattr.click();
        confi.optionalattr.click();
    }

    public void clickcompanyadmin() {
        confi.companyadmin.click();
    }

    public void clickUserrole1() {
        confi.Userrole_1.click();
    }

    public void clickUserrole2() {
        confi.Userrole_2.click();
    }

    public void clickuserattribute() {
        confi.user_attribute_eg.click();
        confi.edit_attribute_button.click();
    }

    public void peopleActions_button() {
        confi.peopleactions.click();
        confi.manageuserattr.click();
    }

    public void CAV_Button() {
        confi.checkboxCAV.click();
    }

    public String PeopleText() {
        return confi.ppltext.getText();
    }

    public void clickanyuserbutton() {
        driver.findElement(By.xpath("//td[normalize-space()='vkini@glintinc.com']")).click();
    }

    public void checkPencilButton() {
        confi.pencilbtn.isDisplayed();
    }

    public void searchBox(String text) {
        confi.search_box.sendKeys(text);
    }

    public void Paginationbutton() {
        confi.Paginationbtn.click();
    }

    public void ImportButton() {
        confi.importbtn.click();
    }

    public void backbutton()
    {
        confi.backbtn.click();
    }

    public String Usercount() {
        return confi.usercount.getText();
    }


    // Browser setup and login methods
    public void openBrowserODS() throws InterruptedException {
        //driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vgqa.glint.cloud.dev.microsoft/session/auth");
        Thread.sleep(2000);
    }

    public void LoginCredentialsODS() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //confi = new CombinedTest(driver);
        logtestODS = new LoginPOM(driver);
        logtestODS.enterEmailId("qatester@glintinc.com");
        logtestODS.clickContinueButton();
        logtestODS.enterClientId("qa20240909");
        logtestODS.clicksubmitButton();
        logtestODS.enterPassword("Dem0@pass2");
        logtestODS.clickpasssubmitButton();
        Thread.sleep(5000);
    }
}
