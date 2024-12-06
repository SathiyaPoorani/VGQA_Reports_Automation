package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CommentsCardObject {
    public WebDriver driver;

    public CommentsCardObject(WebDriver newdriver){
        driver = newdriver;
        PageFactory.initElements(newdriver, this);
    }

    public WebElement commentheading(){
        WebElement heading = driver.findElement(By.xpath("//h1[@data-id='reportTitle']"));
        return heading;
    }

    public WebElement commentsummarycount(){
        WebElement count = driver.findElement(By.xpath("//button[@data-id='commentSummaryCount']"));
        return count;
    }

}
