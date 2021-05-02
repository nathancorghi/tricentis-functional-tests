package com.tricentis.automation.enums;

public enum FuelType {

    PETROL("Petrol"),
    DIESEL("Diesel"),
    ELECTRIC_POWER("Electric Power"),
    GAS("Gas"),
    OTHER("Other");

    public String name;

    FuelType(String name) {

        this.name = name;
    }
}