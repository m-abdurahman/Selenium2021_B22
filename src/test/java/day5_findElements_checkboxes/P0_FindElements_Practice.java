package day5_findElements_checkboxes;

import Utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P0_FindElements_Practice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.get("https://practice.cybertekschool.com/forgot_password");

        //locating to return all of the links on the page & storing all of the links that are returned by findElements method
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));

        //print out the texts of all links
        for (WebElement eachListOfLinks : listOfLinks){
            System.out.println(eachListOfLinks.getText());

            //print out total number of links in web page
            int numberOfLinks = listOfLinks.size();
            System.out.println(numberOfLinks);
        }

    }
}
