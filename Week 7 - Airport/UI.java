

import java.util.Scanner;


/**
 *
 * @author adrian
 */
public class UI {

    Scanner scanner = new Scanner(System.in);
    private Airport airport = new Airport();

    public void adding() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");

        while (true) {

            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");
            String string = scanner.nextLine();

            if (string.equals("1")) {
                addPlane();
            } else if (string.equals("2")) {
                addFlight();
            } else if (string.equals("x")) {
                System.out.println("");
                service();
                break;
            } else {
                System.out.println("Unknown command.");
            }

        }

    }

    public void addPlane() {
        System.out.print("Give plane ID: ");
        String id = scanner.nextLine();
        System.out.print("Give plane capacity: ");
        int cap = Integer.parseInt(scanner.nextLine());

        Plane plane = new Plane(id, cap);
        airport.addPlane(plane);

    }

    public void addFlight() {

        System.out.println("");

        System.out.print("Give plane ID: ");
        String plane = scanner.nextLine();

        System.out.print("Give departure airport code: ");
        String departure = scanner.nextLine();
        System.out.print("Give destination airport code: ");
        String destination = scanner.nextLine();

        Flights flight = new Flights(plane, departure, destination);

        airport.addFlight(flight);

    }

    public void service() {
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");

        while (true) {
            System.out.print("> ");
            String string = scanner.nextLine();
            if (string.equals("x")) 
            {
                break;
            } 
            else if (string.equals("1")) 
            {
                airport.printPlanes();
            } 
            else if (string.equals("2")) 
            {
            airport.printFlights();
            } 
            else if (string.equals("3")) 
            {
                System.out.print("Give plane ID: ");
                String plane = scanner.nextLine();
                airport.printPlaneInfo(plane);
            }

    }

}

}
