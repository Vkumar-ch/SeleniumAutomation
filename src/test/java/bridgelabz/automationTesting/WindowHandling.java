package bridgelabz.automationTesting;

import automation.bridgelabz.BaseClass;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling extends BaseClass{
    @BeforeTest
    public void init(){
        setUp();
    }
    @Test
    public void windowHandling(){
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("windowButton")).click();

        String parentWindowAddress = driver.getWindowHandle();
        System.out.println("Parent Window Address : "+parentWindowAddress);

        Set<String> allWindows =  driver.getWindowHandles();
        System.out.println("No of windows present : "+allWindows.size());

        Iterator<String> iterator = allWindows.iterator();
        while (iterator.hasNext()){
            String childWindow = iterator.next();
            if(!parentWindowAddress.equalsIgnoreCase(childWindow)){
                driver.switchTo().window(childWindow);
                String getTexts = driver.findElement(By.id("sampleHeading")).getText();
                System.out.println("GetText of child window : "+getTexts);
                driver.close();
            }
        }
        driver.switchTo().window(parentWindowAddress);
        driver.close();
    }
}
