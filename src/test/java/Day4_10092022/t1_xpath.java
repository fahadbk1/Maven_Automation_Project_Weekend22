package Day4_10092022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class t1_xpath {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();

        //define the webdriver
        WebDriver driver = new ChromeDriver();

        //go to google page

        driver.navigate().to("https://www.yahoo.com");

        //maximize the driver
        driver.manage().window().maximize();

        //locate element for search field and type cars
        //this is an example of relative xpath
        driver.findElement(By.xpath("//*[text() = 'Sign in']")).click();
        Thread.sleep(2000);
//        driver.navigate().to("https://www.yahoo.com");
        driver.navigate().back();
//        //this is an example of absolute xpath
        driver.findElement(By.xpath("//*[contains(@class, 'rapid-nonanchor-lt ybar-icon-sprite')]")).click();
        Thread.sleep(2000);
//        //div[@class = 'RNNXgb']//div//div//input
////        driver.findElement(By.name("q")).sendKeys("cars");
//        //submit on google search button
//        driver.findElement(By.xpath("//*[@name ='btnK']")).submit();
//        //capture the search result and print it
//        String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
//
//        //extract out the number and print the search number only
//        String[] arrayResult = searchResult.split(" ");
//
//        System.out.println("My search number is " + arrayResult[1]);

//        String replacePrt = arrayResult[3].replace("(","").replace(")","");
        //quit driver

        driver.quit();
    }
}
