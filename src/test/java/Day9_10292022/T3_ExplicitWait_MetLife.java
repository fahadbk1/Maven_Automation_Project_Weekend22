package Day9_10292022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T3_ExplicitWait_MetLife {
    public static void main(String[] args) {
        //define the webdriver manager setup for chromedriver
        WebDriverManager.chromedriver().setup();
        //initialize chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
        //navigate to MetLife
        driver.navigate().to("https://www.metLife.com");
        //declare the explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 20);
        //click on solutions tab using explicit condition
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[contains(text(), 'SOLUTIONS')]"))).get(0).click();
        //click on dental link
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text() = 'Dental']"))).click();
    }//end of main
}//end of class
