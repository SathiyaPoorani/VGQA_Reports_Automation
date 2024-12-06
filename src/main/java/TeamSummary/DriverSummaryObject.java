package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DriverSummaryObject {
    public WebDriver driver;

    public DriverSummaryObject(WebDriver newdriver){
        driver = newdriver;
        PageFactory.initElements(newdriver, this);
    }

    public WebElement detailedmainheading(){
        WebElement heading = driver.findElement(By.xpath("(//h2[@class='headerTitle'])[2]"));
        return heading;
    }
    public String getdetailedmainheading(){
        return detailedmainheading().getText();
    }
    public WebElement detailedheading(){
        WebElement heading = driver.findElement(By.xpath("(//div[@class='scoreDetails']/p)[2]"));
        return heading;
    }
    public String getdetailedheading(){
        return detailedheading().getText();
    }

    public WebElement detailedscore(){
        WebElement score = driver.findElement(By.xpath("//div[@class='STRENGTH scoreCard']/span"));
        return score;
    }
    public String getdetailedscore(){
        return detailedscore().getText();
    }
    public WebElement detailedcommentcount(){
        WebElement count = driver.findElement(By.xpath("(//button[@class='ng-star-inserted'])[11]"));
        return count;
    }
    public String getdetailedcommentcount(){
        return detailedcommentcount().getText();
    }
    public WebElement scorecomparison(){
        WebElement comp = driver.findElement(By.xpath("(//glint-comment-count/button/span)[35]"));
        return comp;
    }
    public WebElement suggestedaction(){
        WebElement act = driver.findElement(By.xpath("//h6[text()=' Identify ways to improve communication flow ']"));
        return act;
    }
    public String getsuggestedaction(){
        return suggestedaction().getText();
    }
    public WebElement changecomparison(){
        WebElement compare = driver.findElement(By.id("reportEditButton"));
        return compare;
    }
    public WebElement suggestedlearning(){
        WebElement learn = driver.findElement(By.xpath("//h3[text()=' Suggested Learning ']"));
        return learn;
    }
    public String getsuggestedlearning(){
        return suggestedlearning().getText();
    }
    public WebElement addactionbutton(){
        WebElement button = driver.findElement(By.xpath("//span[text()='Add Action Item']"));
        return button;
    }
    public void clickaddactionbutton(){
        addactionbutton().click();
    }
    public WebElement afteraddactionbutton(){
        WebElement buttontxt = driver.findElement(By.xpath("//button[@class='btnLink addButton disabled glintButton']/span"));
        return buttontxt;
    }
    public String getafteraddactionbutton(){
        return afteraddactionbutton().getText();
    }
    public WebElement notification(){
        WebElement notifi = driver.findElement(By.xpath("//p[@data-id='notificationContent']"));
        return notifi;
    }
    public String getnotification(){
        return notification().getText();
    }
    public WebElement actionitemheading(){
        WebElement head = driver.findElement(By.xpath("(//h6[@class='title'])[1]"));
        return head;
    }
    public String getactionitemheading(){
        return actionitemheading().getText();
    }
    public WebElement focusareabutton(){
        WebElement button = driver.findElement(By.xpath("//button[@class='glintButton ng-star-inserted']"));
        return button;
    }
    public void clickfocusareabutton(){
        focusareabutton().click();
    }
    public WebElement focusareahead(){
        WebElement head = driver.findElement(By.id("GLINT_IDENTIFY_COMMUNICATION"));
        return head;
    }
    public String getfocusareahead(){
        return focusareahead().getText();
    }
    public WebElement goalviewarrow(){
        WebElement button = driver.findElement(By.xpath("(//vg-icon[@name='Chevron Right'])[2]"));
        return button;
    }
    public void clickgoalviewarrow(){
        goalviewarrow().click();
    }
    public WebElement driversummaryclose(){
        WebElement button = driver.findElement(By.xpath("//button[@class='btnIcon slideyClose glintButton']"));
        return button;
    }
    public void clickdriversummaryclose(){
        driversummaryclose().click();
    }









}
