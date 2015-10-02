package se.coredev.week2.recap;

import se.coredev.week2.recap.model.Operation;
import se.coredev.week2.recap.model.PrintOperation;
import se.coredev.week2.recap.model.User;

public final class Main
{
	public static void main(String[] args)
	{
//		User user = User.with("id", "username")
//						.email("email")
//						.firstname("firstname")
//						.lastname("lastname")
//						.create();
		
		Operation operation = new PrintOperation();
		operation.execute();
	}
}
