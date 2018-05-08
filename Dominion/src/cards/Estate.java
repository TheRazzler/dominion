/**
 * 
 */
package cards;

import model.Dominion;

/**
 * @author Spencer Yoder
 *
 */
public class Estate extends Property {
    
    public Estate() {
        super("Estate", "Victory", 2, 1);
    }

    /* (non-Javadoc)
     * @see cards.Card#duplicate()
     */
    @Override
    public Card duplicate() {
        return new Estate();
    }
}
