package Lab8;

abstract class Event {
    EventType type;
    public int tmp;

    Event(EventType type) {
        this.type = type;
    }

    Event(EventType type, int tmp) {
        this.type = type;
        this.tmp = tmp;
    }

    EventType getType() {
        return type;
    }
}