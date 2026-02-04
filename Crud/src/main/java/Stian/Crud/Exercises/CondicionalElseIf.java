package Stian.Crud.Exercises;

public class CondicionalElseIf {
    static void main() {
        var age = 1;

        if (age >= 18){
            System.out.println("You are adult");
        }else if (age >= 13 && age < 18){
            System.out.println("You are a child");
        }else{
            System.out.println("You are a kid");
        }
}
}
