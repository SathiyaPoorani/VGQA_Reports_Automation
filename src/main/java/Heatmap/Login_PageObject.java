package HeatMap_Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login_PageObject {
	
	public WebDriver driver;
	
	
	public Login_PageObject(WebDriver newdriver)
	{
		driver=newdriver;
		PageFactory.initElements(newdriver, this);	}
	
	
	
//Element Declaration
	
@FindBy(how = How.ID, using="email")
@CacheLookup
WebElement EmailId;

@FindBy(how = How.ID, using="clientUuid")
@CacheLookup
WebElement ClientId;

@FindBy(how = How.ID, using="password")
@CacheLookup
WebElement Password;


public WebElement continue_button()
{
    WebElement cbutton = driver.findElement(By.xpath("//button[@class='btnCta glintButton']"));
     return cbutton;
}

// Method Declaration for each locators


public void enter_mailid(String usermail) 
{
	EmailId.sendKeys(usermail);
	
}

public void enter_clientid(String userid)
{
	ClientId.sendKeys(userid);

}

public void enter_password(String pswd)
{
	Password.sendKeys(pswd);
}


public void setContinuebutton()
{
	continue_button().click();
}


}
