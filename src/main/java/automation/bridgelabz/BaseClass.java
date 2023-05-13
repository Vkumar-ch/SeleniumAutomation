package automation.bridgelabz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static WebDriver driver;
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}
