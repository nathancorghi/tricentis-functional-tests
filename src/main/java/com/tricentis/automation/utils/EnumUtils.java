package com.tricentis.automation.utils;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class EnumUtils {

    public static String enumToList(Class<? extends Enum<?>> enumClass) {

        Random random = new Random();

        Enum<?>[] enums = enumClass.getEnumConstants();

        return enums[random.nextInt(enums.length)].toString();
    }
}