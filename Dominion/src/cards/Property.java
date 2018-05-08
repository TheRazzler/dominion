/**
 * 
 */
package cards;

import model.Dominion;

/**
 * @author Spencer Yoder
 *
 */
public abstract class Property extends Card {
    private int value;

    /**
     * @param name
     * @param description
     * @param type
     * @param price
     */
    public Property(String name, String description, int price, int value) {
        super(name, description, price);
        this.value = value;
    }

    /* (non-Javadoc)
     * @see cards.Card#play(model.Dominion)
     */
    @Override
    public void play(Dominion model) {
        throw new IllegalArgumentException("Cannot play property card.");
    }
}
