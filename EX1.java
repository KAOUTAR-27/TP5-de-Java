package TP5;
import java.util.Scanner; 

  class Division {
	public int diviser(int a , int b) {
		if(b==0) {
			throw new ArithmeticException("Erreur:pas de division par 0 ");
		}
		return a/b;
		
   }
}
 

public class EX1 {
	public static void main(String[]args) {
		
	    Scanner sc = new Scanner(System.in);
		Division d = new Division();
		
		try {
			
			System.out.print("entrer le numerateur:");
			int a =sc.nextInt();
			
			System.out.print("entrer le denomenateur :");
			int b=sc.nextInt();
			
			
		int resultat = d.diviser(a, b);
		
		System.out.println("resultat= " + resultat);
					
		}
		 catch(ArithmeticException e ){
			 System.out.println(e.getMessage());
		 }
		 
		catch (Exception e) {
			System.out.println("Ereur: entrer des entiers justes");
		}
		sc.close();
	}
}

	

	