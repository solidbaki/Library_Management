package Library;

import java.util.ArrayList;

public class Producer extends Person {
	private ArrayList<MovieDVD> producersMovies;

	@Override
	public String toString() {
		return "Producer " + super.toString();
	}

	public Producer(String fullName, String id, String type, boolean hasAccessToSystem,
			ArrayList<MovieDVD> producersMovies) {
		super(fullName, id, "producer", false);
		this.producersMovies = producersMovies;
	}

}
