import java.util.List;

public class GetWinner {


    public int getWinner(int[] arrayOfResult, int numberOfPlayer, List<String> concatenateListOfCardsAndPlayer) {

        int winner = -1;
        int maxValue = 0;
        for (int i = 0; i < numberOfPlayer; i++) {
            if (arrayOfResult[i] < 22 && arrayOfResult[i] > maxValue){
                System.out.println(arrayOfResult[i] + " arrayOfResult");
                System.out.println(maxValue + " maxValue");
                maxValue = arrayOfResult[i];
                winner = i;
            }
        }
        if (winner == -1){
            System.out.println("Everyone lost");
        } else {
            System.out.print("Player " + concatenateListOfCardsAndPlayer.get(winner) + "cards WON");
        }
        return winner;
    }
}
