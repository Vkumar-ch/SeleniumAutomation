package bridgelabz.automationTesting;

import automation.bridgelabz.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

public class FileUploadWithRobotClass extends BaseClass {
    @BeforeTest
    public void init() {
        setUp();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void fileUpload() throws AWTException {
        driver.get("https://www.foundit.in/seeker/registration");
        Robot robot = new Robot();
        robot.mouseMove(0, 0);
        WebElement uploadElement = driver.findElement(By.className("resumeFormat"));
//        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        uploadElement.click();

        StringSelection selection = new StringSelection("C:\\Users\\hp\\Downloads\\Resume.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


    }

    @Test
    public void autoItFileUpload() throws IOException, InterruptedException {
        driver.get("https://www.foundit.in/seeker/registration");
        WebElement uploadElement = driver.findElement(By.className("resumeFormat"));
        uploadElement.click();
        Thread.sleep(500);
        Runtime.getRuntime().exec("C:\\Users\\hp\\Downloads\\AutoIt\\meFile.exe");
        Thread.sleep(1000);
    }
}

