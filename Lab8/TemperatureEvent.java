package Lab8;

class TemperatureEvent extends Event {
	 
    private int vlaue;
 
    TemperatureEvent(int vlaue) {
        super(EventType.FIRE.TEMPERATURE);
        this.vlaue = vlaue;
    }
 
    int getVlaue() {
        return vlaue;
    }
 
    @Override
    public String toString() {
        return "TemperatureEvent{" + "vlaue=" + vlaue + '}';
    }        
 
}