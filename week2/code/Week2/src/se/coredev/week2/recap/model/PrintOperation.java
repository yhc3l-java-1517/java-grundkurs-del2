package se.coredev.week2.recap.model;

public final class PrintOperation extends Operation
{

	@Override
	protected void doExecute()
	{
		System.out.println("printing...");
	}

}
