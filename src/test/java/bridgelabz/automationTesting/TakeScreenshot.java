package bridgelabz.automationTesting;

import automation.bridgelabz.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot extends BaseClass {
    @BeforeTest
    public void init() {
        setUp();
    }

    @Test
    public void takeScreenshotOfWeb() throws IOException {
        TakesScreenshot src = (TakesScreenshot) driver;
        File srcShot = src.getScreenshotAs(OutputType.FILE);
        File destShot = new File("C:\\Users\\hp\\IdeaProjects\\SeleniumAutomation\\ScreenShots\\pageScreenshot.jpeg");
        FileHandler.copy(srcShot, destShot);

    }

    @Test
    public void screenshotOdSpecificWebElement() throws IOException {
        WebElement emailShot = driver.findElement(By.id("email"));
        File srcShot = emailShot.getScreenshotAs(OutputType.FILE);
        File destShot = new File("C:\\Users\\hp\\IdeaProjects\\SeleniumAutomation\\ScreenShots\\WebElementScreenshot.jpeg");
        FileHandler.copy(srcShot,destShot);
    }
}



