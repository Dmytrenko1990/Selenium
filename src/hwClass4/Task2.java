package hwClass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        List<WebElement> checkBoxes=driver.findElements(By.cssSelector("input[class='cb1-element']"));
        for(WebElement checkBox:checkBoxes){
        String numOfOption=checkBox.getAttribute("value");
        if(numOfOption.equalsIgnoreCase("Option-1")){
            checkBox.click();
        }
        }
    }
}