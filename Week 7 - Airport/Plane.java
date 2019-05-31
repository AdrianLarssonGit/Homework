
/**
 *
 * @author adrian
 */
public class Plane {

    private String id = "";
    private int capacity;

    public Plane(String string, int capacity) {
        this.id = string;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getName() {
        return this.id;
    }

    @Override
    public String toString() {
        return this.id + " " + "(" + this.capacity + " ppl)";
    }

}
