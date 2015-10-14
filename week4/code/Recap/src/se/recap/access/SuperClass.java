package se.recap.access;

public class SuperClass {

	private String getPrivateMessage() {
		return "private message";
	}

	String getDefaultMessage() {
		return "default message";
	}

	protected String getProtectedMessage() {
		return "protected message";
	}

	public String getPublicMessage() {
		return "public message";
	}

}
