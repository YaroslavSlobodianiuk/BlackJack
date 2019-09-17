package com.blackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class DeckBuilder {

    String[] suit = {"Spades", "Diamonds", "Hearts", "Clubs"};
    String[] name = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    Integer[] value = {11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};

    public List<Card> createList() {
        List<Card> list = new ArrayList<>();
        for (int i = 0; i < suit.length; i++){
            for (int j = 0; j < name.length; j++){
                Card tmp = new Card(suit[i], name[j], value[j]);
                list.add(tmp);
            }
        }
        Collections.shuffle(list);
        return list;
    }

    public Stack<Card> createStack() {
        Stack<Card> stack = new Stack<>();
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < name.length; j++) {
                Card tmp = new Card(suit[i], name[j], value[j]);
                stack.push(tmp);
            }
        }
        Collections.shuffle(stack);
        return stack;
    }
}
