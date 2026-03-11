package strategy;

import java.util.Random;

public class PassBehavior implements OffenceBehavior {
	Random rand = new Random();

	public String play() {
		return "passes to a forward";
	}
}
