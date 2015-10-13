package se.coredev.zoo;

import se.coredev.zoo.animal.Cat;

public final class Main
{
	public static void main(String[] args) throws ZooException
	{
		boolean disallowDangerousAnimals = true;
		Zookeeper zookeeper = new Zookeeper();
		
		Zoo zoo = new Zoo(disallowDangerousAnimals);
		zoo.addListener(zookeeper);

		zoo.addAnimal(new Cat("1", "Yoda"));
//		zoo.addAnimal(new Cat("2", "Luke"));
//		zoo.addAnimal(new Cat("3", "Leia"));
//		zoo.addAnimal(new Cat("4", "Darth"));
//		zoo.addAnimal(new Cat("5", "Anders"));
//		zoo.addAnimal(new Cat("6", "Pablo"));
//		zoo.addAnimal(new Dog("3", "Eduard"));
//		zoo.addAnimal(new Lion("3", "Anna")); 
//		zoo.addAnimal(new Lion("3", "Fredde")); // Duplicate, should not be stored
//		zoo.addAnimal(new Lion("4", "Alexandra"));
//		zoo.addAnimal(new Spider("10", "Melik"));
		
		zoo.hearAnimalSound();		
	}
}
