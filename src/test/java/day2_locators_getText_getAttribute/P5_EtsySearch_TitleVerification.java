package day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class P5_EtsySearch_TitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");

        //3. Locate search bar, search for "wooden spoon" & enter search
        driver.findElement(By.id("global-enhancements-search-query")).
                sendKeys("wooden spoon" + Keys.ENTER);

        //4. verify titles. Expected: "wooden spoon | Etsy"
        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title verification passed!");
        }else{
            System.out.println("Title verification failed!");
        }


    }
}
