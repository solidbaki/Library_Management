package Library;

public class LibraryMember extends Person {
	private int timesMediaBorrowed;

	public LibraryMember() {
		super();
		timesMediaBorrowed = 0;
	}

	public LibraryMember(Person person) {
		super(person);
	}

	public LibraryMember(String fullName, String id, String type, boolean hasAccessToSystem, int timesMediaBorrowed) {
		super(fullName, id, type, true);
		this.timesMediaBorrowed = timesMediaBorrowed;
	}

	public int getTimesMediaBorrowed() {
		return timesMediaBorrowed;
	}

	public void setTimesMediaBorrowed(int timesMediaBorrowed) {
		this.timesMediaBorrowed = timesMediaBorrowed;
	}

	@Override
	public String toString() {
		return super.toString() + "\nis a library member and borrowed media " + timesMediaBorrowed + " times.";
	}
}
