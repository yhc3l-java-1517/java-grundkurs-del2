package se.coredev.zoo.animal;

public final class Cat extends DomesticAnimal
{
	public Cat(String id, String name)
	{
		super(id, name);
	}
	
	@Override
	public void sound()
	{
		System.out.println("Mjau!");
	}

	@Override
	public String toString()
	{
		return "Cat";
	}
}
