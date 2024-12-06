import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.FocusAreaObject;

public class FocusArea {

    public WebDriver driver;
    public FocusAreaObject obj;

    @BeforeMethod
    public void initiation(){
      obj = new FocusAreaObject(driver);
      obj.clickcompany();
    }

    @Test
    public void focus() {
//        FocusAreaObject obj = new FocusAreaObject(driver);
//        obj = new FocusAreaObject(driver);
        obj.clicknewfocusarea();
//        obj.clickcompany();
    }

    @Test
    public void company() {
        obj.clicknewfocusarea();
//        obj.clickcompany();
    }
}