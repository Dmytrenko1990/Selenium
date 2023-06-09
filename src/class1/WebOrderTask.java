package class1;
/**
 * Task
 * Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
 * Login
 * Get title and verify it is correct
 * logout
 * close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //navigate to website
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //maximize the website
        driver.manage().window().maximize();
        //user name
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        //send the password
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        //click on login button
        driver.findElement(By.className("button")).click();

        //verify that title is "Web Orders"
        String title=driver.getTitle();
        if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("the title is correct");
        }
        else{
            System.out.println("the title is incorrect");
        }
        //logout
        driver.findElement(By.linkText("Logout")).click();
        //close browser
        driver.quit();
    }
}
