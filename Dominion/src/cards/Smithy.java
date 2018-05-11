package cards;

import model.Dominion;
import model.Player;

public class Smithy extends Kingdom {

	public Smithy() {
		super("Smithy", "+3 Cards", 4);
	}

	@Override
	public void play(Dominion model) {
        Player p = model.getCurrentPlayer();
        p.draw(3);
	}

	@Override
	public Card duplicate() {
        return new Smithy();
	}

}
