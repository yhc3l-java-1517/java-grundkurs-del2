package se.coredev.zoo;

import se.coredev.zoo.animal.Animal;
import se.coredev.zoo.animal.DomesticAnimal;
import se.coredev.zoo.animal.WildAnimal;

public final class Zoo
{
	private final AnimalStorage wildAnimals;
	private final AnimalStorage domesticAnimals;

	public Zoo(boolean disallowDangerousAnimals)
	{
		wildAnimals = new AnimalStorage(disallowDangerousAnimals);
		domesticAnimals = new AnimalStorage(disallowDangerousAnimals);
	}

	public void addAnimal(final Animal animal)
	{
		if (animal instanceof WildAnimal)
		{
			wildAnimals.addAnimal(animal);
		}
		if (animal instanceof DomesticAnimal)
		{
			domesticAnimals.addAnimal(animal);
		}
	}

	public void hearAnimalSound()
	{
		hearAnimalSound(wildAnimals.getAnimals());
		hearAnimalSound(domesticAnimals.getAnimals());
	}

	private void hearAnimalSound(final Animal[] animals)
	{
		for (Animal animal : animals)
		{
			if (animal == null)
			{
				break;
			}
			animal.sound();
		}
	}
}
