import java.util.ArrayList;
import java.util.List;

public class Player {
    String name;
    List<Card> cards;
    public Player (String name, List<Card> cards) {
        this.name = name;
        this.cards = cards;
    }

    public String getName() {
        return name;
    }
    public List<Card> getCards(){
        return cards;
    }
    public String toString() {
        return name + " with " + cards;
    }
}
