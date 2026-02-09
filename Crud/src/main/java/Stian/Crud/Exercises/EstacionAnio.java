package Stian.Crud.Exercises;

import java.util.Scanner;

public class EstacionAnio {

    static void main() {
//        Realizamos la validación del año dependiendo el mes en el que este se dara la estacion

        var Consola = new Scanner(System.in);
        System.out.println("Digite el numero del mes en el que esta para saber la estacion : ");
        var estacion = Consola.nextInt();

        if(estacion == 1 || estacion == 2 || estacion == 12) {
            System.out.println("Estamos en Invierno!");
        }else if (estacion == 3 || estacion == 4 || estacion == 5) {
            System.out.println("Estamos en Primavera!");
        } else if (estacion == 6 || estacion == 7 || estacion == 8) {
            System.out.println("Ëstamos en Verano!");
        } else if (estacion == 9 || estacion == 10 || estacion == 11) {
            System.out.println("Estamos en otoño!");
        }else {
            System.out.println("Estacion Desconocida!");
        }
    }
}
