package se.recap.subclassing;

public final class Main {

	public static void main(String[] args) {

//		AbstractAnimal lion = new Lion("1001");
//		System.out.println(lion.getSound());
//		System.out.println("Running speed: " + ((Lion) lion).getRunningSpeed());
		
		AbstractAnimal animal = new Lion("1001");
		System.out.println("Color: " + animal.getColor());

	}
}


