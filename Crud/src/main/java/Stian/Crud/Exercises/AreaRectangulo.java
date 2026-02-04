package Stian.Crud.Exercises;

import java.util.Scanner;

public class AreaRectangulo {
    static void main() {
//        Vamos a sacar el area y perimetro de un rectangulo
        var Consola = new Scanner(System.in);

        System.out.println("** Calculo Área y Perímetro de un rectangulo **");
        System.out.println("eliige que quieres calcular primero");
        System.out.println("1. area");
        System.out.println("2. perimetro");
        var desicion = Consola.nextLine();

        if (desicion.equalsIgnoreCase("1")) {
            System.out.println("** Vamos a calcular el area **");
            System.out.println("Registra la base");
            var base = Consola.nextFloat();

            System.out.println("Registra la altura");
            var altura = Consola.nextFloat();

//            Realizamos el calculo
            var Result = base * altura;

            System.out.println("Resultado Area --> " + Result );

        }else{
            System.out.println("** Vamos a calcular el perimetro **");
            System.out.println("Registra la base");
            var base = Consola.nextFloat();

            System.out.println("Registra la altura");
            var altura = Consola.nextFloat();

            var Result = 2 * (base + altura);

            System.out.println("Resultado Perimetro --> " + Result );
        }
    }
}
