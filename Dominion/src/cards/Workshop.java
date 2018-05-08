/**
 * 
 */
package cards;

import model.Dominion;

/**
 * @author Spencer Yoder
 *
 */
public class Workshop extends Kingdom {

    /**
     * @param name
     * @param description
     * @param price
     */
    public Workshop() {
        super("Workshop", "Gain a card costing up to 4.", 3);
    }

    /* (non-Javadoc)
     * @see cards.Card#play(model.Dominion)
     */
    @Override
    public void play(Dominion model) {
        model.specialBuy(4);
    }

    /* (non-Javadoc)
     * @see cards.Card#duplicate()
     */
    @Override
    public Card duplicate() {
        return new Workshop();
    }
}
