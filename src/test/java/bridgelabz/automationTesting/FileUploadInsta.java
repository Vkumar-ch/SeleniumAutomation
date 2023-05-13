package bridgelabz.automationTesting;

import automation.bridgelabz.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

public class FileUploadInsta extends BaseClass {
    @BeforeTest
    public void init(){
        setUp();
        driver.get("https://www.instagram.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void fileUploadInInsta() throws AWTException, IOException,InterruptedException{
        Robot robot = new Robot();
        robot.mouseMove(766,205);
        Thread.sleep(1000);
        WebElement username = driver.findElement(By.name("username"));
        robot.delay(500);
        username.sendKeys("vinodhkumarch554@gmail.com");
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.delay(500);

        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("12345678@v");

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


        Thread.sleep(5000);

        WebElement createElement = driver.findElement(By.xpath("//div[contains(text(),'Create')]"));
        createElement.click();
        Thread.sleep(3000);
        WebElement selectFile  = driver.findElement(By.xpath("//button[contains(text(),'Select from computer')]"));
        selectFile.click();
        robot.delay(2000);
        Runtime.getRuntime().exec("C:\\Users\\hp\\Downloads\\AutoIt\\profileFile.exe");
        Thread.sleep(2000);
        robot.mouseMove(1041,274);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(2500);
        driver.findElement(By.xpath("//button[contains(text(),'Discard')]")).click();
        Thread.sleep(1000);

    }



}
