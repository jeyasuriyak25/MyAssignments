package week4inheri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DeleteLead {
    public static void main(String[] args) {

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("guest");

        ChromeDriver driver = new ChromeDriver(opt);
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();

        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8807806299");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

          driver.findElement(By.xpath("//a[text()='11743']")).click();

        driver.findElement(By.xpath("//a[text()='Delete']")).click();

        driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
        driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys("11743");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        WebElement noLeadFound = driver.findElement(By.xpath("//div[text()='No records to display']"));
        String text1 = noLeadFound.getText();

        if(text1.equals("No records to display")){
            System.out.println("Message Displayed");
        }
        else{
            System.out.println("No Message Displayed");
        }


driver.close();

    }
}
