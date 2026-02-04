package Stian.Crud.Exercises;

import java.util.Scanner;

public class ValidacionSimple {
    static void main() {
        var consola = new Scanner(System.in);
        System.out.println("** Simple Validation **");

        System.out.println("What is your name?");
        var name = consola.nextLine();

        System.out.println("What is your password?");
        var pass = consola.nextLine();

        final String nameoriginal = "Cris";
        final String passoriginal = "12345";

        boolean validation = name.trim().equalsIgnoreCase(nameoriginal.trim()) && pass.trim().equalsIgnoreCase(passoriginal.trim());

        System.out.println("The validation is --> " + validation);
    }
}
