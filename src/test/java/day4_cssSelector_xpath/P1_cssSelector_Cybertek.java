package day4_cssSelector_xpath;

import Utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_cssSelector_Cybertek {
    public static void main(String[] args) {
        //open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cybertekschool.com/forgot_password");

        //locate home link
        WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link"));

        //locate 'forgot password' header
        WebElement forgotPasswordHeader = driver.findElement(By.tagName("h2"));

        //locate email text
        WebElement emailLabel = driver.findElement(By.cssSelector("label[for ='email']"));

        //locate email input bar
        WebElement inputEmail = driver.findElement(By.cssSelector("input[name = 'email']"));

        //Locate retrieve password button
        WebElement retrievePassword = driver.findElement(By.cssSelector("button[id='form_submit']"));

        //Locate "powered by cybertek school" text, both text & link
        WebElement poweredByText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));

        //verify all web elements are displayed
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("forgotPasswordHeader.isDisplayed() = " + forgotPasswordHeader.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputEmail.isDisplayed() = " + inputEmail.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        System.out.println("poweredByText.isDisplayed() = " + poweredByText.isDisplayed());

    }
}
