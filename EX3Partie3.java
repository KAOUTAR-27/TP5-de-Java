package TP5;


interface Calcul<T> {

 
 T addition(T a, T b);
}


class CalculInteger implements Calcul<Integer> {


 public Integer addition(Integer a, Integer b) {
     return a + b;
 }
}


public class EX3Partie3 {
 public static void main(String[] args) {

     CalculInteger calc = new CalculInteger();

     int resultat = calc.addition(150, 5);

     System.out.println("Résultat : " + resultat);
 }
}
