package se.coredev.zoo.animal;

public abstract class Animal
{
	private final String id;
	
	protected Animal(String id)
	{
		this.id = id;
	}
	
	public abstract void sound();
	
	public String getId()
	{
		return id;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if (other == this)
		{
			return true;
		}
		
		if (other instanceof Animal) 
		{
			final Animal otherAnimal = (Animal) other;
			
			return this.id.equals(otherAnimal.id) && this.getClass().equals(other.getClass());
		}
		
		return false;
	}
	
	@Override
	public String toString()
	{		
		return getClass().getName();
	}
}
