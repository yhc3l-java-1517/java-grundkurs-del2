package se.coredev.zoo.animal;

public final class Lion extends WildAnimal
{
	public Lion(String id, String name)
	{
		super(id, name);
	}

	@Override
	public void sound()
	{
		System.out.println("Grrr...");
	}

	@Override
	public String toString()
	{
		return "Lion";
	}
}
