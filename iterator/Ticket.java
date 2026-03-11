package iterator;

import java.util.ArrayList;

public class Ticket {
	private String name;
	private String teamMember;
	private int difficulty;

	public Ticket(String name, String teamMember, int difficulty) {
		this.name = name;
		this.teamMember = teamMember;
		this.difficulty = difficulty;
	}

	public String toString() {
		return name + "(" + difficulty + ") - " + teamMember;
	}

	public String getName() {
		return name;
	}
}
