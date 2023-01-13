package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


class Login {
     
    FirefoxOptions firefoxOptions= new FirefoxOptions();
    FirefoxDriver driver = new FirefoxDriver(firefoxOptions);
    
    @BeforeClass
    void testApp() {
        {   

            System.setProperty("webdriver.gecko.driver","C:\\Users\\abise\\Desktop\\Algebra\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");

            // Navigate to the URL
            driver.navigate().to("https://opensource-demo.orangehrmlive.com");
        
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));;
            
         }
    }

    @Test
    public void testLogin() {

        //Enter the username and password in the input fields and the login

        WebElement username= driver.findElement(By.name("username"));
        username.sendKeys("Admin");
        
        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("admin123");;
        
        WebElement login= driver.findElement(By.cssSelector("button[type='submit']"));
        login.click();

        
        //Verify that the dashboard page is displayed
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }

}

    
