package se.coredev.week2.day1;

public final class Main
{
	public static void main(String[] args)
	{
		User user1 = new User("1", "master");
		User user2 = new User("1", "master");
		
		System.out.println("Equals = " + (user1.equals(user2)));
		System.out.println("user1 hashCode:" + user1.hashCode() + ", user2 hasCode:" + user2.hashCode());
	}
}
