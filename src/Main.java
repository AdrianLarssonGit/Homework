
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        
          List<Clubmember> Clubmembers = new ArrayList<Clubmember>();
    Clubmembers.add(new Clubmember("mikael", 182));
    Clubmembers.add(new Clubmember("matti", 187));
    Clubmembers.add(new Clubmember("joel", 184));

    System.out.println(Clubmembers);
    Collections.sort(Clubmembers);
    System.out.println(Clubmembers);
     

    }
}