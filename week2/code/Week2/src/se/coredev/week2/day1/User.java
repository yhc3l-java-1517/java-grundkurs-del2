package se.coredev.week2.day1;

public final class User implements Printable
{
	private final String id;
	private final String username;

	public User(String id, String username)
	{
		this.id = id;
		this.username = username;
	}

	public String getId()
	{
		return id;
	}

	public String getUsername()
	{
		return username;
	}

	@Override
	public void print()
	{
		System.out.println("Hello!");
	}
	
	@Override
	public int hashCode()
	{
//		int result = 1;
//		result *= 37 * id.hashCode();
//		result *= 37 * username.hashCode();
		
//		return result;
		return id.hashCode();
	}
	
	@Override
	public boolean equals(Object other)
	{
		if (this == other)
		{
			return true;
		}
		
		if (other instanceof User)
		{
			User otherUser = (User) other;
			return this.id.equals(otherUser.id); //&& this.username.equals(otherUser.username);
		}

		return false;
	}
	
	
}
