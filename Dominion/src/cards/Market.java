package cards;

import model.Dominion;
import model.Player;

public class Market extends Kingdom {

	public Market() {
		super("Market", "+1 Card\n"
				+ "+1 Action\n"
				+ "+1 Buy\n"
				+ "+1 Money", 5);
	}

	@Override
	public void play(Dominion model) {
        Player p = model.getCurrentPlayer();
        p.draw();
        p.incrementActions(1);
        p.incrementBuys(1);
        p.incrementMoney(1);

	}

	@Override
	public Card duplicate() {
        return new Market();
	}
}
