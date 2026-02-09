package Stian.Crud.Exercises;

import java.util.Scanner;

public class SistemaEnviosIfElse {
    static void main() {
        var Consola = new Scanner(System.in);

        System.out.println("** Systems Shipments **");
        System.out.println("Enter destination of package, ( National / International )");
        var destination = Consola.nextLine();
        System.out.println("Enter package's weight");
        var weight = Consola.nextDouble();

        Double total = switch(destination){
            case "national" -> weight * 10.0;
            case "international" -> weight * 20.0;
            default -> {
                System.out.println("Unknow");
                yield null;
            }
        };

        System.out.println("Value of shipment --> " + total);

    }
}
