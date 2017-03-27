package pageobjects;

import bootstrapping.DriverFactory;
import com.github.webdriverextensions.WebDriverExtensionFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;


/**
 * Created by MPoole on 26/03/2017.
 */
public class EntryCreationHomePage extends DriverFactory {

    private String URL = "http://192.168.99.100:3003/";

    @FindBy(xpath = "/html/body/div/nav/div[1]/ul/li[2]/a")
    private WebElement LoginLink;

    @FindBy(id = "username")
    private WebElement UserName;

    @FindBy(id = "password")
    private WebElement Password;

    @FindBy(id = "doLogin")
    private WebElement LoginButton;

    @FindBy(id = "hotelName")
    private WebElement HotelName;

    @FindBy(id = "address")
    private WebElement Address;

    @FindBy(id = "owner")
    private WebElement Owner;

    @FindBy(id = "phone")
    private WebElement PhoneNumber;

    @FindBy(id = "email")
    private WebElement Email;

    @FindBy(id = "createHotel")
    private WebElement CreateButton;

    @FindBy(xpath = "/html/body/div/div/div[2]/span")
    private WebElement DeleteLinks;

    public EntryCreationHomePage() {

        PageFactory.initElements(new WebDriverExtensionFieldDecorator(driver), this);
    }

    public void PerformLogIn(){
        driver.navigate().to(URL);
        LoginLink.click();
        //hard coding to save time
        UserName.sendKeys("admin");
        Password.sendKeys("password");
        LoginButton.click();
    }

    public void CreateTestEntry(int entriesToAdd){
         for (int x = 0; x < entriesToAdd; x = x + 1){
             //hard coded input values - could be improved
             HotelName.sendKeys("Hotel Test");
             Address.sendKeys("10 Test road");
             Owner.sendKeys("Test owner");
             PhoneNumber.sendKeys("01273 555666");
             Email.sendKeys("test@test.com");
             CreateButton.click();
             Wait(3000);
         }
    }

    public boolean CanDeleteLastEntry(){

        List<WebElement> deleteLinks = GetDeleteOptionsCount();

        int lastEntry = deleteLinks.size() - 1;

        try {
            Wait(3000);
            deleteLinks.get(lastEntry).click();
        }
        catch(StaleElementReferenceException e) {
            return false;
        }

        if(GetDeleteOptionsCount().size() == deleteLinks.size())
        {
            return false;
        }

        return true;
    }

    public void ClosePage(){
        DestroyDriver();
    }

    private  List<WebElement> GetDeleteOptionsCount(){
        return driver.findElements(By.xpath("//*[contains(@class, 'glyphicon glyphicon-remove hotelDelete')]"));
    }

    private void Wait(int waitTime){
        try {
            Thread.sleep(waitTime);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
