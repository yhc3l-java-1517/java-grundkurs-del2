package se.coredev.oop.exceptions.model;

public final class CourseException extends Exception
{
	private final Student student;

	public CourseException(Student student)
	{
		this.student = student;
	}

	public Student getStudent()
	{
		return student;
	}

}
