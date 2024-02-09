package org.example;

import javax.naming.OperationNotSupportedException;


public interface Deck {
    void cut(int index);

    Card deal();

    void newOrder(Deck cards);

    int search(Card card);

    void shuffle();

    int size();

    Card turnOver();

}