package Library;

public class MovieDVD extends Media implements IBorrowable {
	private Producer producer;
	private int movieDurationInMinutes;
	private String movieStudio;
	private String type;
	
	public MovieDVD(int timesBorrowed, boolean currentlyBorrowed, String title, String genre, Person person,
			Producer producer, int movieDurationInMinutes, String movieStudio, String type) {
		super(timesBorrowed, currentlyBorrowed, title, genre, person);
		this.producer = producer;
		this.movieDurationInMinutes = movieDurationInMinutes;
		this.movieStudio = movieStudio;
		this.type = type;
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
		return producer.toString();
	}

	@Override
	public String getType() {
		return "dvd";
	}

	// Getter setters
	public int getMovieDurationInMinutes() {
		return movieDurationInMinutes;
	}

	public void setMovieDurationInMinutes(int movieDurationInMinutes) {
		this.movieDurationInMinutes = movieDurationInMinutes;
	}

	public String getMovieStudio() {
		return movieStudio;
	}

	public void setMovieStudio(String movieStudio) {
		this.movieStudio = movieStudio;
	}

	@Override
	public String toString() {
		return "Movie " + super.toString() + "\nis from studio " + movieStudio + "\nand takes " + movieDurationInMinutes
				+ " minutes.";
	}

	@Override
	public boolean equals(Object otherObject) {
		if (otherObject == null)
			return false;
		else if (getClass() != otherObject.getClass())
			return false;
		else {
			MovieDVD otherDVD = (MovieDVD) otherObject;
			return (movieDurationInMinutes == otherDVD.getMovieDurationInMinutes()
					&& movieStudio.equals(otherDVD.getMovieStudio()) && super.getTitle().equals(otherDVD.getTitle())
					&& super.getGenre().equals(otherDVD.getGenre()));
		}
	}

}
