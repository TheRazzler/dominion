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
public class Village extends Kingdom {

    /**
     * @param name
     * @param description
     * @param type
     * @param price
     */
    public Village() {
        super("Village", "+1 Card\n"
                + "+2 Actions", 3);
    }

    /* (non-Javadoc)
     * @see cards.Card#play(model.Dominion)
     */
    @Override
    public void play(Dominion model) {
        Player p = model.getCurrentPlayer();
        p.incrementActions(2);
        p.draw();
    }

    /* (non-Javadoc)
     * @see cards.Card#duplicate()
     */
    @Override
    public Card duplicate() {
        return new Village();
    }
}
