package strategy;

import java.util.Random;

public class BlockBehavior implements DefenceBehavior {
	Random rand = new Random();
	private String[] blocks = { "blocks player from passing", "blocks player from shooting",
			"checks player with puck" };

	public String play() {
		return blocks[rand.nextInt(blocks.length)];
	}
}
