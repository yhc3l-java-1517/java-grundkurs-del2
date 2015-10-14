package se.recap.subclassing;

public final class Fish extends AbstractAnimal {

	protected Fish(String id) {
		super(id);
	}

	@Override
	public String getSound() {
		return "Blubb!";
	}

}
