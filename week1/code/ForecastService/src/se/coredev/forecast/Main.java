package se.coredev.forecast;

import se.coredev.forecast.data.Forecast;
import se.coredev.forecast.data.Location;
import se.coredev.forecast.service.ForecastService;

public final class Main
{
	public static void main(String[] args)
	{
		 	double latitude = 59.33016;
		 	double longitude = 18.05905;
		 	String placeName = "Stockholm";
 			
		 	Location location = new Location(placeName, latitude, longitude);

 			ForecastService forecastService = new ForecastService();
 			
 			Forecast forecast = forecastService.getForecastForToday(location); 		
 			
 			System.out.println("Min temperature: " + forecast.getMinTemperature());
 			System.out.println("Max temperature: " + forecast.getMaxTemperature());
	}
}
