package java9.interfaces;

public class CardImpl implements Card{

    public static void main(String[] args) {

        Card card = new CardImpl();
        long cardId = card.fetchCard();
        System.out.println(cardId);

    }
}
