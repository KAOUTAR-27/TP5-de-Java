package TP5;
/* On a  une erreur de paramètre c'est l'argument invalide ,
  x < 0 n’est pas acceptable pour une racine carrée réelle,
  n’est pas une erreur de logique système, mais une erreur d’entrée utilisateur
 Donc IllegalArgumentException est la plus appropriée */

public class EX5 {
	public static int racineCarree(int x) {
		 if (x < 0) {
	            throw new IllegalArgumentException("Erreur : x est negatif !!");
	        }
		 return (int) Math.sqrt(x);


	}
	 public static void main(String[] args) {

	        System.out.println(racineCarree(16)); 

	        System.out.println(racineCarree(-5)); 
	    }
}
