package TP5;


class Boite<T> {


 private T contenu;

 
 public void setContenu(T contenu) {
     this.contenu = contenu;
 }


 public T getContenu() {
     return contenu;
 }
}


public class EX1Partie3{
 public static void main(String[] args) {

     
     Boite<String> boiteString = new Boite<>();
     boiteString.setContenu("kaoutar");

     System.out.println("Contenu String : " + boiteString.getContenu());

     
     Boite<Integer> boiteInteger = new Boite<>();
     boiteInteger.setContenu(2026);

     System.out.println("Contenu Integer : " + boiteInteger.getContenu());
 }
}
