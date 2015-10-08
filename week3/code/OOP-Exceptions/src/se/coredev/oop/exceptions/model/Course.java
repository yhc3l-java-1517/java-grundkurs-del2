package se.coredev.oop.exceptions.model;

public final class Course
{	
	private final String courseId;
	private final String courseDescription;
	private final Classroom classroom;
	private final Teacher teacher;
	private final Lecture[] lectures;
	private final Student[] students;
	private int nextFreeSeatIndex;

	public Course(String courseId, String courseDescription, Classroom classroom, Teacher teacher, Lecture[] lectures)
	{
		this.courseId = courseId;
		this.courseDescription = courseDescription;
		this.classroom = classroom;
		this.teacher = teacher;
		this.lectures = lectures;
		students = new Student[classroom.getNumberOfSeats()];
		this.nextFreeSeatIndex = 0;
	}
	
	public Course addStundet(final Student student) throws CourseException 
	{
		if(nextFreeSeatIndex == students.length)
		{
			throw new CourseException(student);
		}
		students[nextFreeSeatIndex++] = student;
		return this;
	}
	
}
