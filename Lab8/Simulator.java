package Lab8;
import java.util.ArrayList;
public class Simulator {

    /**
     */
    public static void main(String[] args) {

        // build station Cluj-Napoca
        Controller c1 = new Controller("Cluj-Napoca");

        var s1 = new Segment(1);
        var s2 = new Segment(2);
        var s3 = new Segment(3);

        c1.addControlledSegment(s1);
        c1.addControlledSegment(s2);
        c1.addControlledSegment(s3);

        //  build station Bucuresti
        var c2 = new Controller("Bucuresti");

        var s4 = new Segment(4);
        var s5 = new Segment(5);
        var s6 = new Segment(6);

        c2.addControlledSegment(s4);
        c2.addControlledSegment(s5);
        c2.addControlledSegment(s6);

        // Build station Iasi
        var c3 = new Controller("Iasi");

        var s7 = new Segment(7);
        var s8 = new Segment(8);

        c3.addControlledSegment(s7);
        c3.addControlledSegment(s8);

        // connect the 2 controllers

        c1.addNeighbourController(c2);
        c2.addNeighbourController(c1);
        c1.addNeighbourController(c3);
        c3.addNeighbourController(c1);
        c2.addNeighbourController(c3);
        c3.addNeighbourController(c2);

        //testing

        var t1 = new Train("Bucuresti", "IC-001");
        s1.arriveTrain(t1);

        var t2 = new Train("Cluj-Napoca","R-002");
        s5.arriveTrain(t2);

        var t3 = new Train("Bucuresti","IR-243");
        s7.arriveTrain(t3);


        c1.displayStationState();
        c2.displayStationState();
        c3.displayStationState();

        System.out.println("\nStart train control\n");

        //execute 3 times controller steps
        for(int i = 0; i < 3; i++){
            System.out.println("### Step " + i + "  ###");
            c1.controlStep();
            c2.controlStep();
            c3.controlStep();

            System.out.println();

            c1.displayStationState();
            c2.displayStationState();
            c3.displayStationState();
        }
    }

}

class Controller {

    String stationName;

    ArrayList<Controller> neighbours = new ArrayList<>();

    //storing station train track segments
    ArrayList<Segment> list = new ArrayList<>();

    public Controller(String station) {
        stationName = station;
    }

    void addNeighbourController(Controller neighbour) {
        this.neighbours.add(neighbour);
    }

    void addControlledSegment(Segment segment) {
        list.add(segment);
    }

    /**
     * Check controlled segments and return the id of the first free segment or -1 in case there is no free segment in this station
     */
    int getFreeSegmentId(){
        for(Segment segment : list){
            if(!segment.hasTrain())
                return segment.id;
        }
        return -1;
    }

    void controlStep(){
        //check which train must be sent

        for(Segment segment : list){
            if(segment.hasTrain()){
                Train t = segment.getTrain();

                for (Controller controller : neighbours) {
                    if(t.getDestination().equals(controller.stationName)){
                        //check if there is a free segment
                        int id = controller.getFreeSegmentId();
                        if(id == -1){
                            System.out.println("Trenul +" + t.name + "din gara " + stationName + " nu poate fi trimis catre " + controller.stationName + ". Nici un segment disponibil!");
                            return;
                        }
                        //send train
                        System.out.println("Trenul " + t.name + " pleaca din gara " + stationName + " spre gara " + controller.stationName);
                        segment.departTRain();
                        controller.arriveTrain(t,id);
                    }
                }

            }
        }//.for

    }//.


    public void arriveTrain(Train t, int idSegment){
        for(Segment segment:list){
            //search id segment and add train on it
            if(segment.id == idSegment)
                if(segment.hasTrain()){
                    System.out.println("CRASH! Train "+t.name+" collided with "+segment.getTrain().name+" on segment "+segment.id+" in station "+stationName);
                    return;
                }else{
                    System.out.println("Train "+t.name+" arrived on segment "+segment.id+" in station "+stationName);
                    segment.arriveTrain(t);
                    return;
                }
        }

        //this should not happen
        System.out.println("Train "+t.name+" cannot be received "+stationName+". Check controller logic algorithm!");

    }


    public void displayStationState(){
        System.out.println("=== STATION "+stationName+" ===");
        for(Segment s:list){
            if(s.hasTrain())
                System.out.println("|----------ID="+s.id+"__Train="+s.getTrain().name+" to "+s.getTrain().destination+"__----------|");
            else
                System.out.println("|----------ID="+s.id+"__Train=______ catre ________----------|");
        }
    }
}


class Segment{
    int id;
    Train train;

    Segment(int id){
        this.id = id;
    }

    boolean hasTrain(){
        return train!=null;
    }

    Train departTRain() {
        Train tmp = train;
        this.train = null;
        return tmp;
    }

    void arriveTrain(Train t){
        train = t;
    }

    Train getTrain(){
        return train;
    }
}
class Train{
    String destination;
    String name;

    public Train(String destination, String nume) {
        super();
        this.destination = destination;
        this.name = nume;
    }

    String getDestination(){
        return destination;
    }

}
