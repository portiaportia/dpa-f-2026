package strategy;

import java.util.Random;

public class Goalie extends Player {
	private Random rand = new Random();;

	public Goalie(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public void setOffenceBehavior() {
		this.offenceBehavior = new BlockGoalBehavior();
	}

	public void setDefenceBehavior() {
		this.defenceBehavior = new BlockGoalBehavior();
	}

	public String toString() {
		return super.toString() + " plays the position: Goalie";
	}
}
