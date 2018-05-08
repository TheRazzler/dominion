/**
 * 
 */
package cards;

import model.Dominion;

/**
 * @author Spencer Yoder
 *
 */
public class Duchy extends Property {
    
    public Duchy() {
        super("Province", "Victory", 5, 3);
    }

    /* (non-Javadoc)
     * @see cards.Card#duplicate()
     */
    @Override
    public Card duplicate() {
        return new Duchy();
    }
}
