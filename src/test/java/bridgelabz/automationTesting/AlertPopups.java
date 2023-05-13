package bridgelabz.automationTesting;

import automation.bridgelabz.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

public class AlertPopups extends BaseClass {
    @BeforeTest
    public void init(){
        setUp();
        driver.get("https://demoqa.com/alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void toSeePopup() throws InterruptedException{
        WebElement element = driver.findElement(By.id("alertButton"));
        element.click();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    @Test
    public void timerPopup() throws InterruptedException{
        WebElement element1 = driver.findElement(By.id("timerAlertButton"));
        element1.click();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @Test
    public void conformBoxPopup() throws InterruptedException{
        WebElement element2 = driver.findElement(By.id("confirmButton"));
        element2.click();
        Thread.sleep(1000);
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    @Test
    public void promptBoxPopup() throws InterruptedException,AWTException{
        Robot robot = new Robot();
//        robot.mouseWheel(3);
//        robot.delay(2000);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scrollBy(0,300)");

        WebElement element3 = driver.findElement(By.id("promtButton"));
        element3.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }



}
