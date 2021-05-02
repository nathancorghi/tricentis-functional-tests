package com.tricentis.automation.enums;

public enum Model {

    SCOOTER("Scooter"),
    THREE_WEELER("Three-Weeler"),
    MOPED("Moped"),
    MOTORCYCLE("Motorcycle");

    public String name;

    Model(String name) {

        this.name = name;
    }
}