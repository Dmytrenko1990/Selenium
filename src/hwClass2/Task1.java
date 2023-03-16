package hwClass2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* navigate to
        https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser*/
public class Task1 {
              public static void main(String[] args) throws InterruptedException {
                     System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
                     WebDriver driver=new ChromeDriver();
                     driver.manage().window().maximize();
                     driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
                     driver.findElement(By.name("customer.username")).sendKeys("User111");
                     driver.findElement(By.name("customer.password")).sendKeys("Password123");
                     driver.findElement(By.name("repeatedPassword")).sendKeys("Password123");
                     Thread.sleep(3000);
                     driver.findElement(By.className("button")).click();
                     driver.quit();


              }
}
