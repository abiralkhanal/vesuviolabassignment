package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AddEmployee extends Login{

    @Test
    public void testAddEmployee() {
        // Log in to the application
        testLogin();

        // Navigate to the Add Employee page
        WebElement pim = driver.findElement(By.linkText("PIM"));
        pim.click();
        WebElement addEmployee = driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']"));
        addEmployee.click();

        // Enter the employee details
        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.sendKeys("Abiral");
        WebElement middleName = driver.findElement(By.name("middleName"));
        middleName.sendKeys("Kumar");
        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys("Khanal");
        WebElement saveEmployee = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
        saveEmployee.click();

        // Verify that the employee was added successfully
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        String actualString = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/h6")).getText();
        Assert.assertTrue(actualString.contains("Personal Details"));
    } 
}
