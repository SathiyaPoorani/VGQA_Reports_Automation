package driverImpactReport;

import java.security.PublicKey;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OpenDIR extends Login {
	
@Test(priority = 0)
	public void SearchProgram()  {
	iwait();
	WebElement SearchSurvey = driver.findElement(By.xpath("//input[@placeholder='Search programs']"));
	SearchSurvey.sendKeys("Engagement");
	SearchSurvey.findElement(By.xpath("//*[@data-id='4f4d931d-330b-4f5f-b2bb-12800f963eb5']")).click();
	}

@Test(priority = 1)
	public void OpenDriverImpactReport() {
		iwait();
		WebElement OpenReport = driver.findElement(By.xpath("//*[@id=\'broader-team-summary-tile-729038c8-8456-4e04-8aa7-46ed742128d0\']/div"));
		OpenReport.click();
	}
@Test(priority = 2)
	public void Grouped() {
		iwait();
		WebElement group = driver.findElement(By.xpath("//*[@id=\'grouped_be70c1e6-2d46-46ae-a201-d67c02accb9d\']"));
		group.click();
}
@Test(priority = 3)
	public void Ungrouped() {
		iwait();
		WebElement Ungroup = driver.findElement(By.xpath("//*[@id=\'ungrouped_be70c1e6-2d46-46ae-a201-d67c02accb9d\']"));
		Ungroup.click();
	}
	 
@Test(priority = 4)
	public void ChangeComparison() {
	iwait();
	driver.findElement(By.xpath("//*[@id=\'sectionbe70c1e6-2d46-46ae-a201-d67c02accb9d\']/vg-section-layout/div/vg-layout-header/div/div/div/glint-driver-impact-header/div[1]/p/button[1]")).click();
	iwait();
//	Select  CompariosnDropdown = new Select(driver.findElement(By.xpath("//*[@id=\'configureSection\']/glint-slidey/div/div[3]/div/div/section/div/glint-report-section-form/form/div[1]/glint-dropdown/div/div")));
//	CompariosnDropdown.selectByVisibleText("Average Question");
	driver.findElement(By.xpath("//*[@id=\'configureSection\']/glint-slidey/div/div[3]/div/div/section/div/glint-report-section-form/form/div[1]/glint-dropdown/div/div")).click();
	driver.findElement(By.xpath("//*[@id=\'option2\']")).click();
	driver.findElement(By.xpath("//*[@id=\'slideyHeaderContent_SECTION_EDIT_SLIDEY\']/div/div/button")).click();
	}

@Test(priority = 5)
	public void ChangeDriver() {
	iwait();
	driver.findElement(By.xpath("//*[@id=\'sectionbe70c1e6-2d46-46ae-a201-d67c02accb9d\']/vg-section-layout/div/vg-layout-header/div/div/div/glint-driver-impact-header/div[1]/p/button[2]")).click();
	iwait();
	driver.findElement(By.xpath("//*[@id=\'configureSection\']/glint-slidey/div/div[3]/div/div/section/div/glint-report-section-form/form/div/glint-question-select/glint-dropdown/div/div")).click();
	driver.findElement(By.xpath("//*[@id=\'option0\']")).click();
	driver.findElement(By.xpath("//*[@id=\'slideyHeaderContent_SECTION_EDIT_SLIDEY\']/div/div/button")).click();
	}

@Test(priority = 6)
public void Savebutton() {
	iwait();
	SearchProgram();
	iwait();
	OpenDriverImpactReport();
	
	iwait();iwait();
	//export button-> drop down -> iterate one by one drop down to find save button using select class 
	WebElement a  = driver.findElement(By.xpath("(//select[@tabindex='-1'])[6]"));
	a.click();
	iwait();
	Select save = new Select(a);
	iwait();
	save.selectByVisibleText("Save");
	
}

@Test(priority = 7)
public void AddSection() {
	WebElement moreButton = driver.findElement(By.xpath("//*[@id=\'dropdownTrigger_glintDropdown_9ca443de-2409-4a2b-8368-04d51dd08e5f\']"));
	moreButton.click();
	WebElement AddSection1 = driver.findElement(By.xpath("//*[@id=\"reportDetailSectionAddSlidey\"]/glint-slidey/div/div[3]/div/div/section/div/glint-report-section-add-list/ul/li[1]/glint-report-section-add-item/div/button/i"));
	AddSection1.click();
}
//	@Test(priority = 8)
//	public void AddSection2() {
//		WebElement moreButton = driver.findElement(By.xpath("//*[@id=\'dropdownTrigger_glintDropdown_9ca443de-2409-4a2b-8368-04d51dd08e5f\']"));
//		moreButton.click();
//		WebElement AddSection1 = driver.findElement(By.xpath("//*[@id=\"reportDetailSectionAddSlidey\"]/glint-slidey/div/div[3]/div/div/section/div/glint-report-section-add-list/ul/li[1]/glint-report-section-add-item/div/button/i"));
//		AddSection1.click();
//}

}
