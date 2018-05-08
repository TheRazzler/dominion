/**
 * 
 */
package cards;

import model.Dominion;

/**
 * @author Spencer Yoder
 *
 */
public class Silver extends Treasure {

    /**
     * @param name
     * @param description
     * @param type
     * @param price
     */
    public Silver() {
        super("Silver", "Treasure", 3, 2);
    }

    /* (non-Javadoc)
     * @see cards.Card#duplicate()
     */
    @Override
    public Card duplicate() {
        return new Silver();
    }

}
