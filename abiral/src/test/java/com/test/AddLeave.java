package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddLeave extends Login{
    @Test
    public void testAddLeaveEntitlement() {

        // Log in to the application
        testLogin();

        // Navigate to the Leave Entitlements page
        WebElement leave = driver.findElement(By.linkText("Leave"));
        leave.click();
        WebElement clickEntitlements = driver.findElement(By.cssSelector("header[class='oxd-topbar'] li:nth-child(3) span:nth-child(1)"));
        clickEntitlements.click();

        // Click the Add button
        WebElement addEntitlements = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[1]/a"));
        addEntitlements.click();

        //Add the entitlement
        WebElement multiple = driver.findElement(By.cssSelector("div[class='--grouped-field'] div:nth-child(2) div:nth-child(2) div:nth-child(1) label:nth-child(1)"));
        multiple.click();
        WebElement locationDropdown = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > i:nth-child(1)"));
        locationDropdown.click();
        WebElement location = driver.findElement(By.xpath("//*[contains(text(),'Canadian Regional HQ')]"));
        location.click();
        WebElement subUnitDropdown = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)"));
        subUnitDropdown.click();
        WebElement subUnit = driver.findElement(By.xpath("//*[contains(text(),'Administration')]"));
        subUnit.click();
        WebElement leaveTypeDropdown = driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > form:nth-child(3) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)"));
        leaveTypeDropdown.click();
        WebElement leaveType = driver.findElement(By.xpath("//*[contains(text(),'CAN - Bereavement')]"));
        leaveType.click();
        WebElement entitlement = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[3]/div/div[2]/input"));
        entitlement.sendKeys("15");

        //Save the entitlement
        WebElement saveEntitlement = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/button[2]"));
        saveEntitlement.click();

        //Confirm the entitlement
        WebElement confirm = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div/div/div/div[4]/div/button[2]"));
        confirm.click();
        
    }
}

