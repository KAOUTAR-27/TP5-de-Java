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

public class EX5Partie3 {

 public static void main(String[] args) {

     
     Comparateur<Integer> c1 = new ComparateurInteger();

     System.out.println(c1.comparer(5, 10));

     
     Comparateur<String> c2 = new ComparateurString();

     System.out.println(c2.comparer("Java", "Programmation"));
 }
}