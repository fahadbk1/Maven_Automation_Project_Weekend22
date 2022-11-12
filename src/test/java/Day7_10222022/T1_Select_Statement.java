package Day7_10222022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T1_Select_Statement {
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
        //wait 2 secs
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text() = 'Show advanced options']")).click();
        Thread.sleep(2000);

        //use select command for month dropdown
        WebElement startMonth = driver.findElement(By.xpath("//*[@name = 'sm']"));
        Select startMonthDropdown = new Select(startMonth);
        //select by visible text
        startMonthDropdown.selectByVisibleText("Nov");

        //use select command for year dropdown
        WebElement startYear = driver.findElement(By.xpath("//*[@name = 'sy']"));
        Select startYearDropDown = new Select(startYear);
        //select by visible text
        startYearDropDown.selectByVisibleText("2023");

        //select using xpath
        driver.findElement(By.xpath("//*[@name = 'sy']")).click();
        driver.findElement(By.xpath("//*[text() = '2023']")).click();
    }
}