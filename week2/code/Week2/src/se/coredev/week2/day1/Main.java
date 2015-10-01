package se.coredev.week2.day1;

public final class Main
{
	public static void main(String[] args)
	{
		Printable[] printables = new Printable[] { new User("1", "Master"), new Lion("1001", "Pablo") };
		
		for (Printable printable : printables) 
		{			
			printable.print();
		}

		// User user = new User("1", "master");
		// User user2 = new User("1", "master");
		// Lion lion = new Lion("1", "Pablo");

		// System.out.println("Equals:" + (user.equals(lion)));
		// System.out.println("HashCode:" + (user.hashCode() ==
		// lion.hashCode()));

		// System.out.println("Equals = " + (user1.equals(user2)));
		// System.out.println("user1 hashCode:" + user1.hashCode() + ", user2
		// hasCode:" + user2.hashCode());
	}
}
