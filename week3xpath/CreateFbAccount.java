package week3xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CreateFbAccount {
    public static void main(String[] args) {

        ChromeDriver driver=new ChromeDriver();

        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("jeya");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("suriya");
        //Select
        WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
        Select options=new Select(day);
        options.selectByValue("15");

        WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
        Select newMonth=new Select(month);
        newMonth.selectByVisibleText("Mar");

        WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
        Select newYear=new Select(year);
        newYear.selectByValue("2000");

        driver.findElement(By.xpath("//label[text()='Female']")).click();

        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8807278965");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Hello345");
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();

        //driver.close();





    }
}
