package se.recap.access;

import se.recap.access.sub.SubClass;

public final class Main {

	public static void main(String[] args) {
		
		SuperClass superClass = new SuperClass();
		SubClass subClass = new SubClass();
		
		System.out.println("Superclass default message: " + superClass.getDefaultMessage());
		System.out.println("Superclass protected message: " + superClass.getProtectedMessage());
		System.out.println("Superclass public message: " + superClass.getPublicMessage());

//		System.out.println("Subclass default message: " + subClass.getDefaultMessage());
		System.out.println("Subclass protected message: " + subClass.getProtectedMessage());
		System.out.println("Subclass public message: " + subClass.getPublicMessage());
	}

}
