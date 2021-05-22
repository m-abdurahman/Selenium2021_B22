package day4_cssSelector_xpath;

import Utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_cssSelectorAmazonTask {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        //Enter search term(use cssSelector to locate search box
        WebElement amazonSearchBar = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));

        amazonSearchBar.sendKeys("wooden spoon" + Keys.ENTER);

        //verify title contains search term
        String expectedTitle = "Amazon.com : wooden spoon";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed!");
        }else{
            System.out.println("Title verification failed!");
        }
    }
}
