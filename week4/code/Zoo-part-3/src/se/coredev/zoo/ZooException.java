package se.coredev.zoo;

public final class ZooException extends Exception 
{
	public ZooException(Throwable throwable)
	{
		super(throwable);
	}
	
	public ZooException(String message) 
	{
		super(message);
	}
	
}
