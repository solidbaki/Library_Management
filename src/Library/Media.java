package Library;

public abstract class Media {
	private int timesBorrowed;
	private boolean currentlyBorrowed;
	private String title;
	private String genre;
	private Person person; // Person is creator

	public abstract String getCreator();
	public abstract String getType();

	// 3 constructor implementations for abstract type Media
	public Media(int timesBorrowed, boolean currentlyBorrowed, String title, String genre, Person person) {
		this.timesBorrowed = timesBorrowed;
		this.currentlyBorrowed = currentlyBorrowed;
		this.title = title;
		this.genre = genre;
		this.person = person;
	}

	public Media(Media media) {
		this.timesBorrowed = media.timesBorrowed;
		this.currentlyBorrowed = media.currentlyBorrowed;
		this.title = media.title;
		this.genre = media.genre;
		this.person = media.person;
	}

	public Media() {
		this.timesBorrowed = 0;
		this.currentlyBorrowed = false;
		this.title = "Untitled";
		this.genre = "Default";
		this.person = new Person();
	}

	public int getTimesBorrowed() {
		return timesBorrowed;
	}

	public void setTimesBorrowed(int timesBorrowed) {
		this.timesBorrowed = timesBorrowed;
	}

	public boolean isCurrentlyBorrowed() {
		return currentlyBorrowed;
	}

	public void setCurrentlyBorrowed(boolean currentlyBorrowed) {
		this.currentlyBorrowed = currentlyBorrowed;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Title: " + title + "\nGenre: " + title + "\nis currently borrowed: " + currentlyBorrowed + "\nBorrowed "
				+ timesBorrowed + " times.";
	}
}
