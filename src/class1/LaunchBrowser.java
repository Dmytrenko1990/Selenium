package class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();  //launch the browser
        driver.get("https://www.google.com/"); //navigate to the specified url

    //get the current url that is there in browser
        String URL=driver.getCurrentUrl();
        System.out.println(URL);
    //get the title of the webpage
        String title=driver.getTitle();
        System.out.println("The title of the page is "+title);

        Thread.sleep(3000);
        //close the browser
        driver.quit();
        }
}