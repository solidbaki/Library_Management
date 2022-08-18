package Library;

// Person class will be the parent class for Author and Producer
// Not defined as a abstract class, because default constructor needs to be 
// initialized inside Media.java
public class Person {
	private String fullName;
	private String id;
	private String type;
	private boolean hasAccessToSystem;

	// Three different constructor implementations
	public Person(String fullName, String id, String type, boolean hasAccessToSystem) {
		this.fullName = fullName;
		this.id = id;
		this.type = type;
		this.hasAccessToSystem = hasAccessToSystem;
	}

	public Person(Person person) {
		this.fullName = person.fullName;
		this.id = person.id;
		this.type = person.type;
		this.hasAccessToSystem = person.hasAccessToSystem;
	}

	public Person() {
		this.fullName = "John Doe";
		this.id = "";
		this.type = "";
		this.hasAccessToSystem = false;
	}

	public boolean getPersonCanAccessToSystem() {
		return hasAccessToSystem;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return this.fullName + " with ID:" + this.id;

	}

	@Override
	public boolean equals(Object otherObject) {
		if (otherObject == null)
			return false;
		else if (getClass() != otherObject.getClass())
			return false;
		else {
			Person otherPerson = (Person) otherObject;
			return (fullName.equals(otherPerson.fullName) && id.equals(otherPerson.id));
		}
	}

}
