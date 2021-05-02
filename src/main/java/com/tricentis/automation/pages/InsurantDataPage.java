package com.tricentis.automation.pages;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

@Component
public class InsurantDataPage extends AbstractBasePage {

    public final By FIRST_NAME = By.id("firstname");

    public final By LAST_NAME = By.id("lastname");

    public final By DATE_OF_BIRTH = By.id("birthdate");

    public final By GENDER_MALE = By.id("gendermale");

    public final By GENDER_FEMALE = By.id("genderfemale");

    public final By STREET_ADDRESS = By.id("streetaddress");

    public final By COUNTRY = By.id("country");

    public final By ZIP_CODE = By.id("zipcode");

    public final By CITY = By.id("city");

    public final By OCCUPATION = By.id("occupation");

    public final By HOBBIE_SPEEDING = By.id("speeding");

    public final By HOBBIE_BUNGLEE_JUMPING = By.id("bungeejumping");

    public final By HOBBIE_CLIFF_DIVING = By.id("cliffdiving");

    public final By HOBBIE_SKYDIVING = By.id("skydiving");

    public final By HOBBIE_OTHER = By.id("other");

    public final By WEBSITE = By.id("website");

    public final By OPEN_BUTTON = By.id("open");

    public final By NEXT_BUTTON =  By.id("nextenterproductdata");

    public InsurantDataPage setFirstName(String firstName) {

        findElement(FIRST_NAME).sendKeys(firstName);

        return this;
    }

    public InsurantDataPage setLasName(String lasNames) {

        findElement(LAST_NAME).sendKeys(lasNames);

        return this;
    }

    public InsurantDataPage setDateOfBirth(String dateOfBirth) {

        findElement(DATE_OF_BIRTH).sendKeys(dateOfBirth);

        return this;
    }

    public InsurantDataPage setGenderMale() {

        findElement(GENDER_MALE).sendKeys(" ");

        return this;
    }

    public InsurantDataPage setGenderFemale() {

        findElement(GENDER_FEMALE).sendKeys(" ");

        return this;
    }

    public InsurantDataPage setStreetAddress(String streetAddress) {

        findElement(STREET_ADDRESS).sendKeys(streetAddress);

        return this;
    }

    public InsurantDataPage setCountry(String country) {

        findElement(COUNTRY).sendKeys(country);

        return this;
    }

    public InsurantDataPage setZipCode(String zipCode) {

        findElement(ZIP_CODE).sendKeys(zipCode);

        return this;
    }

    public InsurantDataPage setCity(String city) {

        findElement(CITY).sendKeys(city);

        return this;
    }

    public InsurantDataPage setOccupation(String occupation) {

        findElement(OCCUPATION).sendKeys(occupation);

        return this;
    }

    public InsurantDataPage setHobbieSpeeding() {

        findElement(HOBBIE_SPEEDING).sendKeys(" ");
        return this;
    }

    public InsurantDataPage setHobbieBungeeJumping() {

        findElement(HOBBIE_BUNGLEE_JUMPING).sendKeys(" ");

        return this;
    }

    public InsurantDataPage setHobbieCliffDiving() {

        findElement(HOBBIE_CLIFF_DIVING).sendKeys(" ");

        return this;
    }

    public InsurantDataPage setHobbieSkydiving() {

        findElement(HOBBIE_SKYDIVING).sendKeys(" ");

        return this;
    }

    public InsurantDataPage setHobbieOther() {

        findElement(HOBBIE_OTHER).sendKeys(" ");

        return this;
    }

    public InsurantDataPage setWebsite(String website) {

        findElement(WEBSITE).sendKeys(website);

        return this;
    }

    public InsurantDataPage openButtonClick() {

        findElement(OPEN_BUTTON).click();

        return this;
    }

    public InsurantDataPage nextButtonClick() {

        findElement(NEXT_BUTTON).click();

        return this;
    }
}