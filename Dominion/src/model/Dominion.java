/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;

import cards.*;
import model.Player;

/**
 * @author Spencer Yoder
 *
 */
public class Dominion {
    
    private boolean locked;
    private ArrayList<Player> players;
    private int id;
    private Deck[] piles;
    
    public Dominion(ArrayList<Player> players, int id) {
        this.players = players;
        this.id = id;
        piles = new Deck[] {new Deck(new Copper(), 60), new Deck(new Silver(), 40), new Deck(new Gold(), 30),
                new Deck(new Estate(), 24), new Deck(new Duchy(), 12), new Deck(new Province(), 12),
                new Deck(new Cellar(), 10), new Deck(new Village(), 10)};
        Arrays.sort(piles);
    }
    
    public void lock() {
        locked = true;
    }
    
    public void unlock() {
        locked = false;
    }
    
    public boolean play(int idx) {
        return false;
    }

    /**
     * @param string
     * @return
     */
    public int[] promptCardsInHand(String string, int bound) {
        return null;
    }

    /**
     * @return
     */
    public Player getCurrentPlayer() {
        return players.get(id);
    }

    /**
     * @return
     */
    public int getSeed() {
        return 0;
    }
    
    public void specialBuy(int bound) {
        int index = 0; //TODO get index
        while(piles[index].getPrice() > bound) {
            index = 0; //TODO get index
        }
        getCurrentPlayer().addToDiscard(piles[index].draw());
    }
}
