package strategy;

import java.util.Random;

public abstract class Player {
	private String firstName;
	private String lastName;
	protected DefenceBehavior defenceBehavior;
	protected OffenceBehavior offenceBehavior;
	protected Random rand = new Random();

	public Player(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		setDefenceBehavior();
		setOffenceBehavior();
	}

	public String play(boolean possession) {
		if (possession) {
			if (offenceBehavior == null)
				return "not playing";
			return offenceBehavior.play();
		} else {
			if (defenceBehavior == null)
				return "not playing";
			return defenceBehavior.play();
		}
	}

	public abstract void setDefenceBehavior();

	public abstract void setOffenceBehavior();

	public String toString() {
		return firstName + " " + lastName;
	}
}
