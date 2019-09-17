package com.blackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDeck implements Deckable{

    int counter = 0;
    List<Card> list;
    public ListDeck(List<Card> list) {
        this.list = list;
    }

    public Card getCard() {
        Card tmp = list.get(counter);
        list.remove(counter);
        counter++;
        return tmp;
    }
}