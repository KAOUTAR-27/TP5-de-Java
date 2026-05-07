package TP5;
import java.util.Scanner;

public class EX4 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		 try {

	            System.out.print("Entrer une chaîne : ");
	            String ch = sc.nextLine();

	           
	            int nombre = Integer.parseInt(ch);

	            System.out.println("Entier = " + nombre);

	         }
		 catch (NumberFormatException e) {

	            System.out.println("Erreur : veuillez entrer un entier valide.");
	        }

          sc.close();
         }
   }

