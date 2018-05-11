package cards;

import model.Dominion;
import model.Player;

public class Market extends Kingdom {

	public Market() {
		super("Market", "+1 Card\n"
				+ "+1 Action"
				+ "+1 Buy"
				+ "+1 Money", 5);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play(Dominion model) {
        Player p = model.getCurrentPlayer();
        p.incrementActions(1);
        p.draw();
        p.incrementMoney(1);
		// TODO Auto-generated method stub

	}

	@Override
	public Card duplicate() {
        return new Market();
	}
}
