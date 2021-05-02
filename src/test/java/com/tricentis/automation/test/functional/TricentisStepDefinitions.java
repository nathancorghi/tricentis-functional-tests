package com.tricentis.automation.test.functional;

import com.tricentis.automation.Application;
import com.tricentis.automation.enums.*;
import com.tricentis.automation.pages.*;
import com.tricentis.automation.utils.EnumUtils;
import com.tricentis.automation.utils.FakerUtils;
import com.tricentis.automation.utils.IntegerUtils;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.io.FileNotFoundException;

import static com.tricentis.automation.Constants.BASE_URL;
import static com.tricentis.automation.utils.Dateutils.*;
import static com.tricentis.automation.utils.FakerUtils.plateNumberGenerator;

@SpringBootTest
@ContextConfiguration(classes = Application.class)
public class TricentisStepDefinitions {

    @Autowired
    private WebDriver driver;

    @Autowired
    private VehicleDataPage vehicleDataPage;

    @Autowired
    private InsurantDataPage insurantDataPage;

    @Autowired
    private ProductDataPage productDataPage;

    @Autowired
    private PriceOptionPage priceOptionPage;

    @Autowired
    private QuotePage quotePage;

    private String firstName;

    private String lastName;

    @Before
    public void before() {

        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }

    @After
    public void after() {

        driver.quit();
    }

    @Given("I filled out all tabs from application")
    public void iFilledOutAllTabsFromApplication() throws InterruptedException, FileNotFoundException {

        fillVehicleData();
        fillInsurantData();
        setProductData();
        setPriceOption();

    }

    @When("I send quote")
    public void iSendQuote() throws InterruptedException {

        setQuote();
    }

    @Then("should send the quote successfully")
    public void shouldSendTheQuoteSuccessfully() {

        Assert.assertNotNull(quotePage.getSuccessMessage());
    }

    private void fillVehicleData() throws InterruptedException {

        String make = Make.valueOf(EnumUtils.enumToList(Make.class)).name;
        String model = Model.valueOf(EnumUtils.enumToList(Model.class)).name;
        Integer cylinderCapacity = IntegerUtils.random(1, 2000);
        Integer enginePerformance = IntegerUtils.random(1, 2000);
        String dateOfManufacture = getActualDate();
        Integer numberOfSeats = IntegerUtils.random(1, 9);
        Integer numberOfSeatsMotorcycle = IntegerUtils.random(1, 3);
        String fuelType = FuelType.valueOf(EnumUtils.enumToList(FuelType.class)).name;
        Integer payload = IntegerUtils.random(1, 1000);
        Integer totalWeight = IntegerUtils.random(100, 50000);
        Integer listPrice = IntegerUtils.random(500, 100000);
        String licencePlateNumber = plateNumberGenerator();
        Integer annualMileage = IntegerUtils.random(500, 100000);

        vehicleDataPage
                .setMake(make)
                .setModel(model)
                .setCylinderCapacity(cylinderCapacity)
                .setEnginePerformance(enginePerformance)
                .setDateOfManufacture(dateOfManufacture)
                .setNumberOfSeats(numberOfSeats)
                .setRightHandDrive()
                .setNumberOfSeatsMotorcycle(numberOfSeatsMotorcycle)
                .setFuelType(fuelType)
                .setPayload(payload)
                .setTotalWeight(totalWeight)
                .setListPrice(listPrice)
                .setLicensePlateNumber(licencePlateNumber)
                .setAnnualMileage(annualMileage)
                .nextButtonClick();
    }

    public void fillInsurantData() throws FileNotFoundException, InterruptedException {

        Gender gender = Gender.valueOf(EnumUtils.enumToList(Gender.class));
        firstName = FakerUtils.randomFirstNameGenerator(gender);
        lastName = FakerUtils.randomLastNameGenerator();
        String dateOfBirth = getRandomBirthDate();
        String streetAddress = FakerUtils.randomPublicPlaceGenerator() + " " + lastName + ", nº " + IntegerUtils.random(10, 9999);
        String country = Countries.BRAZIL.name;
        String zipCode = IntegerUtils.random(11111111, 99999999).toString();
        String city = FakerUtils.randomCityGenerator();
        String occupation = Occupation.valueOf(EnumUtils.enumToList(Occupation.class)).name;

        insurantDataPage
                .setFirstName(firstName)
                .setLasName(lastName)
                .setDateOfBirth(dateOfBirth);

        if(gender.equals(Gender.MALE)) {

            insurantDataPage
                    .setGenderMale();
        }
        else {

            insurantDataPage
                    .setGenderFemale();
        }

        insurantDataPage
                .setStreetAddress(streetAddress)
                .setCountry(country)
                .setZipCode(zipCode)
                .setCity(city)
                .setOccupation(occupation)
                .setHobbieOther()
                .nextButtonClick();
    }

    public void setProductData() throws InterruptedException {

        String startDate = getDateWithFutureMonth();
        String meritRating = MeritRating.valueOf(EnumUtils.enumToList(MeritRating.class)).name;
        String damageInsurance = DamageInsurance.valueOf(EnumUtils.enumToList(DamageInsurance.class)).name;
        String courtesyCar = CourtesyCar.valueOf(EnumUtils.enumToList(CourtesyCar.class)).name;

        productDataPage
                .setStartDate(startDate)
                .setInsuranceSum()
                .setMeritRating(meritRating)
                .setDamageInsurance(damageInsurance)
                .setEuroProtection()
                .setLegalDefenseInsurance()
                .setCourtesyCar(courtesyCar)
                .nextButtonClick();
    }

    public void setPriceOption() throws InterruptedException {

        priceOptionPage
                .setPriceOption()
                .nextButtonClick();
    }

    public void setQuote() throws InterruptedException {

        String email = FakerUtils.emailGenerator(firstName, lastName);
        String phone = IntegerUtils.random(44, 47).toString() + IntegerUtils.random(1111, 9999).toString() + IntegerUtils.random(1111, 9999).toString();
        String username = firstName + IntegerUtils.random(100, 999);
        String password = FakerUtils.passwordGenerator() + IntegerUtils.random(1,9);
        String comments = "Automatic quote test";

        quotePage
                .setEmail(email)
                .setPhone(phone)
                .setUsername(username)
                .setPassword(password)
                .setConfirmPassword(password)
                .setComments(comments)
                .sendButtonClick();
    }
}