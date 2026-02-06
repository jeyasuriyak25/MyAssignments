package week3xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class CreateAccount {
    public static void main(String[] args){

        ChromeOptions opt=new ChromeOptions();
        opt.addArguments("guest");

        ChromeDriver driver=new ChromeDriver(opt);

        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Accounts")).click();
driver.findElement(By.linkText("Create Account")).click();
driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Royal1");
driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).sendKeys("Selenium Automation Tester");
driver.findElement(By.id("numberEmployees")).sendKeys("40");
driver.findElement(By.id("officeSiteName")).sendKeys("“LeafTaps”");
driver.findElement(By.xpath("//input[@type='submit']")).click();
WebElement text=driver.findElement(By.id("sectionHeaderTitle_accounts"));
String headName=text.getText();
System.out.println("Header Name is "+headName);
driver.close();
    }


}
