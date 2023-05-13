package bridgelabz.automationTesting;

import automation.bridgelabz.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

public class TestScript extends BaseClass {
    @BeforeTest
    public void init(){
        setUp();
    }
    @Test
    public void testScript() throws  InterruptedException {
        driver.get("https://www.instagram.com/");


        String pageTitle = driver.getTitle();
        System.out.println("Current Page Title : "+pageTitle);

        String currentPageUrl = driver.getCurrentUrl();
        System.out.println("Current page URL : "+ currentPageUrl);

        System.out.println("Page Source : "+driver.getPageSource());

        Thread.sleep(1000);
        driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/main[1]/article[1]/div[2]/div[2]/span[1]/p[1]/a[1]/span[1]")).click();

        //driver.findElement(By.linkText("Sign up")).click();
        Thread.sleep(1000);
        WebElement forgotPassLink = driver.findElement(By.linkText("Cookies Policy"));
        forgotPassLink.click();
        Thread.sleep(1000);

        String parentWindow = driver.getWindowHandle();
        System.out.println("Address of parent Window : "+parentWindow);

        Set<String> allWindows = driver.getWindowHandles();
        int noOfWindows = allWindows.size();
        System.out.println("Number of windows opened : "+noOfWindows);

        Iterator<String> iterator = allWindows.iterator();
        while (iterator.hasNext()){
            String childWindow = iterator.next();
            if(!parentWindow.equalsIgnoreCase(childWindow)){
                driver.switchTo().window(childWindow);
                System.out.println("Child Window title :" +driver.getTitle());
            }
        }
        driver.switchTo().window(parentWindow);
        System.out.println("Parent Window title :" + driver.getTitle());
        //driver.close();
    }
}


