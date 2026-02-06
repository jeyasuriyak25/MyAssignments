package week5;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class ScrollView  extends ProjectSpecificMethod {
     @Test
      public  void scrollAndScreenshot() throws IOException {

        WebElement scrollElement=driver.findElement(By.linkText("Conditions of Use & Sale"));
        Actions act=new Actions(driver);
        act.scrollToElement(scrollElement).perform();
       String text= scrollElement.getText();
       System.out.println("The Displayed Name is " +text);

       //Screenshot
     File sourceSrc= driver.getScreenshotAs(OutputType.FILE);
     File destination=new File("./snap/actions.png");
     FileUtils.copyFile(sourceSrc,destination);

    }

}
