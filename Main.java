import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        RandomClass random = new RandomClass();
        GetWinnerClass getWinnerClass = new GetWinnerClass();
        int result = 0;
        System.out.println("BlackJack");
        System.out.println("Enter number of players");
        int numberOfPlayer;
        numberOfPlayer = in.nextInt();
        int[] arrayOfResults = new int[numberOfPlayer];
        for (int k = 1; k < numberOfPlayer+1; k++){
            System.out.println("Player " + k);
            System.out.println("- In order to receive cards tap 1\n- Exit - 0");
            if (in.nextInt() == 1) {
                for (int i = 0;i < 2;i++){

                    int sum[] = new int[2];
                    sum[i] = random.getRandArrayElement();
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
                int test = random.getRandArrayElement();
                System.out.println(test);
                result +=test;
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
        getWinnerClass.getWinner(arrayOfResults, numberOfPlayer);

    }

}


