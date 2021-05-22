package day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_ZeroBankHeaderTextVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        String expectedHeader = "Log in to ZeroBank";

        // using WebElement "data type" for .getText
        WebElement actualHeader = driver.findElement(By.tagName("h3"));
        String actualHeaderText = actualHeader.getText();

        //locate the web element & get text of it using .getText method


        if (actualHeaderText.equals(expectedHeader)){
            System.out.println("Header verification passed!");
        }else{
            System.out.println("Header verification failed!");
        }


    }
}
