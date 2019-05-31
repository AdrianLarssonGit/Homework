
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author adrian
 */
public class Flights {

    private String string;
    private String id = "";

    public Flights() {

    }

    public Flights(String id, String deparute, String arrival) {
        this.id = id;
        this.string = "(" + deparute + "-" + arrival + ")";
    }

    public void addFlight(String id, String deparute, String arrival) {
        this.id = id;
        this.string = "(" + deparute + "-" + arrival + ")";

    }

    public String getID() {
        return this.id;
    }

    @Override
    public String toString() {
        return this.string;
    }

}
