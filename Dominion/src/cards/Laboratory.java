package cards;

import model.Dominion;
import model.Player;

public class Laboratory extends Kingdom {

	public Laboratory() {
		super("Laboratory", "+2 Cards\n"
				+ "+1 Action", 5);
	}

	@Override
	public void play(Dominion model) {
        Player p = model.getCurrentPlayer();
		p.draw(2);
        p.incrementActions(1);
	}

	@Override
	public Card duplicate() {
        return new Laboratory();
	}

}
