package week4inheri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class EditLead {
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
        driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
        driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Logistics");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("jeya");
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("suriya");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("JS");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Information Technology");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jeyasuriya15@gmail.com");
        WebElement selectByValue = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select value = new Select(selectByValue);
        value.selectByVisibleText("Indiana");

        driver.findElement(By.className("smallSubmit")).click();
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        driver.findElement(By.id("updateLeadForm_description")).clear();
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Welcome To Our Company");
        driver.findElement(By.xpath("//input[@value='Update']")).click();
        String sectionHeaderTitle = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
        System.out.println("Title is "+sectionHeaderTitle);
        driver.close();

    }
}
