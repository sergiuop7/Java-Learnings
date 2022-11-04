package Lab8;

class FireEvent extends Event {
	 
    private boolean smoke;
 
    FireEvent(boolean smoke) {
        super(EventType.FIRE);
        this.smoke = smoke;
    }
 
    boolean isSmoke() {
        return smoke;
    }
 
    @Override
    public String toString() {
        return "FireEvent{" + "smoke=" + smoke + '}';
    }
 
}