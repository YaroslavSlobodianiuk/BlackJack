import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CardRandom cardRandom = new CardRandom();
        Scanner in = new Scanner(System.in);
        GetWinner getWinner = new GetWinner();
        Deck deck = new Deck();

        deck.addToList();

        int result = 0;
        int numberOfPlayer;

        System.out.println("BlackJack");
        System.out.println("Enter number of players");
        numberOfPlayer = in.nextInt();
        int[] arrayOfResults = new int[numberOfPlayer];

        for (int k = 1; k < numberOfPlayer+1; k++){
            System.out.println("Player " + k);
            System.out.println("- In order to receive cards tap 1\n- Exit - 0");
            if (in.nextInt() == 1) {
                for (int i = 0;i < 2;i++){

                    int sum[] = new int[2];
                    Card card = deck.getCard();
                    System.out.println(card);
                    while (card == null) {
                        if (card == null) {
                            System.out.println("NULL");
                            card = deck.getCard();
                            System.out.println(card);
                        } else {
                            break;
                        }
                    }
                    sum[i] = cardRandom.defineValueOfCard(card.getName());
                    System.out.println(sum[i]);
                    result += sum[i];
                    if (result == 22){
                        System.out.println("Gold Jack");
                    }

                }
                System.out.println(result);
            } else {
                System.out.println("Finish!");
            }
            while (true) {
                System.out.println("- Receive one more card! - 1\n- Finish - 0");
                if (in.nextInt() == 0) break;
                Card card = deck.getCard();
                System.out.println(card);
                while (card == null) {
                    if (card == null){
                        System.out.println("NULL");
                        card = deck.getCard();
                        System.out.println(card);
                    } else {
                        break;
                    }
                }
                int plus = cardRandom.defineValueOfCard(card.getName());
                System.out.println(plus);
                result +=plus;
                System.out.println(result);
                if (result > 21) {
                    System.out.println("You lost");
                    break;
                }
            }
            System.out.println("Finish! You have " + result + " points!");
            arrayOfResults[k-1] = result;
            result = 0;
        }
        getWinner.getWinner(arrayOfResults, numberOfPlayer);

    }

}
