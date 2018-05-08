/**
 * 
 */
package cards;

import model.Dominion;

/**
 * @author Spencer Yoder
 *
 */
public abstract class Kingdom extends Card {

    /**
     * @param name
     * @param description
     * @param type
     * @param price
     */
    public Kingdom(String name, String description, int price) {
        super(name, description, price);
    }
}
