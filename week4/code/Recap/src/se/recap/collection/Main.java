package se.recap.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		User user1 = new User("username", "password");
		User user2 = new User("username", "password");

		// Set
		Set<User> set = new HashSet<>();

		set.add(user1);
		set.add(user1);
		set.add(user2);

		System.out.println("Number of users in set: " + set.size());
		
		// List 
		List<User> list = new ArrayList<>();
		
		list.add(user1);
		list.add(user1);
		list.add(user2);
		
		System.out.println("Number of users in list: " + list.size());
		System.out.println("Value at index 1: " + list.get(1));
		
		// Map
		Map<String, User> map = new HashMap<>();
		map.put(user1.getUsername(), user1);
		map.put(user1.getUsername(), user1);
		map.put(user2.getUsername(), user2);
		
		System.out.println("Number of users in map: " + map.size());
	}

}







