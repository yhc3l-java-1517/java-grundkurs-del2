package se.recap.subclassing;

public final class Lion extends AbstractAnimal {

	public Lion(String id) {
		super(id);
	}

	@Override
	public String getSound() {
		return "Grrr.....";
	}

	public int getRunningSpeed() {
		return 80;
	}
	
	@Override
	public String getColor() {
		return "Black";
	}

}
