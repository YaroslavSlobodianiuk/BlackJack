package com.blackJack;

public class DeckBuilder {

    public ListDeck createList() {
        return new ListDeck();
    }
    public StackDeck createStack() {
        return new StackDeck();
    }
}
