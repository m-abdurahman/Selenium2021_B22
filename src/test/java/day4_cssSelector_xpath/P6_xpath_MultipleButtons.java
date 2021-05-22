package day4_cssSelector_xpath;

import Utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_xpath_MultipleButtons {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cybertekschool.com/multiple_buttons");

        //click on button 1 using text of the button
        WebElement button1 = driver.findElement(By.xpath("//button[@onclick= 'button1()']"));

        //locating using "onclick" attribute value
        WebElement button2 = driver.findElement(By.xpath("//button[.= 'button2()']"));
        button1.click();

        //verify text displayed is as expected
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result"));

        String expectedText = "Click on button one!";
        String actualText = resultText.getText();

        if(actualText.equals(expectedText)){
            System.out.println("Result text verification passed");
        }else{
            System.out.println("Result text verification failed");
        }

    }

}
