package com.blackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class StackDeck implements Deckable {

    public Card getCard(Stack<Card> stack) {
        Card tmp = stack.pop();
        return tmp;
    }
}