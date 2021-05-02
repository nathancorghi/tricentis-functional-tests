package com.tricentis.automation.enums;

public enum Occupation {

    EMPLOYEE("Employee"),
    PUBLIC_OFFICER("Public Officer"),
    FARMER("Farmer"),
    UNEMPLOYED("Unemployed"),
    SELFEMPLOYED("Selfemployed");

    public String name;

    Occupation(String name) {

        this.name = name;
    }
}