package Library;

public class Book extends Media implements IBorrowable {
	private Author author;
	private String publisher;
	private int pages;
	private String type;

	public Book(int timesBorrowed, boolean currentlyBorrowed, String title, String genre, Author author,
			String publisher, int pages) {
		super(timesBorrowed, currentlyBorrowed, title, genre, author);
		this.publisher = publisher;
		this.pages = pages;
		this.type = "book";
	}

	@Override
	public boolean returnMedia() {
		super.setCurrentlyBorrowed(false);
		super.setTimesBorrowed(super.getTimesBorrowed() + 1);
		return true;
	}

	@Override
	public boolean borrowMedia() {
		// TODO Auto-generated method stub
		super.setCurrentlyBorrowed(true);
		return true;
	}

	@Override
	public String getCreator() {
		return author.toString();
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return type + " publisher: " + publisher + " with total number of pages " + pages + super.toString();
	}

}
