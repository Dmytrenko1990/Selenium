package class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTask {
    public static void main(String[] args) {
        //connect to webDriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //open ub fb.com
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //maximize the screen
        driver.manage().window().maximize();
        //send the user name
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //send the password
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        //click on login button
        driver.findElement(By.className("button")).click();
    }
}