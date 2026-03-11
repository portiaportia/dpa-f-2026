package iterator;

public class TaskList {
	private Ticket[] tickets = new Ticket[100];
	private int count = 0;
	private String name;

	public TaskList(String name) {
		this.name = name;
	}

	public void addTicket(String name, String teamMember, int difficulty) {
		if (count == tickets.length) {
			System.out.println("Sorry, this list has reached it's capicity");
		}

		tickets[count++] = new Ticket(name, teamMember, difficulty);
	}

	public void addTicket(Ticket ticket) {
		tickets[count++] = ticket;
	}

	public Ticket getTicket(String name) {
		Ticket ticket = null;
		boolean shuffle = false;
		for (int i = 0; i < count; i++) {
			if (shuffle == false && tickets[i].getName().equalsIgnoreCase(name)) {
				ticket = tickets[i];
				tickets[i] = null;
				shuffle = true;
			}

			if (shuffle == true && i + 1 < count && tickets[i + 1] != null) {
				tickets[i] = tickets[i + 1];
				tickets[i + 1] = null;
			}
		}

		if (shuffle) {
			count--;
		}

		return ticket;
	}

	public TaskListIterator createIterator() {
		return new TaskListIterator(tickets);
	}

	public String toString() {
		String result = name + ":\n";
		TaskListIterator iterator = new TaskListIterator(tickets);

		while (iterator.hasNext()) {
			result += "- " + iterator.next().toString() + "\n";
		}

		return result + "\n";
	}
}
