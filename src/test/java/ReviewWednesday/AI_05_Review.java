package ReviewWednesday;

import Reusable_Library.ReusableActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class AI_05_Review {
    //define web driver
    WebDriver driver;

    @BeforeSuite
    public void SetChromeDriver() {
        driver = ReusableActions.setUpDriver();
    }//end of set driver method


    @Test()
    public void tc001_NavigateToSite() {
        //navigate to UHC.com
        driver.navigate().to("https://www.uhc.com");
        //click on "Find a Doctor" link
        ReusableActions.clickAction(driver, "//*[@aria-label='Find a doctor']", "Find a doctor");
        //handle pop up window with clicking no
        try {
            WebElement weValueYourFeedback = driver.findElement(By.xpath("//*[@id='layer-container-127097']"));
            if (weValueYourFeedback.isDisplayed()) {
                driver.findElement(By.xpath("//*[@id='ip-no']")).click();
            }//end of if condition
        } catch (Exception e) {
            System.out.println("Unable to find pop up window " + e);
        }//end of pop up window exception
        //scroll to view by find a dentist
        ReusableActions.scrollByView(driver, "//*[text()='Find a dentist']", "Find a dentist");
        //click on find a dentist
        ReusableActions.clickAction(driver, "//*[text()='Find a dentist']", "Find a dentist");
        //switch to new tab
        ReusableActions.switchToTabByIndex(driver, 1);
        //click on Employer and Individual Plan
        ReusableActions.clickActionByIndex(driver, "//*[@class='imgBox']", 0, "Click on employer and individual plan");
    }//end of test 1

    @Test()
    public void tc002_zipCode() throws InterruptedException {
        //click on search box
        ReusableActions.clickAction(driver, "//*[@id='location']", "Click on search box");
        //enter a zipCode
        ReusableActions.sendKeysAction(driver, "//*[@id='location']", "11226", "Entering zipcode");
        //click on the first zipcode option from the list
        ReusableActions.clickAction(driver, "//*[@id='auto_0']", "Click on first option");
        //click on continue
        ReusableActions.clickAction(driver, "//*[contains(@class,'action-btn')]", "Click on continue");
        //click on national options PPO 30
        ReusableActions.clickAction(driver, "//*[@data-ui-element-name='*National Options PPO 30']", "Click on national options");
        //sleep statement
        Thread.sleep(5000);
        //refresh driver
        driver.navigate().refresh();
        //sleep statement
        Thread.sleep(5000);
        //click on general dentist
        ReusableActions.clickActionByIndex(driver, "//*[@class='sc-jgPyTC gXqeMb']", 0, "Click on general dentist");
    }//end of test 2

    @Test()
    public void tc003_captureAddress() throws InterruptedException {
        //select a mile from the dropdown
        ReusableActions.selectByText(driver, "//*[contains(@class,'radiusMiles ng-pristine')]", "Within 20 Miles", "Select a mile from the dropdown");
        Thread.sleep(4000);
        //refresh driver
        driver.navigate().refresh();
        //sleep statement
        Thread.sleep(4000);
        //click on first doctor name you see on the list
        ReusableActions.clickActionByIndex(driver, "//*[@data-test-id='provider-name-link']", 0, "Click");
        //click on save button
        ReusableActions.clickAction(driver, "//*[contains(@class,'cta-header-button action-btn saved')]", "Click on save button");
        //capture address, miles & network
        //capture address
        String addressValue = ReusableActions.getTextAction(driver, "//*[@id='label__selectedLocation0']", "Capture address");
        //capture miles
        String milesValue = ReusableActions.getTextAction(driver, "//*[@data-test-id='distance-away']", "Capture miles");
        //capture network
        String networkValues = ReusableActions.getTextAction(driver, "//*[@value='::location.inNetwork']", "Capture network");
        //print out the values of address, miles & network
        System.out.println("Address: " + addressValue + "\n" + "Miles: " + milesValue + "\n" + "Network: " + networkValues);
        //close the tab
        driver.close();
    }//end of test 3

    @Test()
    public void tc004_result() {
        //switch to default tab
        ReusableActions.switchToTabByIndex(driver, 0);
        //click on search field
        ReusableActions.clickAction(driver, "//*[@id='search-desktop']", "Click on search field");
        //enter keyword 'doctor' on the search field
        ReusableActions.sendKeysAction(driver, "//*[@id='search-desktop']", "doctor", "Enter keyword on search field");
        //click on search icon
        ReusableActions.clickAction(driver, "//*[@id='search__button-desktop']", "Click on search button");
        //capture the search result
        String capture = ReusableActions.getTextAction(driver, "//*[@id='search-results-count__header']", "Capture the search result");
        //extract the only first 3 values from the search result
        String[] splitCapture = capture.split(" ");
        System.out.println("The search result for doctor: " + splitCapture[0] + " " + splitCapture[1] + " " + splitCapture[2]);

    }//end of test 4

    @AfterSuite
    public void QuitTheSession() {
        driver.quit();
    }// end of afterSuite and quit session


}//end of java class

