package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public abstract class AbstractDeck {

protected List<Card> cards;

public List<Card>  getDeck() {
    return this.cards;
}
@Override
    public int size(){
    return this.cards.size();
}

    @Override
    public void shuffle() {
        long seed = System.nanoTime();
        Collections.shuffle(this.cards, new Random(seed));
    }

    @Override
    public void cut(int index) {

        List<Card> top = new ArrayList<>();
        top.addAll(this.cards.subList(0, index));
        List<Card> bottom = new ArrayList<>();
        bottom.addAll(this.cards.subList(index, this.cards.size()));

        this.cards.clear();

        this.cards.addAll(bottom);
        this.cards.addAll(top);

    }

    @Override
    public Card deal() {
        return this.cards.remove(0);
    }

    @Override
    public Card turnOver() {
        return this.cards.get(0);
    }

    @Override
    public int search(Card card) {
        return this.cards.indexOf(card);
    }

    @Override
    public void newOrder(Deck cards) {
        Collections.sort(this.cards);
    }






}






