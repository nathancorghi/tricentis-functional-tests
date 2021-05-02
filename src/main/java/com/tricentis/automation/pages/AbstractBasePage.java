package com.tricentis.automation.pages;

import com.tricentis.automation.Application;
import com.tricentis.automation.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = Application.class)
public abstract class AbstractBasePage {

    @Autowired
    protected WebDriver driver;

    @Autowired
    protected WaitUtils waitUtils;

    public WebElement findElement(By by) {

        return driver.findElement(by);
    }

    public void waitElement(By by) {

        waitUtils.waitElelemtVisibleOnScreen(by);
    }
}