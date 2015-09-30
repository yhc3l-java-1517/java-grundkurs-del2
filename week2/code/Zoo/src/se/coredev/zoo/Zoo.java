package se.coredev.zoo;

import java.util.Arrays;

import se.coredev.zoo.animal.Animal;

public final class Zoo
{
	private Animal[] animals;
	private int nextFreeIndex;
	
	public Zoo()
	{
		animals = new Animal[5];
		nextFreeIndex = 0;
	}
	
	public void addAnimal(Animal animal)
	{		
		if(nextFreeIndex >= animals.length)
		{
			animals = Arrays.copyOf(animals, animals.length + 5);
		}
		
		animals[nextFreeIndex] = animal;
		nextFreeIndex++;
	}

	public void hearAnimalSound()
	{
		for(Animal animal : animals)
		{
			if (animal == null)
			{
				break;
			}
			animal.sound();
		}
	}
}
