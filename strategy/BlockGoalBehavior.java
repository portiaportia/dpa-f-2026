package strategy;

import java.util.Random;

public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior {
	Random rand = new Random();
	private String[] blocks = { "hand blocks the puck", "catches the puck", "blocks puck with knee pads",
			"blocks puck with stick" };

	public String play() {
		return blocks[rand.nextInt(blocks.length)];
	}
}
