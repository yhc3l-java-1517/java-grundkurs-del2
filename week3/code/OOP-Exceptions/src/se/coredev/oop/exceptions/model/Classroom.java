package se.coredev.oop.exceptions.model;

public final class Classroom
{
	private final String classroomNumber;
	private final int numberOfSeats;

	public Classroom(String classroomNumber, int numberOfSeats)
	{
		this.classroomNumber = classroomNumber;
		this.numberOfSeats = numberOfSeats;
	}

	public String getClassroomNumber()
	{
		return classroomNumber;
	}

	public int getNumberOfSeats()
	{
		return numberOfSeats;
	}
}
