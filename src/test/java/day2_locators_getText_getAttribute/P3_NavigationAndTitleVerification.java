package day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        //3. click to Gmail from top right
        //driver.findElement(By.linkText("Gmail")).click();
        driver.findElement(By.partialLinkText("Gmail")).click();

        //4. Verify Title equals expected: Gmail
        String ExpectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(ExpectedInTitle)) {
            System.out.println("Title verification passed");
        } else {
            System.out.println("Title verification failed!");
        }

        //5. Go back to Google
        driver.navigate().back();

        //6. Verify title equals Expected: Google
        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();
        if (actualGoogleTitle.contains(expectedGoogleTitle)) {
            System.out.println("Title verification passed!");
        }else{
            System.out.println("Title verification failed!");
        }
    }
}
