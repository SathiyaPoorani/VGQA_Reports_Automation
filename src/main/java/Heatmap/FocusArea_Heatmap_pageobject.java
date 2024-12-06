package HeatMap_Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FocusArea_Heatmap_pageobject {
	
	public WebDriver driver;
	
	public FocusArea_Heatmap_pageobject (WebDriver newdriver)
	{
		driver=newdriver;
		PageFactory.initElements(newdriver,this);
	}

	
                                         // WebElement Declarations
	
@FindBy(how=How.XPATH,using="//textarea[@data-id='goalTitle']")
@CacheLookup
WebElement Focusarea_title;

@FindBy(how= How.XPATH, using="//h1[text()='Viewing Your Focus Areas']")
@CacheLookup
WebElement viewing_goal;

@FindBy(how=How.XPATH,using="//button[@aria-label='More options...']")
@CacheLookup
WebElement Three_dot;

                                             // Method Declaration
public void Viewing_Goal_method() throws InterruptedException
{
	System.out.println(viewing_goal.getText());
	
	String ActualTitle =viewing_goal.getText();
	String ExpectedTitle =("Viewing Your Focus Areas");
	Assert.assertEquals(ActualTitle , ExpectedTitle);
	
		
}

public void Focusarea_Title_method()
{
     System.out.println(Focusarea_title.getText());	
}
	
public void Threedot_Method() 
{
	Three_dot.click();
}
	
	
	
	
}
