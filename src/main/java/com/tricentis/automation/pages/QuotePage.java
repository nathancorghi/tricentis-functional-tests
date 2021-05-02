package com.tricentis.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class QuotePage extends AbstractBasePage {

    public final By EMAIL = By.id("email");

    public final By PHONE = By.id("phone");

    public final By USERNAME = By.id("username");

    public final By PASSWORD = By.id("password");

    public final By CONFIRM_PASSWORD = By.id("confirmpassword");

    public final By COMMENTS = By.id("Comments");

    public final By SEND_BUTTON = By.id("sendemail");

    public final By ALERT = By.className("sweet-alert");

    public final By SUCCESS_MESSAGE = By.cssSelector("div h2");

    public QuotePage setEmail(String email) {

        findElement(EMAIL).sendKeys(email);

        return this;
    }

    public QuotePage setPhone(String phone) {

        findElement(PHONE).sendKeys(phone);

        return this;
    }

    public QuotePage setUsername(String username) {

        findElement(USERNAME).sendKeys(username);

        return this;
    }

    public QuotePage setPassword(String password) {

        findElement(PASSWORD).sendKeys(password);

        return this;
    }

    public QuotePage setConfirmPassword(String confirmPassword) {

        findElement(CONFIRM_PASSWORD).sendKeys(confirmPassword);

        return this;
    }

    public QuotePage setComments(String comments) {

        findElement(COMMENTS).sendKeys(comments);

        return this;
    }

    public QuotePage sendButtonClick() {

        findElement(SEND_BUTTON).click();

        return this;
    }

    public String getSuccessMessage() {

        waitElement(ALERT);

        WebElement successMessage = findElement(SUCCESS_MESSAGE);

        return successMessage.getText();
    }
}