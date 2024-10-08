package java9.interfaces;

import java.util.UUID;
/*
private methods in interface to avoid redundant code and more re-usability
 */
public interface Card {

    //private method in interface
    private Long createCardID() {
        return UUID.randomUUID().node();
    }

    //private static method in interface
    private static void displayCardDetails() {
        // Method implementation goes here.
    }
}
