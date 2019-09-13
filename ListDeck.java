package com.blackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ListDeck implements Deckable {

    int counter = 0;


    public Card getCard(List<Card> list) {
        Card tmp = list.get(counter);
        list.remove(counter);
        counter++;
        return tmp;
    }
}
