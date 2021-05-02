package com.tricentis.automation.enums;

public enum DamageInsurance {

    NO_COVERAGE("No Coverage"),
    PARTIAL_COVERAGE("Partial Coverage"),
    FULL_COVERAGE("Full Coverage");

    public String name;

    DamageInsurance(String name) {

        this.name = name;
    }
}