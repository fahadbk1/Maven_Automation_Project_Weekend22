package ReviewWednesday;
import Reusable_Library.ReusableActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;
public class ai_test_akash {


        //define web driver
        WebDriver driver;

        //testNG annotation
        @BeforeSuite
        public void SetChromeDriver(){
            driver = ReusableActions.setUpDriver();
        }//end of set driver method

    //testNG annotations
    @AfterSuite
    public void QuitTheSession(){
        driver.quit();
    }// end of afterSuite and quit session


        @Test()
        public void NavigateToSite() throws InterruptedException {
            //navigate to UHC.com
            driver.navigate().to("https://www.uhc.com");
            //sleep statement
            Thread.sleep(2000);
            //click on "Find a Doctor" link
            ReusableActions.clickAction(driver,"//*[@aria-label='Find a doctor']","Find a doctor");
            //sleep statement
            Thread.sleep(2000);


            //handle pop up window with clicking no
            try {
                WebElement weValueYourFeedback = driver.findElement(By.xpath("//*[@id='layer-container-127097']"));
                if (weValueYourFeedback.isDisplayed()) {
                    driver.findElement(By.xpath("//*[@id='ip-no']")).click();
                }//end of if condition
            }catch (Exception e){
                System.out.println("Unable to find pop up window " + e);
            }//end of pop up window exception

            //sleep statement
            Thread.sleep(2000);
            //scroll to view by find a dentist
            ReusableActions.scrollByView(driver,"//*[text()='Find a dentist']","Find a dentist");
            //sleep statement
            Thread.sleep(2000);
            //click on find a dentist
            ReusableActions.clickAction(driver,"//*[text()='Find a dentist']","Find a dentist");
            Thread.sleep(2000);
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));
            Thread.sleep(2000);
            //switch to new tab
//            ReusableActions.switchToTabByIndex(driver,1);
            //click on Employer and Individual Plan
            ReusableActions.clickActionByIndex(driver,"//*[@class='imgBox']",0,"Click on employer and individual plan");

        }//end of test 1

        @Test(dependsOnMethods = "NavigateToSite")
        public void ZipCode() throws InterruptedException {
            //click on search box
            ReusableActions.clickAction(driver,"//*[@id='location']","Click on search box");
            //enter a zipCode
            ReusableActions.sendKeysAction(driver,"//*[@id='location']","10001","Entering zipcode");
            Thread.sleep(1000);
            //            ReusableActions.submitAction(driver,"//*[@id='location']","Submitting zipcode");
            //click on the first location from the list
            ReusableActions.clickAction(driver,"//*[@id='auto_0']","Click on first option");
            //sleep statement
            Thread.sleep(2000);
            //click on continue
            ReusableActions.clickAction(driver,"//*[@cs-id = 'locationSubmit']","Click on continue");
            //sleep statement
            Thread.sleep(2000);

            //click on national options PPO 30

            ReusableActions.clickAction(driver,"//*[@data-ui-element-name='*National Options PPO 30']","Click on national options");
//            ReusableActions.clickActionByIndex(driver,"//*[@class='sc-jomqko TEkcT']",0,"Click on national options");
            Thread.sleep(2000);

//            driver.navigate().refresh();
//
//
//            Thread.sleep(3000);

            //sleep statement
            //Thread.sleep(5000);
            //click on general dentist
//            ReusableActions.clickActionByIndex(driver,"//*[@class='sc-jgPyTC gXqeMb']",0,"Click on general dentist");


        }//end of test 2

        @Test(dependsOnMethods = "ZipCode")
        public void CaptureAddress(){
            //select a mile from the dropdown
//            ReusableActions.selectByText(driver,"//*[contains(@class,'radiusMiles ng-pristine')]","Within 2 Miles","Select a mile from the dropdown");
            //click on first doctor name you see on the list
            ReusableActions.clickActionByIndex(driver,"//*[@class='sc-euCWbh cCPIVL search-result-in-panel']",0,"Click on first doctor name");
            //click on save button
            ReusableActions.clickAction(driver,"//*[contains(@class,'cta-header-button action-btn saved')]","Click on save button");


        }//end of test 3


}
