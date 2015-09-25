package se.coredev.forecast.service;

import se.coredev.forecast.data.Forecast;
import se.coredev.forecast.data.Location;

public final class ForecastService
{
	public Forecast getForecastForToday(Location location)
	{
		// send request to remote weather service and parse data to Forecast object
		if (location.getName().equalsIgnoreCase("stockholm"))
		{
			return new Forecast(15, 8, 3, 0, 10, 4);
		}

		return null;
	}

}
