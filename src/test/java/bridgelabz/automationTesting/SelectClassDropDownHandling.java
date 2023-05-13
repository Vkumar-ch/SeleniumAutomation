package bridgelabz.automationTesting;

import automation.bridgelabz.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class SelectClassDropDownHandling extends BaseClass {
    @BeforeTest
    public void init(){
        setUp();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void selectDropDowns() throws InterruptedException{

        //        driver.findElement(By.id("u_0_0_Ns")).click();

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);

        WebElement birthdayDay = driver.findElement(By.name("birthday_day"));
        Select select = new Select(birthdayDay);
        select.selectByIndex(7);
        Thread.sleep(1000);

        WebElement birthdayMonth = driver.findElement(By.name("birthday_month"));
        Select selectBirthdayMonth = new Select(birthdayMonth);
        selectBirthdayMonth.selectByValue("2");
        Thread.sleep(1000);

        WebElement birthdayYear = driver.findElement(By.name("birthday_year"));
        Select selectBirthdayYear = new Select(birthdayYear);
        selectBirthdayYear.selectByValue("1998");
        Thread.sleep(1000);



    }


}
