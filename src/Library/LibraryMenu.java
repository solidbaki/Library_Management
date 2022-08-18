package Library;

import java.util.ArrayList;
import java.util.Arrays;

public class LibraryMenu {
	private static final ArrayList<String> MEDIA_TYPES = new ArrayList<String>(Arrays.asList("book", "dvd"));
	private static final ArrayList<String> GENRES=new ArrayList<String>(Arrays.asList("poem","sci-fi","horror","action","comedy",
	 "drama", "comic book", "novel","drama"));

	public static final void showLibraryMenu() {
		System.out.println("Library Menu");
		System.out.println("Press 1 to return all media of given genre");
		System.out.println("Press 2 to find mostly borrowed book");
		System.out.println("Press 3 to find mostly borrowed movie DVD");
		System.out.println("Press 4 to find whether a person is an author or a producer");
		System.out.println("Press 5 to exit");
	}

	public static ArrayList<String> getMediaTypes() {
		return MEDIA_TYPES;
	}

	public static ArrayList<String> getGenres() {
		return GENRES;
	}	
}
