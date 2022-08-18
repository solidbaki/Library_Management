package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryQuery {

	// Taking a Media ArrayList and a specific genre, return all the media instances
	public boolean searchByGenre(ArrayList<Media> mediaList, String genre) {
		if (!LibraryMenu.getGenres().contains(genre))
			return false;
		for (Media media : mediaList) {
			if (media.getGenre() == genre)
				System.out.println(media.toString());
		}
		return true;
	}

	// This method can find both mostly borrowed dvd and book, by two parameters
	// First is an ArrayList of media, second is media type
	public boolean findMostlyBorrowedMedia(ArrayList<Media> mediaList, String mediaType) {
		if (mediaType.toLowerCase() != "book" || mediaType.toLowerCase() != "dvd" || mediaList.isEmpty())
			return false;
		int maxTimesBorrowed = 0, maxTimesBorrowedIndex = 0, currentIndex = 0;

		for (Media media : mediaList) {
			if (media.getType() == mediaType) {
				if (media.getTimesBorrowed() > maxTimesBorrowed) {
					maxTimesBorrowed = media.getTimesBorrowed();
					maxTimesBorrowedIndex = currentIndex;
				}
			}
			currentIndex++;
		}
		System.out.println("Most borrowed media is " + mediaList.get(maxTimesBorrowedIndex).toString());
		return true;
	}

	// Gets an ArrayList of Person class,prints people then returns the Person's
	// type listed.
	public boolean findPersonType(ArrayList<Person> people) {
		int personIndex;
		Scanner scanner = new Scanner(System.in);
		printPeople(people);
		System.out.println("Enter a person from list to find out the person is an author or a producer:");
		personIndex = scanner.nextInt();
		// Shown list starts with index 1 for people to visualize...
		if (personIndex + 1 > people.size() || personIndex < 1) {
			scanner.close();
			return false;
		}
		System.out.println(people.get(personIndex - 1).getType());
		scanner.close();
		return true;
	}

	// Helper method for printing people in people ArrayList
	private void printPeople(ArrayList<Person> people) {
		int index = 0;
		for (Person person : people) {
			System.out.println((index + 1) + person.toString());
			index++;
		}
	}

}
