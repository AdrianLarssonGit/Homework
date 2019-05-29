
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        int[] array = {-3, 2, 3, 4, 7, 8, 12};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numbers in the array " + Arrays.toString(array));
        System.out.println();

        System.out.print("Enter searched number: ");
        String nr = scanner.nextLine();
        System.out.println();

        boolean tulos = BinarySearch.search(array, Integer.parseInt(nr));

        // Print here the result
        if(tulos == true){
            System.out.println("Value " + nr + " is in the array");
        }
         if(tulos == false){
            System.out.println("Value " + nr + " is not in the array");
        }
    }
}
