package Lab5;

class Controller
{
	 TemperatureSensor t;
	 LightSensor l;
	 Controller(TemperatureSensor t,LightSensor l)
	 {
		 this.t=t;
		 this.l=l;
	 }
	 public void control()
	 {
		 int i=0;
		 for (i=0;i<20;i++)
			{try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			 System.out.println("Temperature from T sensor is "+ t.readValue());
		 	System.out.println("Temperature from L sensor is "+ l.readValue());
			}
	 }
}

