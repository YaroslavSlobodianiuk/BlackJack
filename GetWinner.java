public class GetWinner {


    public int getWinner(int[] arrayOfResult, int numberOfPlayer, String[] nameOfPlayer, String[][] receivedCards) {

        int winner = -1;
        String nameOfWinner = null;
        int maxValue = 0;
        for (int i = 0; i < numberOfPlayer; i++) {
            if (arrayOfResult[i] < 22 && arrayOfResult[i] > maxValue){
                System.out.println(arrayOfResult[i] + " arrayOfResult");
                System.out.println(maxValue + " maxValue");
                maxValue = arrayOfResult[i];
                winner = i;
                nameOfWinner = nameOfPlayer[i];
            }
        }
        if (winner == -1){
            System.out.println("Everyone lost");
        } else {
            System.out.print("Player " + nameOfWinner + " won with such numbers of cards: ");
            for (int j = 0; j < receivedCards.length; j++){
                if (receivedCards[winner][j] == null) break;
                System.out.print(receivedCards[winner][j] + " ");
            }
        }
        return winner;
    }
}
