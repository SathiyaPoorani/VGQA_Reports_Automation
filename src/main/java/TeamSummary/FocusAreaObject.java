package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FocusAreaObject {

    public WebDriver driver;
    public FocusAreaObject(WebDriver newdriver){
//        WebDriver driver;
        driver = newdriver;
        PageFactory.initElements(newdriver, this);
    }


    @FindBy(how = How.XPATH, using = "//button[@class='btnWithVgIcon btnSlim btnCta glintButton ng-star-inserted']")
    @CacheLookup
    WebElement newfocusarea;

    public void clicknewfocusarea(){
        newfocusarea.click();
    }

    @FindBy(how = How.ID, using = "tab-1")
    @CacheLookup
    WebElement company;

    public void clickcompany(){
        company.click();
    }


}
