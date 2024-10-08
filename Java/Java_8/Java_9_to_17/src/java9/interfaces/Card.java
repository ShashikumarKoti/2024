package java9.interfaces;

import java.util.UUID;
/*
private methods in interface to avoid redundant code and more re-usability
 */
public interface Card {

    default long fetchCard() {
        Long cardID = createCardID();
        displayCardDetails();
        return cardID;
    }

    //private method in interface
    private Long createCardID() {
        return 123456L;
    }

    //private static method in interface
    private static void displayCardDetails() {
        System.out.println("Card details in private method called");
    }
}
