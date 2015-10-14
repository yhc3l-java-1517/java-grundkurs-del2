package se.recap;

public final class Main {
	
	public static void main(String[] args) {
		// 1) Set vs List vs Map - check!
		// 2) StringBuilder vs String - check!
		// 3) private, default, protected, public - check!
		// 4) subclassing  - check!
		// 5) (static vs non static) - check!
		// 6) == vs equals - check!
		
		User user1 = new User("user1", "password1");
		User user2 = new User("user2", "password2");
		
		System.out.println("NUMBER_OF_USERS_CREATED: " + User.NUMBER_OF_USERS_CREATED);
		System.out.println("numberOfUsersCreated: " + user2.numberOfUsersCreated);
		System.out.println("numberOfUsersCreated: " + user1.numberOfUsersCreated);
		System.out.println("numberOfUsersCreated: " + user1.NUMBER_OF_USERS_CREATED);
		
	}
	
}
