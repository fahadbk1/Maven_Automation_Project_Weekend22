package Day6_10162022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T1_FindElements {
    public static void main(String[] args) {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //initialize chrome options
        ChromeOptions options = new ChromeOptions();
        //add options for maximizing the chrome window
        options.addArguments("start-maximized","incognito");
        //define the webdriver and pass the options into the method
        WebDriver driver = new ChromeDriver(options);
        //go to yahoo home page
        driver.navigate().to("https://www.yahoo.com");
        //click on news button
        driver.findElements(By.xpath("//*[contains(@class,'_yb_sc88r')]")).get(1).click();
    }
}
