package com.tricentis.automation.utils;

import com.tricentis.automation.enums.Gender;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.tricentis.automation.Constants.*;

public class FakerUtils {

    public static String randomFirstNameGenerator(Gender gender) throws FileNotFoundException, InterruptedException {

        String fileName;

        if(gender == Gender.MALE) {

            fileName = MALE_FIRST_NAMES_FILE;
        }
        else {

            fileName = FEMALE_FIRST_NAMES_FILE;
        }

        return randomDataGenerator(fileName);
    }

    public static String randomLastNameGenerator() throws FileNotFoundException, InterruptedException {

        return randomDataGenerator(LAST_NAMES_FILE);
    }

    public static String randomPublicPlaceGenerator() throws FileNotFoundException, InterruptedException {

        return randomDataGenerator(PUBLIC_PLACES_FILE);
    }

    public static String randomCityGenerator() throws FileNotFoundException, InterruptedException {

        return randomDataGenerator(CITIES_FILE);
    }

    public static String emailGenerator(String name, String lastName) throws InterruptedException {

        String stringNormalize = Normalizer
                .normalize(name + lastName, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "")
                .toLowerCase();

        return stringNormalize + IntegerUtils.random(1000) + EMAIL_HOSTING;
    }

    public static String passwordGenerator() {

        return RandomStringUtils.random(8, true, false);
    }

    public static String plateNumberGenerator() {

        String randomString = RandomStringUtils.randomAlphabetic(3).toUpperCase();

        String randomNumber = RandomStringUtils.randomNumeric(4);

        return randomString + "-" + randomNumber;
    }

    private static String randomDataGenerator(String fileName) throws FileNotFoundException, InterruptedException {

        File file = new File(ROOT_FILES_FOLDER + fileName);

        Scanner scanner = new Scanner(new FileReader(file.getAbsolutePath()));

        List<String> data = new ArrayList<>();

        String line;

        while(scanner.hasNext()) {

            line = scanner.nextLine();

            data.add(line);
        }

        return data.get(IntegerUtils.random((data.size()-1) + 1));
    }
}