package week5;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class ProjectSpecificMethod {

    public ChromeDriver driver ;


    @BeforeMethod
    public  void launchBrowser() {
         driver = new ChromeDriver();
         driver.get("https://www.amazon.in/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterMethod
    public void closeTheBrowser(){
        driver.close();
    }
}