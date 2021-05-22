package day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekUrlVerification {
    public static void main(String[] args) {
        //1. setup & open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
            // maximize the page
        driver.manage().window().maximize();

        //2. Go to the expected URL
        driver.get("http://practice.cybertekschool.com");

        //3. verify URL contains
        //Expected: cybertekschool
        String expectedUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)){
            System.out.println("URL verification passed!");
        }else{
            System.out.println("URL verification failed!");
        }

        //4. Verify title:
        //Expected: practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title verification passed!");
        }else{
            System.out.println("Title verification failed!");
        }
    }
}
