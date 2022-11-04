package Lab8;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HomeAutomation {

    public static void main(String[] args) throws FileNotFoundException {
        TemperatureSensor temperatureSensor = new TemperatureSensor(20);
        ArrayList<FireSensor> fireSensors = new ArrayList<>();
        ControlUnit controlUnit = ControlUnit.Instantiate();

        //test using an anonymous inner class
        Home h = new Home(){
            protected void setValueInEnvironment(Event event){
                System.out.println("New event in environment "+event);

                if(event.getType() == EventType.FIRE)
                {
                    for(FireSensor sensor : fireSensors) sensor.activate();
                    controlUnit.startAlarm();
                    controlUnit.callOwner();
                }

                if(event.getType() == EventType.TEMPERATURE)
                {
                    if(event.tmp < temperatureSensor.presetValue)
                        controlUnit.startHeater();
                    else if(event.tmp > temperatureSensor.presetValue)
                        controlUnit.startCooler();
                }
            }
            protected void controlStep(){
                System.out.println("Control step executed");
            }
        };
        h.simulate();
    }
}