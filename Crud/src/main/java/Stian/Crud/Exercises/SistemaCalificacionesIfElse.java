package Stian.Crud.Exercises;

public class SistemaCalificacionesIfElse {

    static void main() {
        var grade = 9;

        if(grade  >= 9 && grade <=  10){
            System.out.println("A");
        }else if(grade >= 8 && grade < 9){
            System.out.println("B");
        }else if (grade  >= 7 && grade < 8){
            System.out.println("C");
        }else if(grade  >= 6 && grade < 9 ){
            System.out.println("D");
        }else if(grade  >= 0 && grade < 6){
            System.out.println("F");
        }else{
            System.out.println("Unknow Value!");
        }
    }
}
