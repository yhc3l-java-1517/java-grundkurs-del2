package se.coredev.week2.recap.model;

public abstract class Operation
{
	public void execute()
	{
		System.out.println("security check...");
		doExecute();
	}
	
	protected abstract void doExecute();
}
