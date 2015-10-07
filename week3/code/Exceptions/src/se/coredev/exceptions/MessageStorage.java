package se.coredev.exceptions;

public final class MessageStorage
{
	private final String[] messages;
	private int index;

	public MessageStorage(int capacity)
	{
		messages = new String[capacity];
	}

	public void addMessage(String message) throws MessageStorageException
	{
		if (index == messages.length)
		{
			throw new MessageStorageException("Could not store message: " + message);
		}
		messages[index++] = message;
	}

	public void printMessages()
	{
		for (String message : messages)
		{
			System.out.println(message);
		}
	}
}
