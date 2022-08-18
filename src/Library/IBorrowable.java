package Library;

// Borrowable interface brings borrow and return functionalities for a media type
public interface IBorrowable {
	public abstract boolean borrowMedia();
	public abstract boolean returnMedia();
}
