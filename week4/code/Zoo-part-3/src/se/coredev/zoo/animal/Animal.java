package se.coredev.zoo.animal;

public abstract class Animal
{
	private final String id;
	private final String name;
	
	protected Animal(String id, String name)
	{
		if(id == null) 
		{
			throw new IllegalArgumentException("Id must not be null");
		}
		this.id = id;
		this.name = name;
	}
	
	public abstract void sound();
	
	public String getId()
	{
		return id;
	}
	
	public String getName() 
	{
		return name;
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
			
			return id.equals(otherAnimal.id) && name.equals(otherAnimal.name) && 
				   getClass().equals(other.getClass());
		}
		
		return false;
	}
	
	@Override
	public int hashCode() 
	{
		int result = 1;
		result += 37 * id.hashCode();
		result += 37 * name.hashCode();
		result += getClass().hashCode();
		
		return result;
	}
	
	@Override
	public String toString()
	{		
		return getClass().getName();
	}
}
