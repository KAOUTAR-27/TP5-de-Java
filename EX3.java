package TP5;
import java.util.Scanner;
//AVEC if

/*public class EX3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tab = {1,2,3,4,5};
		
		System.out.print("entrer l'index:");
		int index = sc.nextInt();
		
		if (index >= 0 && index < tab.length) {

            System.out.println("Valeur = " + tab[index]);

        } else {

            System.out.println("Erreur : index hors limites");
        }
		sc.close();
    }
} */

// AVEC TRY/CATCH

public class EX3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] tab = {1,2,3,4,5};
		
		try {
			System.out.print("Entrer un index : ");
            int index = sc.nextInt();

            System.out.println("Valeur = " + tab[index]);
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Erreur : index hors limites");
		}
		
		 catch (Exception e) {

	            System.out.println("Erreur");
	        }
		sc.close();
	}
}
