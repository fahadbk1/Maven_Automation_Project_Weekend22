package ReviewWednesday;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class AI_03_run {
    public static void main(String[] args) throws InterruptedException {
        //define the webdriver
        WebDriverManager.chromedriver().setup();
        //initialize chrome options
        ChromeOptions options = new ChromeOptions();
        //add the options
        options.addArguments("start-maximized", "incognito");
        //define the webdriver and pass the options into the method
        WebDriver driver = new ChromeDriver(options);
        //create an array list of zipCodes
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11004");
        zipCode.add("11427");
        zipCode.add("11552");
        //java script executor
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        for (int i = 0; i < zipCode.size(); i++) {
            //navigate to the website
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");
            //sleep thread
            Thread.sleep(2000);
            //click on the top right corner of the site that says find a workshop
            driver.findElements(By.xpath("//*[contains(@class, 'menuItemInnerWrapper')]")).get(4).click();
            //click on in person
            driver.findElements(By.xpath("//*[@class= 'buttonText-3DCCO']")).get(0).click();
            //sleep thread
            Thread.sleep(2000);
            //enter a new value on search field
            WebElement zCode = driver.findElement(By.xpath("//*[@id= 'location-search']"));
            //clear search bar
            zCode.clear();
            //get zipcode on search bar
            zCode.sendKeys(zipCode.get(i));
            //click on search arrow
            driver.findElement(By.xpath("//*[@id= 'location-search-cta']")).click();
            //sleep thread
            Thread.sleep(2000);
            jse.executeScript("scroll(0,800)");
            //declare webElement arrayList for studioLink
            ArrayList<WebElement> studioLink = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@class, 'wrapperLink')]")));
            //create an if condition
            if (i == 0){
                jse.executeScript("scroll(0,1000)");
                //sleep thread
                Thread.sleep(2000);
                studioLink.get(1).click();
            } else if(i == 1){
                jse.executeScript("scroll(0,1300)");
                studioLink.get(2).click();
            } else if (i == 2){
                studioLink.get(0).click();
            }//end of else if conditon
            String address = driver.findElements(By.xpath("//*[contains(@class, 'address')]")).get(1).getText();
            //"\n" means it breaks the line
            String[] splitAddress = address.split("\n");
            System.out.println(splitAddress[0] + "\n" + splitAddress[1]);
            jse.executeScript("scroll(0,700)");
            System.out.println(driver.findElement(By.xpath("//*[contains(@class, 'scheduleContainerMobile')]")).getText());
            System.out.println();
        }//end of for loop
        //end the browser
        driver.quit();
    }//end of main
}
