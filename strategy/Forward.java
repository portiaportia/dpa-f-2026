package strategy;

import java.util.Random;

public class Forward extends Player {

	public Forward(String firstName, String lastName) {
		super(firstName, lastName);
	}

	public void setOffenceBehavior() {
		switch (rand.nextInt(2)) {
			case 0:
				this.offenceBehavior = new PassBehavior();
				break;
			case 1:
				this.offenceBehavior = new ShootBehavior();
				break;
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
		return super.toString() + " plays the position: Forward";
	}
}
