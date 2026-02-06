package week3xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class CreateLead {
    public static void main(String[] args) {

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");

        ChromeDriver driver = new ChromeDriver(opt);

        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();

        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tagore Industry1");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jai");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("karthick");
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Lead Creation");
        driver.findElement(By.className("smallSubmit")).click();

        //WebElement title = driver.findElement(By.xpath("//span[text()='Title']"));
        WebElement viewLeadName = driver.findElement(By.id("viewLead_generalProfTitle_sp"));
        String text = viewLeadName.getText();

        if(text.equals("Lead Creation")){
            System.out.println("Its Displayed Correctly");
        }
        else{
            System.out.println("Its not Displayed");

        }
        driver.close();

    }
}
