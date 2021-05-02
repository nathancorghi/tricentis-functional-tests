package com.tricentis.automation.enums;

public enum Make {

    AUDI("Audi"),
    BMW("BMW"),
    FORD("Ford"),
    HONDA("Honda"),
    MAZDA("Mazda"),
    MERCEDES_BENZ("Mercedes Benz"),
    NISSAN("Nissan"),
    OPEL("Opel"),
    PORSHE("Porshe"),
    RENAULT("Renault"),
    SKODA("Skoda"),
    SUSUKI("Susuki"),
    TOYOTA("Toyota"),
    VOLKSWAGEN("Volkswagen"),
    VOLVO("Volvo");

    public final String name;

    Make(String name) {

        this.name = name;
    }
}