package Stian.Crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;


@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.println("** Recetas de Cocina **");

        System.out.print("Ingresa el nombre de la receta: ");
        var Name = consola.nextLine();

        System.out.print("Ingresa los ingredientes: ");
        var Ingredientes = consola.nextLine();

        System.out.print("Ingresa el tiempo de preparación (Min): ");
        var Time = consola.nextInt();

        System.out.print("Ingresa la dificultad: ");
        var Dificultad = consola.nextLine();


        System.out.println("-- Receta de cocina --");
        System.out.println("Nombre de la receta: " + Name);
        System.out.println("Ingredientes: " + Ingredientes);
        System.out.println("Tiempo de preparacion: " + Time);
        System.out.println("Dificultad: " + Dificultad);


		//SpringApplication.run(CrudApplication.class, args);
	}

}
