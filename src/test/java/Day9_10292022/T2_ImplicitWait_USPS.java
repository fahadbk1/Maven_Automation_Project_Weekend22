package Day9_10292022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class T2_ImplicitWait_USPS {
    public static void main(String[] args) throws InterruptedException {
        //define the webdriver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();
        //initialize chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        //navigate to usps
        driver.navigate().to("https://www.usps.com");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        //hover over to send tab
        WebElement sendTab = driver.findElement(By.xpath("//*[@id = 'mail-ship-width']"));
        //declare mouse actions
        Actions actions = new Actions(driver);
        //always end with .perform();
        actions.moveToElement(sendTab).perform();
        //click on calculate a price using mouse click
        WebElement calculatePrice = driver.findElement(By.xpath("//li[@class = 'tool-calc']"));
        actions.moveToElement(calculatePrice).click().perform();
        //store usps home element as webelement
        WebElement uspsHome = driver.findElement(By.xpath("//*[@alt ='USPS.com home']"));
        //right click on usps home log
        actions.moveToElement(uspsHome).contextClick().perform();
        //double clicking on usps home logo
        actions.moveToElement(uspsHome).doubleClick().perform();
        //quit driver
        driver.quit();
    }//end of main
}
