package com.skoti.programs.strings;

import java.util.Base64;

public class Base64Encoder {

    public static void main(String[] args) {

        String orgString = "Hello there!!!";
        String encodeToString = Base64.getEncoder().encodeToString(orgString.getBytes());

        System.out.println("Encoded string: " + encodeToString );

        String decodedString = new String(Base64.getDecoder().decode(encodeToString.getBytes()));
        System.out.println("Decoded string:" + decodedString);
    }
}
