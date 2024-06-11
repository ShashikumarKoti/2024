package com.skoti.enums;

enum DAYS_OF_WEEK {

    MON, TUE, WED;
    DAYS_OF_WEEK() {
        System.out.println("Days of Week constructor called for every element in Enum");
    }
}

public class EnumBasicDemo2 {

    public static void main(String[] args) {

        DAYS_OF_WEEK[] values = DAYS_OF_WEEK.values();
        for (DAYS_OF_WEEK daysOfWeek : values) {
            System.out.println(daysOfWeek + " and ordinal is " + daysOfWeek.ordinal());
        }
    }
}
