package com.tricentis.automation.pages;

import com.tricentis.automation.utils.IntegerUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductDataPage extends AbstractBasePage {

    public final By START_DATE = By.id("startdate");

    public final By INSURANCE_SUM = By.id("insurancesum");

    public final By MERIT_RATING = By.id("meritrating");

    public final By DAMAGE_INSURANCE = By.id("damageinsurance");

    public final By EURO_PROTECTION = By.id("EuroProtection");

    public final By LEGAL_DEFENSE_INSURANCE = By.id("LegalDefenseInsurance");

    public final By COURTESY_CAR = By.id("courtesycar");

    public final By NEXT_BUTTON = By.id("nextselectpriceoption");

    public ProductDataPage setStartDate(String startDate) {

        findElement(START_DATE).sendKeys(startDate);

        return this;
    }

    public ProductDataPage setInsuranceSum() throws InterruptedException {

        WebElement insuranceSum = findElement(INSURANCE_SUM);
        Select select = new Select(insuranceSum);

        List<WebElement> options = select.getOptions();
        options.remove(0);

        String option =  options.get(IntegerUtils.random(options.size())).getText();

        insuranceSum.sendKeys(option);

        return this;
    }

    public ProductDataPage setMeritRating(String meritRating) {

        findElement(MERIT_RATING).sendKeys(meritRating);

        return this;
    }

    public ProductDataPage setDamageInsurance(String damageInsurance) {

        findElement(DAMAGE_INSURANCE).sendKeys(damageInsurance);

        return this;
    }

    public ProductDataPage setEuroProtection() {

        findElement(EURO_PROTECTION).sendKeys(" ");

        return this;
    }

    public ProductDataPage setLegalDefenseInsurance() {

        findElement(LEGAL_DEFENSE_INSURANCE).sendKeys(" ");

        return this;
    }

    public ProductDataPage setCourtesyCar(String courtesyCar) {

        findElement(COURTESY_CAR).sendKeys(courtesyCar);

        return this;
    }

    public ProductDataPage nextButtonClick() {

        findElement(NEXT_BUTTON).click();

        return this;
    }
}