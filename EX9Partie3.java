package TP5;


class Vehicule<T> {

 T vitesse;

 public Vehicule(T vitesse) {
     this.vitesse = vitesse;
 }

 public void afficherVitesse() {
     System.out.println("Vitesse : " + vitesse);
 }
}

class Voiture<T> extends Vehicule<T> {

 public Voiture(T vitesse) {
     super(vitesse);
 }
}


public class EX9Partie3 {

 public static void main(String[] args) {

     
     Voiture<Integer> v1 = new Voiture<>(120);
     v1.afficherVitesse();

     
     Voiture<Double> v2 = new Voiture<>(150.5);
     v2.afficherVitesse();
 }
}
