package se.coredev.oop.exceptions.model;

public final class Teacher
{
	private final String firstName;
	private final String lastName;
	private final String teacherId;

	public Teacher(String firstName, String lastName, String teacherId)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.teacherId = teacherId;
	}

	public String getTeacherId()
	{
		return teacherId;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}
}
