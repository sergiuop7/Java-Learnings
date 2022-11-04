package Lab5;

import java.util.Random;

abstract class Sensor
{
	private String location;
	abstract int readValue();
	String getLocation()
	{
		return location;
	}
}
class TemperatureSensor extends Sensor
{

	@Override
	int readValue() 
	{
		Random r = new Random();
		int a = r.nextInt(100);
		return a;
	
	}
	
}