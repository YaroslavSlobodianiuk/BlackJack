import java.util.ArrayList;
import java.util.List;

public class PList {

    List<String> players = new ArrayList();

    private List<String> concatenateListOfCardsAndPlayer = new ArrayList<>();


    void addNameOfPlayer(String name) {
        players.add(name);
    }
    List<String> getPlayers() {
        return players;
    }
    void concatenateCardsAndPlayer(List<String> playerCards, List player, int numberOfPlayer) {
        String listString = player.get(numberOfPlayer) + " with ";
        for (String card: playerCards) {
            listString += card + " ";
        }
        concatenateListOfCardsAndPlayer.add(listString);
    }
    List<String> getConcatenateListOfCardsAndPlayer() {
        /*for (String i: concatenateListOfCardsAndPlayer) {
            System.out.println(i);
        }*/
        return concatenateListOfCardsAndPlayer;
    }
}
