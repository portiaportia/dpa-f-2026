package observer;

import java.util.ArrayList;

public class Cartel implements Observer {
	private Subject cook;
	private ArrayList<Sighting> sightings;

	public Cartel(Subject cook) {
		this.cook = cook;
		cook.registerObserver(this);
		sightings = new ArrayList<Sighting>();
	}

	public void update(String location, String description, ArrayList<String> accomplices) {
		sightings.add(new Sighting(location, description, accomplices));
	}

	public String getLog() {
		String log = "";

		for (Sighting sighting : sightings) {
			log += sighting.getLocation() + " (" + sighting.getDetails() + "), " + sighting.getAccomplices() + "\n";
		}

		return log;
	}
}
