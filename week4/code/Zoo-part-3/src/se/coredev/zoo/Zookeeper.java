package se.coredev.zoo;

import java.util.HashMap;
import java.util.Map;

import se.coredev.zoo.animal.Animal;

public final class Zookeeper implements ZooListener{

	private final Map<String, Animal> journal;
	
	public Zookeeper()
	{
		journal = new HashMap<>();
	}

	@Override
	public void animalAdded(Animal animal) 
	{
		System.out.println("Animal added: " + animal);
		journal.put(animal.getId(), animal);
	}
	
	
	
}
