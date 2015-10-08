package se.coredev.zoo;

import se.coredev.zoo.animal.Cat;
import se.coredev.zoo.animal.Dog;
import se.coredev.zoo.animal.Lion;
import se.coredev.zoo.animal.Spider;

public final class Main
{
	public static void main(String[] args)
	{
		Zoo zoo = new Zoo();
		
		zoo.addAnimal(new Cat("1"));
		zoo.addAnimal(new Cat("2"));
		zoo.addAnimal(new Cat("3"));
		zoo.addAnimal(new Cat("4"));
		zoo.addAnimal(new Cat("5"));
		zoo.addAnimal(new Cat("6"));
		zoo.addAnimal(new Dog("3"));
		zoo.addAnimal(new Lion("3"));
		zoo.addAnimal(new Lion("3")); // Duplicate, should not be stored
		zoo.addAnimal(new Lion("4"));
		zoo.addAnimal(new Spider("10"));
		
		zoo.hearAnimalSound();		
	}
}
