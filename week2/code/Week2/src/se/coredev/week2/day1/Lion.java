package se.coredev.week2.day1;

public final class Lion implements Printable
{
	private final String id;
	private final String name;

	public Lion(String id, String name)
	{
		this.id = id;
		this.name = name;		
	}

	public String getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	@Override
	public void print()
	{
		System.out.println("Grrr...");
	}

	@Override
	public int hashCode()
	{
		return id.hashCode();
	}

	@Override
	public boolean equals(Object other)
	{
		if (this == other)
		{
			return true;
		}

		if (other instanceof Lion)
		{
			Lion otherLion = (Lion) other;
			return this.id.equals(otherLion.id);
		}

		return false;
	}

}
