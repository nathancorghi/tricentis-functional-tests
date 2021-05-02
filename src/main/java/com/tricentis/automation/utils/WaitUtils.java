package com.tricentis.automation.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WaitUtils {

    @Autowired
    private WebDriver driver;

    public void waitElelemtVisibleOnScreen(By by) {

        WebDriverWait wait =  new WebDriverWait(driver, 60);

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}