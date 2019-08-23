public class Card {
    private String[] suit = {"spades", "clubs", "hearts", "diamonds"};
    private String[] name = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
    String[] deck = new String[suit.length*name.length];
    int indexOfDeck = 0;
    public String[] createDeck() {
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < name.length; j++) {
                deck[indexOfDeck] = suit[i] + " " + name[j];
                indexOfDeck++;
            }
        }
        return deck;
    }

}