package observer;

import java.util.ArrayList;

public class Cook implements Subject {
	private String name;
	private ArrayList<Observer> observers;

	public Cook(String name) {
		observers = new ArrayList<Observer>();
		this.name = name;
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void enterSighting(String location, String description, String accomplices) {
		ArrayList<String> people = new ArrayList<String>();

		String[] accomplicesList = accomplices.split(",");
		for (String person : accomplicesList) {
			people.add(person.strip());
		}

		notifyObservers(location, description, people);
	}

	@Override
	public void notifyObservers(String location, String description, ArrayList<String> accomplices) {
		for (Observer observer : observers) {
			observer.update(location, description, accomplices);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public String getName() {
		return name;
	}

}
