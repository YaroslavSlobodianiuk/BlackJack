package com.blackJack;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        GetWinner getWinner = new GetWinner();
        DeckBuilder deckBuilder = new DeckBuilder();

        //Deckable listDeck = new ListDeck(); //Интерфейс Deckable: List
        Deckable stackDeck = new StackDeck(); //Интерфейс Deckable: Stack

        List<Player> players = new ArrayList<>();
        List<Card> listCards = deckBuilder.createList();// створюю колоду List
        Stack<Card> stackCards = deckBuilder.createStack();// створюю колоду Stack


        int result = 0;
        int numberOfPlayer;
        int counter = 1;

        System.out.println("BlackJack");
        System.out.println("Enter number of players");
        numberOfPlayer = in.nextInt();

        int[] arrayOfResults = new int[numberOfPlayer];
        Player[] player = new Player[numberOfPlayer];

        for (int i = 0; i < numberOfPlayer; i++) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter name of " + counter + " player");

            String name = scanner.nextLine();
            player[i] = new Player(name, new ArrayList<>());
            counter++;
        }

        for (int k = 0; k < numberOfPlayer; k++){
            System.out.println("Player " + player[k].name);
            System.out.println("- In order to receive cards tap 1\n- Exit - 0");



            if (in.nextInt() == 1) {
                for (int i = 0;i < 2;i++){

                    int sum[] = new int[2];
                    Card card = stackDeck.getCard(stackCards);
                    System.out.println(card);
                    player[k].cards.add(card);

                    sum[i] = card.getValue();
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

                Card card = stackDeck.getCard(stackCards);
                System.out.println(card);
                player[k].cards.add(card);

                int plus = card.getValue();
                System.out.println(plus);
                result +=plus;
                System.out.println(result);
                if (result > 21) {
                    System.out.println("You lost");
                    break;
                }
            }
            System.out.println("Finish! You have " + result + " points!");

            arrayOfResults[k] = result;
            result = 0;
            players.add(player[k]);
        }
        getWinner.getWinner(arrayOfResults, numberOfPlayer, players);
    }

}
