/**
 * 
 */
package cards;

import model.Dominion;

/**
 * @author Spencer Yoder
 *
 */
public class Gold extends Treasure {

    /**
     * @param name
     * @param description
     * @param type
     * @param price
     */
    public Gold() {
        super("Gold", "Treasure", 6, 3);
    }

    /* (non-Javadoc)
     * @see cards.Card#duplicate()
     */
    @Override
    public Card duplicate() {
        return new Gold();
    }

}
