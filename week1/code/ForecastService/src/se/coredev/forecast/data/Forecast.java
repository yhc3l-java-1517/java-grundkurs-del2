package se.coredev.forecast.data;

public final class Forecast
{
	private final float maxTemperature;
	private final float minTemperature;
	private final float maxUVIndex;
	private final float minUVIndex;
	private final int chanceOfRain;
	private final int windSpeed;

	public Forecast(float maxTemperature, float minTemperature, float maxUVIndex, float minUVIndex,
	        int chanceOfRain, int windSpeed)
	{
		this.maxTemperature = maxTemperature;
		this.minTemperature = minTemperature;
		this.maxUVIndex = maxUVIndex;
		this.minUVIndex = minUVIndex;
		this.chanceOfRain = chanceOfRain;
		this.windSpeed = windSpeed;
	}

	public float getMaxTemperature()
	{
		return maxTemperature;
	}

	public float getMinTemperature()
	{
		return minTemperature;
	}

	public float getMaxUVIndex()
	{
		return maxUVIndex;
	}

	public float getMinUVIndex()
	{
		return minUVIndex;
	}

	public int getChanceOfRain()
	{
		return chanceOfRain;
	}

	public int getWindSpeed()
	{
		return windSpeed;
	}

}
