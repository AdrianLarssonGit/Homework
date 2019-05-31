
import java.util.ArrayList;

/**
 *
 * @author adrian
 */
public class Airport {

    private ArrayList<Plane> list = new ArrayList<Plane>();
    private ArrayList<Flights> flights = new ArrayList<Flights>();

    public void addPlane(Plane plane) {
        this.list.add(plane);

    }

    public void addFlight(Flights flight) {

        this.flights.add(flight);
    }
    
    public void printPlaneInfo(String plane){
               for (int i = 0; i < this.sendPlanes().size(); i++) {

                    if (this.sendPlanes().get(i).getName().equals(plane)) {
                        System.out.println(this.sendPlanes().get(i).getName() + " " + "(" + this.sendPlanes().get(i).getCapacity() + " ppl)");
                    }
                }
    }
    
    public void printFlights(){
       for (int i = 0; i < this.sendPlanes().size(); i++) {
                    String currentPlane = this.sendPlanes().get(i).getName();

                    for (int k = 0; k < this.sendFlights().size(); k++) {

                        if (this.sendFlights().get(k).getID().equals(currentPlane)) {
                            System.out.print(currentPlane);
                            System.out.print(" " + "(" + this.sendPlanes().get(i).getCapacity() + " ppl) ");
                            System.out.print(this.sendFlights().get(k).toString());
                            System.out.println("");
                        }

                    }

                } 
    }

    public ArrayList<Flights> sendFlights() {
        return this.flights;

    }

    public int checkIfPlaneExist(String string) {
        int retur = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(string)) {
                retur = 1;
                break;
            } else {
                retur = 0;
            }
        }
        return retur;
    }

    public void printPlanes() {
        for (Plane p : list) {
            System.out.println(p);
        }
    }

    public ArrayList<Plane> sendPlanes() {
        return this.list;
    }

    public int nrOfPlanes() {
        return list.size();
    }

}
