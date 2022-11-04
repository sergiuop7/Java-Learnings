package Lab5;

public class Ex3 {
	public static void main(String[] args)
	{
		TemperatureSensor t=new TemperatureSensor();
		LightSensor l = new LightSensor();
		Controller controller = new Controller(t,l);
        controller.control();
	}
	
}