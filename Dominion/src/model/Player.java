/**
 * 
 */
package model;

import java.util.ArrayList;

import cards.Card;
import cards.Deck;

/**
 * @author Spencer Yoder
 *
 */
public class Player {
    private String name;
    private Deck deck;
    private Deck discard;
    private ArrayList<Card> hand;
    private Dominion model;
    private int actions;
    private int buys;
    private int money;
    
    public Player(String name, Dominion model) {
        this.name = name;
        deck = new Deck();
        discard = new Deck();
        hand = new ArrayList<Card>();
        this.model = model;
    }
    
    public ArrayList<Card> getHand() {
        return hand;
    }

    /**
     * @param i
     */
    public void discard(int i) {
        discard.insert(hand.remove(i));
    }
    
    public Card getCardFromHand(int index) {
        return hand.remove(index);
    }
    
    public void draw(int number) {
        for(int i = 1; i <= number; i++) {
            draw();
        }
    }

    /**
     * 
     */
    public void draw() {
        if(deck.isEmpty()) {
            deck = discard;
            discard = new Deck();
            deck.shuffle(model.getSeed());
        } else {
            hand.add(deck.draw());
        }
    }
    
    public void startTurn() {
        actions = 1;
        buys = 1;
    }
    
    public void incrementActions(int amount) {
        actions += amount;
        if(actions < 0)
            actions = 0;
    }
    
    public void incrementBuys(int amount) {
        buys += amount;
        if(buys < 0)
            buys = 0;
    }

    /**
     * @param draw
     */
    public void addToDiscard(Card c) {
        discard.insert(c);
    }

	public void incrementMoney(int amount) {
		money += amount;
		if(money < 0)
			money = 0;
	}
}
