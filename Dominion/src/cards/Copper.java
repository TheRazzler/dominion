/**
 * 
 */
package cards;

import model.Dominion;

/**
 * @author Spencer Yoder
 *
 */
public class Copper extends Treasure {

    /**
     * @param name
     * @param description
     * @param type
     * @param price
     */
    public Copper() {
        super("Copper", "Treasure", 0, 1);
    }

    /* (non-Javadoc)
     * @see cards.Card#duplicate()
     */
    @Override
    public Card duplicate() {
        return new Copper();
    }

}
