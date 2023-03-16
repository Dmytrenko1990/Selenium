package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtns {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        WebElement maleBtn= driver.findElement(By.cssSelector("input[name='optradio']"));
        //check if the radio button is enable
        boolean isEnableMale= maleBtn.isEnabled();
        System.out.println("the radio button male is enable "+isEnableMale);
        //check if the radio button is displayed
        boolean isDisplayedMale=maleBtn.isDisplayed();
        System.out.println("the radio button male is displayed "+isDisplayedMale);
        //check if the radio button is selected
        boolean isSelectedMale=maleBtn.isSelected();
        System.out.println("the radio button male is selected "+isSelectedMale);
        //if the radio button is not selected click on it
        if(!isSelectedMale){
            maleBtn.click();
        }
        //check if the radio button is not selected after the click
        isSelectedMale=maleBtn.isSelected();
        System.out.println("the status of selection is "+ isSelectedMale);
        maleBtn.click();
    }
}