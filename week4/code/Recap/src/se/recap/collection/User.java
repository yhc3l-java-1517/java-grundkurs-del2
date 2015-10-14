package se.recap.collection;

public final class User {

	private final String username;
	private final String password;
	
	public User(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}	
	
	@Override
	public int hashCode() {
		int result = 1;
		result += 37 * username.hashCode();
		result += 37 * password.hashCode();
		return result;
	}
	
	@Override
	public boolean equals(Object other) {
		
		if(other == this){ return true; }
		
		if(other instanceof User){
			User otherUser = (User) other;
			return username.equals(otherUser.username) && password.equals(otherUser.password);
		}
		
		return false;
	}
}












