package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        //1- setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2- create instance of selenium web driver
        // this line opens a browser
        WebDriver driver = new ChromeDriver();

        //it maximizes the browser size
        driver.manage().window().maximize();
        //only works with mac
        driver.manage().window().fullscreen();

        //3- get the page for Tesla.com
        driver.get("https://www.tesla.com");

        System.out.println("current title: " + driver.getTitle());

        String currentUrl = driver.getCurrentUrl();

        System.out.println("current URL = " + currentUrl);

        //putting 3 seconds of wait/stop the code for 3 seconds
        Thread.sleep(2000);

        //going BACKWARDS using navigations
        driver.navigate().back();

        //going FORWARD using navigations
        driver.navigate().forward();

        Thread.sleep(2000);

        //refreshing the page using navigations
        driver.navigate().refresh();

        Thread.sleep(2000);

        //going to another url using .to() method
        driver.navigate().to("https://google.com");

        System.out.println("current title: " + driver.getTitle());

        currentUrl = driver.getCurrentUrl();

        System.out.println("current URL = " + currentUrl);

        driver.close();






    }

}
