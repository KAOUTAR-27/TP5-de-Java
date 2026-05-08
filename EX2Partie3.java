package TP5;

class Paire<T, U> {

 
 private T premier;
 private U second;

 public Paire(T premier, U second) {
     this.premier = premier;
     this.second = second;
 }
 
 public void afficherPaire() {
     System.out.println("Premier : " + premier);
     System.out.println("Second : " + second);
 }
}


public class EX2Partie3 {
 public static void main(String[] args) {
	 
	 Paire<String, Integer> p1 = new Paire<>("Age", 20);
     p1.afficherPaire();

     System.out.println();

     
     Paire<Double, String> p2 = new Paire<>(15.5, "Note");
     p2.afficherPaire();
 }
}