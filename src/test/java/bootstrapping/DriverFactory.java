package bootstrapping;

import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

/**
 * Created by MPoole on 26/03/2017.
 */
public class DriverFactory {

    public WebDriver driver;
    private ChromeOptions chromeOptions;

    protected DriverFactory()
    {
        initialize();
    }

    private void initialize() {
        if (driver == null)
            //just using chrome for test purposes
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-extensions");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--no-sandbox");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void TakeScreenshot(Scenario scenario){
        try{
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
        catch(WebDriverException e){
          System.out.println("error capturing screenshot: " + e.getMessage());
        }
    }

    protected void DestroyDriver() {
        driver.quit();
        System.out.println("Browser disposed");
        driver = null;
    }
}
