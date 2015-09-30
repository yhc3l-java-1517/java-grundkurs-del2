package se.coredev.zoo;

import se.coredev.zoo.animal.Cat;
import se.coredev.zoo.animal.Dog;
import se.coredev.zoo.animal.Lion;

public final class Main
{
	public static void main(String[] args)
	{
		Zoo zoo = new Zoo();
		
		zoo.addAnimal(new Cat());
		zoo.addAnimal(new Dog());
		zoo.addAnimal(new Lion());
		zoo.addAnimal(new Lion());
		zoo.addAnimal(new Lion());
		zoo.addAnimal(new Lion());
		
		zoo.hearAnimalSound();		
	}
}
