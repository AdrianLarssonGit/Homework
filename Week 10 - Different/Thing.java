package boxes;

import sun.font.TrueTypeFont;

public class Thing extends Box{

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        if(weight < 0){
            throw new IllegalArgumentException();
        }
        else{
            this.name = name;
            this.weight = weight;
        }
        
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
   /* @Override
    public int hashCode(){
        return this.name.hashCode();
    }
    
    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object == null || getClass() != object.getClass()){
            return false;
        }
        
        Thing thing = (Thing) object;
        
        if(this.name.equals(thing.name)){
            return true;
        }
        return false;
    } */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Thing other = (Thing) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public void add(Thing thing) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
