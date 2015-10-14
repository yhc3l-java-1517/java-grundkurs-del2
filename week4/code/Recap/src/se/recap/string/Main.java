package se.recap.string;

public final class Main {

	public static void main(String[] args) {
		
		// String
		String message = "hello!";
		String copy = new String("hello!");
		
		System.out.println("== : " + (message == copy));
		System.out.println("eqauls : " + (message.equals(copy)));
		
		String upperCaseMessage = message.toUpperCase();
		
		System.out.println("Upper case message: " + upperCaseMessage);
		
		// StringBuilder || StringBuffer (synchronized)
		StringBuilder messageBuilder = new StringBuilder();
		messageBuilder.append("hello!");
		messageBuilder.reverse();
		
		String stringValue = messageBuilder.toString();
		
		System.out.println("StringBuilder string value: " + stringValue);
	}
	
	
	
}
