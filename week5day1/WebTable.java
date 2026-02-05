package week5day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebTable {
    public static void main(String[] args){
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://erail.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.id("txtStationFrom")).clear();
        driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
        driver.findElement(By.xpath("//div[@title='Mgr Chennai Ctr']")).click();

        driver.findElement(By.id("txtStationTo")).clear();
        driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
        driver.findElement(By.xpath("//div[@title='Madurai Jn']")).click();
        driver.findElement(By.xpath("//label[text()='Sort on Date']")).click();

        List<WebElement> trainName = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr/td[2]"));
        System.out.println("No of Train names are : " +trainName.size());

        boolean duplicateFound=false;
        for(int i=0;i<trainName.size();i++){
         String name1=trainName.get(i).getText();

         for(int j=i+1;j<trainName.size();j++){
             String name2=trainName.get(j).getText();
             if (name1.equals(name2)) {
                 System.out.println("Duplicates found "+name1);
                 duplicateFound=true;
                 break;
             }
         }
        }
if(!duplicateFound){
    System.out.println("No Duplicates Found");
}
    }
}
