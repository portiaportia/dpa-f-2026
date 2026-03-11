package strategy;

import java.util.Random;

public class Defenceman extends Player {

	public Defenceman(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public void setOffenceBehavior() {
		if (rand.nextInt(10) < 9) {
			this.offenceBehavior = new PassBehavior();
		} else {
			this.offenceBehavior = new SlapShotBehavior();
		}
	}

	public void setDefenceBehavior() {
		switch (rand.nextInt(2)) {
			case 0:
				this.defenceBehavior = new ChasePuckBehavior();
				break;
			case 1:
				this.defenceBehavior = new BlockBehavior();
				break;
		}
	}

	public String toString() {
		return super.toString() + " plays the position: Defenceman";
	}
}
