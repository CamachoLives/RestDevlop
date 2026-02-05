package Stian.Crud.Exercises;

import java.util.Scanner;

public class CondicionalElseIf {
    static void main() {
//      Reto tienda en linea
        var Consola = new Scanner(System.in);
        System.out.println(" ** Tienda en linea ** ");
        
        System.out.println("Cual es el valor de la compra ?");
        var value = Consola.nextInt();

        System.out.println("Es miembro de la tienda ?");
        var member = Consola.nextBoolean();
        
        if(value >= 1000 && member){
            var Result = value - (value * 0.1);
            System.out.println("Ha recibido el 10% de descuento por compra mayor a 1000 y por ser miembro, \n Valor total --> " + Result);
        } else if (member) {
            var Result = value - (value * 0.05);
            System.out.println("Ha recibido el 5% de descuento por ser miembro, \n Valor total --> " + Result);
        } else  {
            System.out.println("No ha recibido nada de descuento porque no hizo compra mayor a 1000$ ni es miembro" + value);
        }


    }
}
