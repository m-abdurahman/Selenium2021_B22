package day4_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class T5_WebOrdersLogin {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");


        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();

        //verify title
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Login page title verification passed!");
        }else{
            System.out.println("Login page title verification failed");
        }

        //Enter username - Tester
        WebElement inputUsername = driver.findElement(By.id("ctl00_MainContent_username"));
        inputUsername.sendKeys("Tester");

        //Enter password - test
        WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
        inputPassword.sendKeys("test" + Keys.ENTER);

        //click "Sign In" button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        //loginButton.click();

        //verify title equals:
        String expectedHomePageTitle = "Web Orders";
        String actualHomePageTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Home page title verification: Passed");
        }else{
            System.out.println("Home page title verification: Failed");
        }




    }
}