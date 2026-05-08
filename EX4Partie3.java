package TP5;

interface Comparateur<T> {
 int comparer(T a, T b);
}

class ComparateurInteger implements Comparateur<Integer> {

 
 public int comparer(Integer a, Integer b) {
     return a.compareTo(b);
 }
}

class ComparateurString implements Comparateur<String> {

	
 public int comparer(String a, String b) {
     return Integer.compare(a.length(), b.length());
 }
}


public class EX4Partie3 {

 public static void main(String[] args) {

    
     Comparateur<Integer> compInt = new ComparateurInteger();

     System.out.println("Comparaison Integer : "
             + compInt.comparer(10, 20));

     
     Comparateur<String> compStr = new ComparateurString();

     System.out.println("Comparaison String : "
             + compStr.comparer("Bonjour", "Salut"));
 }
}