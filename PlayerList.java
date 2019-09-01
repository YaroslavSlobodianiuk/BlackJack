import java.util.ArrayList;
import java.util.List;

public class PlayerList {

    List<Player> players = new ArrayList<Player>();

    void addToPlayerList(String name, List<Card> cards) {
         players.add(name, cards);
    }
}
