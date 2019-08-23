import java.util.Random;

public class CardRandom {
    Random random = new Random();
    Card cardForRandom = new Card();
    int defineValueOfCard;
    String a;
    int b;
    String[] arrayOfCards;


    public String doStringRandom(String[] array) {
        int randomStringIndex = random.nextInt(array.length);
        a = array[randomStringIndex];
        b = randomStringIndex;
        return array[randomStringIndex];
    }
    public int defineValueOfCard() {
        if (a.contains("ace")) {
            defineValueOfCard = 11;
        }
        if (a.contains("two")) {
            defineValueOfCard = 2;
        }
        if (a.contains("three")) {
            defineValueOfCard = 3;
        }
        if (a.contains("four")) {
            defineValueOfCard = 4;
        }
        if (a.contains("five")) {
            defineValueOfCard = 5;
        }
        if (a.contains("six")) {
            defineValueOfCard = 6;
        }
        if (a.contains("seven")) {
            defineValueOfCard = 7;

        }
        if (a.contains("eight")) {
            defineValueOfCard = 8;
        }
        if (a.contains("nine")) {
            defineValueOfCard = 9;
        }
        if (a.contains("ten")) {
            defineValueOfCard = 10;
        }
        if (a.contains("jack")) {
            defineValueOfCard = 2;
        }
        if (a.contains("queen")) {
            defineValueOfCard = 3;
        }
        if (a.contains("king")) {
            defineValueOfCard = 4;
        }
        return defineValueOfCard;
    }
    public void removeString(String[] arrayOfCardsFromMain) {
        this.arrayOfCards = arrayOfCardsFromMain;
        arrayOfCards[b] = null;
    }

}
