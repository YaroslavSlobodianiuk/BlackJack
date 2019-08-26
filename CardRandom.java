import java.util.Random;

public class CardRandom {
    Random random = new Random();

    int defineValueOfCard = -1;
    String a;
    int b;
    String[] arrayOfCards;


    public String doStringRandom(String[] array) {
        int randomStringIndex = random.nextInt(array.length);
        a = array[randomStringIndex];
        b = randomStringIndex;
        return array[randomStringIndex];
    }
    public int defineValueOfCard(String name) {
        if (name.contains("Ace")) {
            defineValueOfCard = 11;
        }
        if (name.contains("Two")) {
            defineValueOfCard = 2;
        }
        if (name.contains("Three")) {
            defineValueOfCard = 3;
        }
        if (name.contains("Four")) {
            defineValueOfCard = 4;
        }
        if (name.contains("Five")) {
            defineValueOfCard = 5;
        }
        if (name.contains("Fix")) {
            defineValueOfCard = 6;
        }
        if (name.contains("Seven")) {
            defineValueOfCard = 7;
        }
        if (name.contains("Eight")) {
            defineValueOfCard = 8;
        }
        if (name.contains("Nine")) {
            defineValueOfCard = 9;
        }
        if (name.contains("Ten")) {
            defineValueOfCard = 10;
        }
        if (name.contains("Jack")) {
            defineValueOfCard = 10;
        }
        if (name.contains("Queen")) {
            defineValueOfCard = 10;
        }
        if (name.contains("King")) {
            defineValueOfCard = 10;
        }
        return defineValueOfCard;
    }
    public void removeString(String[] arrayOfCardsFromMain) {
        this.arrayOfCards = arrayOfCardsFromMain;
        arrayOfCards[b] = null;
    }

}
