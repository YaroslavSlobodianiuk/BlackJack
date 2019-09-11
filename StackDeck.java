package com.blackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class StackDeck implements Deckable {
    String[] suit = {"Spades", "Diamonds", "Hearts", "Clubs"};
    String[] name = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    Integer[] value = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
    int counter = 0;


    Stack<Card> stack = new Stack<>();


    public void addToList() {
        for (int i = 0; i < suit.length; i++){
            for (int j = 0; j < name.length; j++){
                Card tmp = new Card(suit[i], name[j], value[j]);
                stack.add(tmp);
            }
        }
        Collections.shuffle(stack);
    }


    public Card getCard() {
        Card tmp = stack.get(counter);
        stack.remove(counter);
        counter++;
        return tmp;
    }
}

