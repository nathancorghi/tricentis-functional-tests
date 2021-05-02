package com.tricentis.automation.enums;

public enum MeritRating {

    SUPER_BONU("Super Bonus"),
    BONUS_1("Bonus 1"),
    BONUS_2("Bonus 2"),
    BONUS_3("Bonus 3"),
    BONUS_4("Bonus 4"),
    BONUS_5("Bonus 5"),
    BONUS_6("Bonus 6"),
    BONUS_7("Bonus 7"),
    BONUS_8("Bonus 8"),
    BONUS_9("Bonus 9"),
    MALUS_10("Malus 10"),
    MALUS_11("Malus 11"),
    MALUS_12("Malus 12"),
    MALUS_13("Malus 13"),
    MALUS_14("Malus 14"),
    MALUS_15("Malus 15"),
    MALUS_16("Malus 16"),
    MALUS_17("Malus 17");

    public String name;

    MeritRating(String name) {

        this.name = name;
    }
}