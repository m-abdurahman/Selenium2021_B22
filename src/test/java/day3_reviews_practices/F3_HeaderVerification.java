package day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_HeaderVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");

        //verify header text is as expected:
        //option + ENTER -> generate web element variable type
        WebElement header = driver.findElement(By.className("_8eso"));

        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        //create WebElement -> getting the text of the header
        String actualHeader = header.getText();

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Header verification passed!");
        }else{
            System.out.println("Header verification failed!");
        }




    }
}
