package com.tricentis.automation.pages;

import com.tricentis.automation.utils.IntegerUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PriceOptionPage extends AbstractBasePage {

    public By NEXT_BUTTON = By.id("nextsendquote");

    public PriceOptionPage setPriceOption() throws InterruptedException {

        WebElement priceTable = findElement(By.id("priceTable"));
        WebElement priceTh = priceTable.findElement(By.className("group"));
        List<WebElement> priceOptions = priceTh.findElements(By.cssSelector("input[name='Select Option']"));

        priceOptions.get(IntegerUtils.random(priceOptions.size())).sendKeys(" ");

        return this;
    }

    public PriceOptionPage nextButtonClick() {

        waitElement(NEXT_BUTTON);

        findElement(NEXT_BUTTON).click();

        return this;
    }
}