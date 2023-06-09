package hwClass6;
/*1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/dynamic_loading/1
        2.Click on the "Start" button to initiate the loading of a hidden element
        3.Without using Thread.sleep(), write a code that waits for the hidden element to appear using Implicit Wait
        4.Click the "Finish" button to reveal the hidden element
        5.Verify that the text "Hello World!" is now displayed on the page*/


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20000,TimeUnit.MILLISECONDS);
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement startBtn=driver.findElement(By.xpath("//button[text()='Start']"));
        startBtn.click();
    }
}
