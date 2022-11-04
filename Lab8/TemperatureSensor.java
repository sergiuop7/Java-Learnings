package Lab8;

public class TemperatureSensor {

    int presetValue = 0;

    public TemperatureSensor(int presetValue) { 
    	this.presetValue = presetValue; 
    }

    public void activate() { 
    	System.out.println("Temperature sensor ON"); 
    }
}
