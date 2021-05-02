package com.tricentis.automation.pages;

import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class VehicleDataPage extends AbstractBasePage {

    public final By MAKE =  By.id("make");

    public final By MODEL = By.id("model");

    public final By CYLINDER_CAPACITY = By.id("cylindercapacity");

    public final By ENGINE_PERFORMANCE = By.id("engineperformance");

    public final By DATE_OF_MANUFACTURE = By.id("dateofmanufacture");

    public final By NUMBER_OF_SEATS = By.id("numberofseats");

    public final By RIGHT_HAND_DRIVE_YES = By.id("righthanddriveyes");

    public final By RIGHT_HAND_DRIVE_NO = By.id("righthanddriveno");

    public final By NUMBER_OF_SEATS_MOTORCYCLE = By.id("numberofseatsmotorcycle");

    public final By FUEL_TYPE = By.id("fuel");

    public final By PAYLOAD = By.id("payload");

    public final By TOTAL_WEIGHT = By.id("totalweight");

    public final By LIST_PRICE = By.id("listprice");

    public final By LICENCE_PLATE_NUMBER = By.id("licenseplatenumber");

    public final By ANNUAL_MILEAGE = By.id("annualmileage");

    public final By NEXT_BUTTON = By.id("nextenterinsurantdata");

    public VehicleDataPage setMake(String model) {

        findElement(MAKE).sendKeys(model);

        return this;
    }

    public VehicleDataPage setModel(String model) {

        findElement(MODEL).sendKeys(model);

        return this;
    }

    public VehicleDataPage setCylinderCapacity(Integer cylindeCapacity) {

        findElement(CYLINDER_CAPACITY).sendKeys(cylindeCapacity.toString());

        return this;
    }

    public VehicleDataPage setEnginePerformance(Integer enginePerformance) {

        findElement(ENGINE_PERFORMANCE).sendKeys(enginePerformance.toString());

        return this;
    }

    public VehicleDataPage setDateOfManufacture(String dateOfManufacture) {

        findElement(DATE_OF_MANUFACTURE).sendKeys(dateOfManufacture);

        return this;
    }

    public VehicleDataPage setNumberOfSeats(Integer numberOfSeats) {

        findElement(NUMBER_OF_SEATS).sendKeys(numberOfSeats.toString());

        return this;
    }

    public VehicleDataPage setRightHandDrive() {

        String[] options = new String[]{"Yes", "No"};

        Random random = new Random();

        if(options[random.nextInt(options.length)].equals("Yes")) {

            findElement(RIGHT_HAND_DRIVE_YES).sendKeys(" ");
        }
        else {

            findElement(RIGHT_HAND_DRIVE_NO).sendKeys(" ");
        }

        return this;
    }

    public VehicleDataPage setNumberOfSeatsMotorcycle(Integer numberOfSeatsMotorcycle) {

        findElement(NUMBER_OF_SEATS_MOTORCYCLE).sendKeys(numberOfSeatsMotorcycle.toString());

        return this;
    }

    public VehicleDataPage setFuelType(String fuelType) {

        findElement(FUEL_TYPE).sendKeys(fuelType);

        return this;
    }

    public VehicleDataPage setPayload(Integer payload) {

        findElement(PAYLOAD).sendKeys(payload.toString());

        return this;
    }

    public VehicleDataPage setTotalWeight(Integer totalWeight) {

        findElement(TOTAL_WEIGHT).sendKeys(totalWeight.toString());

        return this;
    }

    public VehicleDataPage setListPrice(Integer listPrice) {

        findElement(LIST_PRICE).sendKeys(listPrice.toString());

        return this;
    }

    public VehicleDataPage setLicensePlateNumber(String licensePlateNumber) {

        findElement(LICENCE_PLATE_NUMBER).sendKeys(licensePlateNumber);

        return this;
    }

    public VehicleDataPage setAnnualMileage(Integer annualMileage) {

        findElement(ANNUAL_MILEAGE).sendKeys(annualMileage.toString());

        return this;
    }

    public VehicleDataPage nextButtonClick() {

        findElement(NEXT_BUTTON).click();

        return this;
    }
}