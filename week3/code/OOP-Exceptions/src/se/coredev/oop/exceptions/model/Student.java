package se.coredev.oop.exceptions.model;

public final class Student
{
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNo;

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param socialSecurityNo
	 * 
	 * @throws IllegalArgumentException
	 *             - if social security number is ....
	 */
	public Student(String firstName, String lastName, String socialSecurityNo)
	{
		if (socialSecurityNo != null && (socialSecurityNo.length() != 10 || socialSecurityNo.length() != 12))
		{
			this.socialSecurityNo = socialSecurityNo;
			this.firstName = firstName;
			this.lastName = lastName;
		}
		else
		{
			throw new IllegalArgumentException("Invalid social security number (must be 10 or 12): " + socialSecurityNo);
		}
	}

	public String getSocialSecurityNo()
	{
		return socialSecurityNo;
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
