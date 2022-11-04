package Lab5;

import java.util.Random;

class LightSensor extends Sensor
{

	@Override
	int readValue() 
	{
		Random r = new Random();
		int a = r.nextInt(100);
		return a;
	
	}
	
}
