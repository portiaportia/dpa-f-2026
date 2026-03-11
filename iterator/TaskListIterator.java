package iterator;

import java.util.Iterator;

public class TaskListIterator implements Iterator<Ticket> {
	private Ticket[] tickets;
	private int position = 0;

	public TaskListIterator(Ticket[] tickets) {
		this.tickets = tickets;
	}

	public Ticket next() {
		if (hasNext()) {
			return tickets[position++];
		}
		return null;
	}

	public boolean hasNext() {
		return (position < tickets.length && tickets[position] != null);
	}
}
