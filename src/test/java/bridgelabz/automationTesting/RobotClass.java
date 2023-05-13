package bridgelabz.automationTesting;

import automation.bridgelabz.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotClass extends BaseClass {

    @BeforeTest
    public void init(){
        setUp();
        driver.get("https://www.instagram.com/");
    }

    @Test
    public void loginIn() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        robot.mouseMove(766,205);
//        Thread.sleep(1000);
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("vinodhkumarch554@gmail.com");
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);

        robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("112345678@v");
//        robot.keyPress(KeyEvent.VK_TAB);
//        robot.keyRelease(KeyEvent.VK_TAB);
//        robot.keyPress(KeyEvent.VK_TAB);
//        robot.keyRelease(KeyEvent.VK_TAB);
        robot.mouseMove(828,131);



//       WebElement login = driver.findElement(By.tagName("Log In"));
//        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
//        robot.mouseWheel(10);
        robot.delay(1000);
        Thread.sleep(1000);

    }
//    @Test
//    public void fileUpload() throws AWTException {
//        Robot robot = new Robot();
//        robot.mouseMove(70, 471);
//        WebElement create = driver.findElement(By.tagName("Create"));
//        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
//        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
//
//    }







}
