package cards;

import model.Dominion;
import model.Player;

public class Festival extends Kingdom {

	public Festival() {
		super("Festival", "+2 Actions\n"
				+ "+1 Buy\n"
				+ "+2 Money", 5);
	}

	@Override
	public void play(Dominion model) {
        Player p = model.getCurrentPlayer();
        p.incrementActions(2);
        p.incrementBuys(1);
        p.incrementMoney(2);

	}

	@Override
	public Card duplicate() {
        return new Festival();
	}

}
