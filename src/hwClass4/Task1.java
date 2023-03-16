package hwClass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        WebElement checkBox=driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        boolean checkBoxIsSelected=checkBox.isSelected();
        System.out.println(checkBoxIsSelected);
        if(!checkBox.isSelected()){
            checkBox.click();
        }
        System.out.println(checkBox.isSelected());
        Thread.sleep(2000);
        driver.quit();
    }
}