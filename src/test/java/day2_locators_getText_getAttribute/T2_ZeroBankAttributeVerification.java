package day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankAttributeVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        //locate the link and store inside of WebElement
        WebElement ZeroBankLink = driver.findElement(By.className("brand"));
        //Below are all locating WebElement
        //WebElement actualLinkText = driver.findElement(By.linkText("Zero Bank"));
        //WebElement actualLinkText = driver.findElement(By.tagName("a"));

        //3. Verify link text from top left. Expected: "Zero bank"
       String expectedLinkText = "Zero Bank";
       String actualLinkText = ZeroBankLink.getText();
       //driver.findElement(By.className("brand"));

        if (actualLinkText.equals(expectedLinkText)){
            System.out.println("Link text verification passed!");
        }else{
            System.out.println("Link text verification failed");
        }


        //4. Verify link href attribute value contains "index.html"
        String expectedInHrefAttributeValue = "index.html";
        String actualHrefValue = ZeroBankLink.getAttribute("href");

        if (actualHrefValue.contains(expectedInHrefAttributeValue)) {
            System.out.println("HREF attribute value verification passed");
        }else{
            System.out.println("HREF attribute value verification failed");
        }


    }
}
