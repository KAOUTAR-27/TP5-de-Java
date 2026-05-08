package TP5;

public class EX7Partie3 {

   
    public static <T extends Number> double somme(T a, T b) {

        return a.doubleValue() + b.doubleValue();
    }

    
    public static void main(String[] args) {

        
        System.out.println(somme(10, 20));

        
        System.out.println(somme(5.5, 2.3));

       
        System.out.println(somme(3.2f, 1.8f));
    }
}