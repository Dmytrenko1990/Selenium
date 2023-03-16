package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        WebElement dD=driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select sel=new Select(dD);
        //select by value
        sel.selectByValue("New Jersey");
        //select by visiable text
        sel.selectByVisibleText("Ohio");
        Thread.sleep(2000);
        //when it come MultiSelect DropDown we can also deselect
        sel.deselectByValue("New Jersey");
        sel.deselectByVisibleText("Ohio");

        System.out.println("The drop down is multiple "+sel.isMultiple());
    }
    }
