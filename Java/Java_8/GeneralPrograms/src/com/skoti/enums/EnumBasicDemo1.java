package com.skoti.enums;

enum Month {

    JAN, FEB, MAR, APRIL, MAY, JUNE
}
public class EnumBasicDemo1 {

    enum WEEK_DAYS{

        MON, TUE, WED, THUR, FRI, SAT, SUN;
    }

    public static void main(String[] args) {

        System.out.println("Enum can be declared inside/outside of a class. But not inside any method");
        Month month = Month.JAN;
        System.out.println(month);

        System.out.println(WEEK_DAYS.FRI);

        Month monthInSwitch = Month.APRIL;
        switch (monthInSwitch) {

            case JAN:
                System.out.println("January");
                break;
            case MAR:
                System.out.println("March");
                break;
            case APRIL:
                System.out.println("April");
                break;
            default:
                System.out.println("Not valid month");

        }
    }
}
