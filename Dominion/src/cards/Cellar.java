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
public class Cellar extends Kingdom {

    /**
     * @param name
     * @param description
     * @param type
     * @param price
     */
    public Cellar() {
        super("Cellar", "+1 Action\n"
                + "Discard any number of cards, then draw that many.", 2);
    }

    /* (non-Javadoc)
     * @see cards.Card#play(model.Dominion)
     */
    @Override
    public void play(Dominion model) {
        Player p = model.getCurrentPlayer();
        int[] indices = model.promptCardsInHand("Select the cards to discard", -1);
        for(int i = 0; i < indices.length; i++) {
            p.discard(indices[i]);
        }
        for(int i = 0; i < indices.length; i++) {
            p.draw();
        }
        p.incrementActions(1);
    }

    /* (non-Javadoc)
     * @see cards.Card#duplicate()
     */
    @Override
    public Card duplicate() {
        return new Cellar();
    }
}
