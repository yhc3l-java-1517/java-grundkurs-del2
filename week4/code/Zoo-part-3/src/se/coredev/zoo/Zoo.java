package se.coredev.zoo;

import java.util.HashSet;
import java.util.Set;

import se.coredev.zoo.animal.Animal;
import se.coredev.zoo.animal.DomesticAnimal;
import se.coredev.zoo.animal.WildAnimal;

public final class Zoo
{
	private final AnimalStorage wildAnimals;
	private final AnimalStorage domesticAnimals;
	private final Set<ZooListener> listeners;

	public Zoo(boolean disallowDangerousAnimals)
	{
		wildAnimals = new AnimalStorage(disallowDangerousAnimals);
		domesticAnimals = new AnimalStorage(disallowDangerousAnimals);
		listeners = new HashSet<>();
	}

	public void addListener(ZooListener listener)
	{
		listeners.add(listener);
	}
	
	public void addAnimal(final Animal animal) throws ZooException
	{
		try 
		{
			if (animal instanceof WildAnimal)
			{
				wildAnimals.addAnimal(animal);
			}
			if (animal instanceof DomesticAnimal)
			{
				domesticAnimals.addAnimal(animal);
			}
			notifyListeners(animal);
			
		} catch (StorageException e)
		{
			throw new ZooException(e);
		}
	}

	private void notifyListeners(Animal animal) 
	{
		for(ZooListener listener : listeners)
		{
			listener.animalAdded(animal);
		}
	}

	public void hearAnimalSound()
	{
		hearAnimalSound(wildAnimals.getAnimals());
		hearAnimalSound(domesticAnimals.getAnimals());
	}

	private void hearAnimalSound(final Set<Animal> animals)
	{
		for (Animal animal : animals)
		{
			animal.sound();
		}
	}
}
