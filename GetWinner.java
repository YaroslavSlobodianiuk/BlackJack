public class GetWinner {

    public int getWinner(int[] arrayOfResult, int numberOfPlayer) {

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
            winner++;
            System.out.println("Player " + winner + " won");
        }
        return winner;
    }
}