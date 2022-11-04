package Lab8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ControlUnit {
    private PrintWriter logWriter = new PrintWriter("system_logs.txt");

    private AlarmUnit alarm = new AlarmUnit();
    private HeatingUnit heatingUnit = new HeatingUnit();
    private CoolingUnit coolingUnit = new CoolingUnit();
    private GsmUnit gsmUnit = new GsmUnit();

    private static int instances = 0;
    private ControlUnit() throws FileNotFoundException {instances++;}
    public static ControlUnit Instantiate() throws FileNotFoundException {
        if ( instances < 1)
            return new ControlUnit();
        else return null;
    }

    public void startAlarm()
    {
        alarm.activate();
        logWriter.println("Alarm ON");
    }

    public void callOwner()
    {
        gsmUnit.callOwner();
        logWriter.println("Owner ON");
    }

    public void startHeater()
    {
        heatingUnit.activate();
        logWriter.println("Heating Unit ON");
    }

    public void startCooler()
    {
        coolingUnit.activate();
        logWriter.println("Cooling Unit ON");
    }
}