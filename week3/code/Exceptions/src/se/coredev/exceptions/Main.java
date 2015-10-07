package se.coredev.exceptions;

public final class Main
{
	public static void main(String[] args)
	{
		MessageStorage storage = new MessageStorage(3);
		try
		{
			storage.addMessage("Hello");
			storage.addMessage("World");
			storage.addMessage("!");
			storage.addMessage("Good...");
			
			storage.printMessages();
		}
		catch (MessageStorageException e)
		{
			System.err.println(e.getMessage());
		}
	}

	private static void testUncheckedException()
	{
		throw new RuntimeException("Hej");
	}

	private static void testCheckedException() throws Exception
	{
		throw new Exception("Ooops!");
	}
}
