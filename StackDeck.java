package com.blackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class StackDeck implements Deckable {

    Stack<Card> stack;
    public StackDeck(Stack<Card> stack){
        this.stack = stack;
    }

    public Card getCard() {
        Card tmp = stack.pop();
        return tmp;
    }
}

