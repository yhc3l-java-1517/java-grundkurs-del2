package se.recap.subclassing;

public abstract class AbstractAnimal {

	private final String id;

	protected AbstractAnimal(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public abstract String getSound();

	public String getColor() {
		return "no color";
	}
}
