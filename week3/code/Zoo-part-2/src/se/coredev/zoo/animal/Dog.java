package se.coredev.zoo.animal;

public final class Dog extends DomesticAnimal
{
	public Dog(String id)
	{
		super(id);
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
