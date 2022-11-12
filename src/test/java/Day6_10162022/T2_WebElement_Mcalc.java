package Day6_10162022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_WebElement_Mcalc {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //initialize chrome options
        ChromeOptions options = new ChromeOptions();
        //add options for maximizing the chrome window
        options.addArguments("start-maximized", "incognito");
        //define the webdriver and pass the options into the method
        WebDriver driver = new ChromeDriver(options);
        //go to mortgage calc site
        driver.navigate().to("https://www.mlcalc.com");
        //wait 3 secs
        Thread.sleep(3000);
        //clear and enter a new value purchase price field
        WebElement pPrice = driver.findElement(By.xpath("//*[@name = 'ma']"));
        //clear the purchase price
        pPrice.clear();
        //type new value on the purchase price
        pPrice.sendKeys("45000");
        //clear and enter a new value on down payment field
        WebElement dPayment = driver.findElement(By.xpath("//*[@name = 'dp']"));
        //clear the down payment
        dPayment.clear();
        //type new value on the down payment
        dPayment.sendKeys("25");
    }//end of main
}//end of class
