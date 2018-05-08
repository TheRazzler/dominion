/**
 * 
 */
package cards;

import model.Dominion;
import model.Player;

/**
 * @author Spencer Yoder
 *
 */
public class Remodel extends Kingdom {

    /**
     * @param name
     * @param description
     * @param price
     */
    public Remodel() {
        super("Remodel", "Trash a card from your hand.\n"
                + "Gain a card costing up to 2 more than it.", 4);
    }

    /* (non-Javadoc)
     * @see cards.Card#play(model.Dominion)
     */
    @Override
    public void play(Dominion model) {
        Player p = model.getCurrentPlayer();
        int index = model.promptCardsInHand("Select a card to trash.", 1)[0];
        Card c = p.getCardFromHand(index);
        model.specialBuy(c.getPrice() + 2);
    }

    /* (non-Javadoc)
     * @see cards.Card#duplicate()
     */
    @Override
    public Card duplicate() {
        return new Remodel();
    }
}
