package se.coredev.zoo.animal;

public final class Dog extends DomesticAnimal
{
	public Dog(String id, String name)
	{
		super(id, name);
	}
	
	@Override
	public void sound()
	{
		System.out.println("Woff!");
	}
	
	@Override
	public String toString()
	{
		return "Dog";
	}

}
