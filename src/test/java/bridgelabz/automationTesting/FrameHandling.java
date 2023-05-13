package bridgelabz.automationTesting;

import automation.bridgelabz.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class FrameHandling extends BaseClass {
    @BeforeTest
    public void init() {
        setUp();
    }

    @Test
    public void frameHandling() {
        driver.get("https://jqueryui.com/droppable/");
        Actions actions = new Actions(driver);

        List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
        int totalFrames = allFrames.size();
        System.out.println("No of frames  : " + totalFrames);
        for (int i = 0; i < totalFrames; i++) {
            driver.switchTo().frame(i);
            System.out.println("Frame Title: " + driver.findElement(By.tagName("title")).getAttribute("innerHTML"));
            WebElement srcElement = driver.findElement(By.id("draggable"));
            WebElement destElement = driver.findElement(By.id("droppable"));
            actions.dragAndDrop(srcElement, destElement).perform();
        }
        //driver.switchTo().defaultContent();
        driver.switchTo().parentFrame();
        System.out.println("Frame Title: " + driver.getTitle());
        driver.findElement(By.linkText("Draggable")).click();
//        driver.switchTo().frame(0);


    }


}
