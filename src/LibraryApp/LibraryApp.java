package LibraryApp;

import Library.LibraryMenu;
import Library.LibraryQuery;
import Library.Media;
import FileAccess.InputOutput;
import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author 293011036 - Baki Berke Baklan
 * 
 * */

public class LibraryApp {
	public static void main(String[] args) {
		LibraryQuery libraryQuery = new LibraryQuery();
		ArrayList<Media> mediaList = new InputOutput().getMedia();
		Scanner scanner = null;
		while (true) {
			LibraryMenu.showLibraryMenu();
			scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				libraryQuery.searchByGenre(mediaList,"sci-fi");
				break;
			case 2:
				libraryQuery.findMostlyBorrowedMedia(mediaList, "book");
				break;
			case 3:
				libraryQuery.findMostlyBorrowedMedia(mediaList, "dvd");
				break;
			case 4:
				break;
			case 5:
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Wrong input");
			}
			scanner.close();
		}
	}
}
