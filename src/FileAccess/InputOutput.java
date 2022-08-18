package FileAccess;

import java.util.ArrayList;

import Library.Author;
import Library.Book;
import Library.Media;
import Library.MovieDVD;
import Library.Person;
import Library.Producer;

public class InputOutput {
	private ArrayList<Media> media;
	private ArrayList<String> people;
	
	media.add(new Book(3, true, "Mortal Engines", "sci-fi", new Author(), "x", 231));
	media.add(new Book(2, false, "Lunar Park", "horror", new Author(), "y", 429));
	media.add(new Book(0, true , "The Side of Paradise", "poem", new Author(), "x", 231));
	media.add(new MovieDVD(6, true, "Pulp Fiction", "drama", new Producer(), 161 , "A Band Apart Jersey Films", "Dvd"));

	
	 public ArrayList<Media> getMedia() {
		return media;
	}
	
	public ArrayList<String> getPeople() {
		return people;
	}
	public void setPeople(ArrayList<String> people) {
		this.people = people;
	}
	
	
	
}
