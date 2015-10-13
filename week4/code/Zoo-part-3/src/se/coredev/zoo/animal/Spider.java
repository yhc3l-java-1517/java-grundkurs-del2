package se.coredev.zoo.animal;

public final class Spider extends WildAnimal implements Dangerous
{
	public Spider(String id, String name)
	{
		super(id, name);
	}

	@Override
	public void sound()
	{
		System.out.println("Zzzzz...s...s.");
	}

	@Override
	public String toString()
	{
		return "Snake";
	}

}
