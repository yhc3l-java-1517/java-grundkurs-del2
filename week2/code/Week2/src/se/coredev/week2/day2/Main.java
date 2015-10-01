package se.coredev.week2.day2;

public final class Main
{
	public static void main(String[] args)
	{
//		String username = new String("master");
//		String password = "secret";
//		
//		boolean success = login(username, password);
//		System.out.println("Login success: " + success);
		
//		String value = "hello";
//		value.toUpperCase();
//		
//		System.out.println(value);
		
		StringBuilder builder = new StringBuilder("hello");
		builder.reverse();
		
		System.out.println(builder.toString());
		
	}
	
	public static boolean login(String username, String password)
	{		
//		return "master" == username.intern() && "secret" == password.intern();
		return "master".equals(username) && "secret".equals(password);
	}
}
