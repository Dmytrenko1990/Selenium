package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1844494772%3A1678243096181977&ec=hpp_signin_001&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHcZDsNCuCIRDwu-oWU1xP2obKYXih2lQ9RUP4cmU81n6_Tg0e25tbY5_c_3ymhx3vYhUhw1");
        //click on help button
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        //click on privacy
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
        //get the window handle of the parent window
        String parentWindowHandle=driver.getWindowHandle();
        System.out.println(parentWindowHandle);
        //get window handles of all the windows tha   t have benn openned up
        Set<String> winowHandles= driver.getWindowHandles();
        for (String wh:winowHandles) {
           //switch the focus of the driver to help window
           driver.switchTo().window(wh);
           //check the title of the window to which our focus is right now
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Google Account Help")){
                break;
            }
        }
        //to verify we switched to the right window;
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentWindowHandle);
    }
}