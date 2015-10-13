package se.coredev.zoo;

import java.util.HashSet;
import java.util.Set;

import se.coredev.zoo.animal.Animal;
import se.coredev.zoo.animal.Dangerous;

public final class AnimalStorage
{
	private final boolean disallowDangerousAnimals;
	private final Set<Animal> animals;
	
	public AnimalStorage(boolean disallowDangerousAnimals)
	{
		this.disallowDangerousAnimals = disallowDangerousAnimals;
		this.animals = new HashSet<>();
	}

	public void addAnimal(final Animal animal) throws StorageException
	{
		if (animal.getName() == null || animal.getName().trim().length() == 0)
		{
			throw new IllegalArgumentException("Animal without a name...");
		}
		
		if (disallowDangerousAnimals && animal instanceof Dangerous) 
		{
			throw new StorageException("This storage does not allow dangerous animals");			
		} 
		
		if (!animals.add(animal))
		{
			throw new StorageException("Animal already in storage");			
		} 
	}
	
	public Set<Animal> getAnimals()
	{
		// Returns a copy to prevent outside manipulation of internal data
		return new HashSet<>(animals);
	}
}