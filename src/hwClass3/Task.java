package hwClass3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.findElement(By.id("user-message")).sendKeys("Hello Batch 15");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("2");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("3");
        driver.findElement(By.xpath("//button[text()='Get Total']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
    }
