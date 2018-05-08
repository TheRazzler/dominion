/**
 * 
 */
package cards;

import model.Dominion;

/**
 * @author Spencer Yoder
 *
 */
public class Province extends Property {
    
    public Province() {
        super("Duchy", "Victory", 8, 6);
    }

    /* (non-Javadoc)
     * @see cards.Card#play(model.Dominion)
     */
    @Override
    public void play(Dominion model) {
        throw new IllegalArgumentException("Cannot play property card.");
    }

    /* (non-Javadoc)
     * @see cards.Card#duplicate()
     */
    @Override
    public Card duplicate() {
        return new Province();
    }
}
