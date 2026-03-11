package observer;

import java.util.ArrayList;

public class Police implements Observer {
	private Subject cook;
	private ArrayList<String> locations;
	private String notes = "";
	private ArrayList<String> people;

	public Police(Subject cook) {
		this.cook = cook;
		cook.registerObserver(this);
		locations = new ArrayList<String>();
		people = new ArrayList<String>();
	}

	public void update(String location, String description, ArrayList<String> accomplices) {
		locations.add(location);
		notes += "- " + description + "\n";

		for (String person : accomplices) {
			if (!people.contains(person.trim().toLowerCase())) {
				people.add(person.toLowerCase());
			}
		}

	}

	public String getLog() {
		String log = "Locations:\n";
		log += getList(locations);
		log += "\nNotes:\n";
		log += notes;
		log += "\nAccomplices:\n";
		log += getList(people);

		return log;
	}

	private String getList(ArrayList<String> list) {
		String result = "";
		for (String item : list) {
			result += "- " + item.substring(0, 1).toUpperCase() + item.substring(1) + "\n";
		}

		return result;
	}

}