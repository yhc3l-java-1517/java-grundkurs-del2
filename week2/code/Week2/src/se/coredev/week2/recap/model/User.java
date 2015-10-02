package se.coredev.week2.recap.model;

public final class User
{
	private final String id;
	private final String username;

	// Optional
	private final String prefix;
	private final String firstname;
	private final String lastname;
	private final String email;

	private User(String id, String username, String prefix, String firstname, String lastname, String email)
	{
		this.id = id;
		this.username = username;
		this.prefix = prefix;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}

	public static UserBuilder with(String id, String username)
	{
		return new UserBuilder(id, username);
	}

	public String getId()
	{
		return id;
	}

	public String getUsername()
	{
		return username;
	}

	public String getPrefix()
	{
		return prefix;
	}

	public String getFirstname()
	{
		return firstname;
	}

	public String getLastname()
	{
		return lastname;
	}

	public String getEmail()
	{
		return email;
	}

	public static final class UserBuilder
	{
		private final String id;
		private final String username;

		// Optional
		private String prefix;
		private String firstname;
		private String lastname;
		private String email;

		public UserBuilder(String id, String username)
		{
			this.id = id;
			this.username = username;
		}

		public User create()
		{
			return new User(id, username, prefix, firstname, lastname, email);
		}

		public UserBuilder prefix(String prefix)
		{
			this.prefix = prefix;
			return this;
		}

		public UserBuilder firstname(String firstname)
		{
			this.firstname = firstname;
			return this;
		}

		public UserBuilder lastname(String lastname)
		{
			this.lastname = lastname;
			return this;
		}

		public UserBuilder email(String email)
		{
			this.email = email;
			return this;
		}

	}

}
