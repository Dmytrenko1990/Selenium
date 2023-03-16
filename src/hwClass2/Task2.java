package hwClass2;
/*navigate to fb.com
click on create new account
fill up all the textboxes
click on sign up botton
close the pop up
close the browser*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Snow");
        driver.findElement(By.name("reg_email__")).sendKeys("18502346732");
        driver.findElement(By.id("password_step_input")).sendKeys("password123");
        driver.findElement(By.name("birthday_month")).sendKeys("02");
        driver.findElement(By.name("birthday_day")).sendKeys("23");
        driver.findElement(By.name("birthday_year")).sendKeys("1995");
        driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }
}
