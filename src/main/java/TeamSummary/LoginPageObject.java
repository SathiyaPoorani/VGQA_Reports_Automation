package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
    public WebDriver driver;                                //Initiating Driver

    public LoginPageObject(WebDriver newdriver){            //Constructor
        driver = newdriver;
        PageFactory.initElements(newdriver, this);
    }


    /**         Element Finding         **/

    @FindBy(how = How.ID, using = "email")                      // Email Address
    @CacheLookup
    WebElement emailid;

    public WebElement continuebtn(){
        WebElement cbutton = driver.findElement(By.xpath("//button[@class='btnCta glintButton']"));
         return cbutton;
    }

    @FindBy(how = How.ID, using = "clientUuid")                    //Client ID
    @CacheLookup
    WebElement companyid;

    @FindBy(how = How.ID, using = "password")                       //Password
    @CacheLookup
    WebElement password;

    /**         Assigning actions to Elements         **/

    public void setEmailid(String emailaddress){                    //Entering Email Address
        emailid.sendKeys(emailaddress);
    }
    public void setPassword(String pwd){                            //Entering Password
        password.sendKeys(pwd);
    }
    public void setCompanyid(String compid){                        //Entering Company ID
        companyid.sendKeys(compid);
    }
    public void setContinuebutton(){
        continuebtn().click();
    }
}
