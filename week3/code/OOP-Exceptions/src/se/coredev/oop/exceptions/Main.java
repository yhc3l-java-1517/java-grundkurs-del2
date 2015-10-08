package se.coredev.oop.exceptions;

import se.coredev.oop.exceptions.model.Classroom;
import se.coredev.oop.exceptions.model.Course;
import se.coredev.oop.exceptions.model.CourseException;
import se.coredev.oop.exceptions.model.Lecture;
import se.coredev.oop.exceptions.model.Student;
import se.coredev.oop.exceptions.model.Teacher;

public final class Main
{
	public static void main(String[] args)
	{
		Teacher master = new Teacher("Anders", "Carlsson", "1001");
		Classroom classroom = new Classroom("A-14", 5);
		Lecture[] lectures = new Lecture[1];
		lectures[0] = new Lecture("OOP", 6, "Java only");
		Course java = new Course("123", "Java programming", classroom, master, lectures);

		try
		{
			java.addStundet(new Student("firstName", "lastName", "1234567890"))
			    .addStundet(new Student("firstName", "lastName", "1234567890"))
			    .addStundet(new Student("firstName", "lastName", "1234567890"))
			    .addStundet(new Student("firstName", "lastName", "1234567890"))
			    .addStundet(new Student("firstName", "lastName", "1234567890"))
			    .addStundet(new Student("firstName", "lastName", "1234567890"));
		}
		catch (CourseException e)
		{
			Student problem = e.getStudent();
			System.out.println("Could not add student with ssn:" + problem.getSocialSecurityNo());
		}
	}
}
