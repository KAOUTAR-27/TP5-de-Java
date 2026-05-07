package TP5;

public class EX7 {
	
	public static void methodeC() {
		 throw new ArithmeticException("Erreur dans la méthode C");
	}
	
	 public static void methodeB() {

	        methodeC();
	 }
	 public static void methodeA() {

	        try {

	            methodeB();

	        } catch (ArithmeticException e) {

	            System.out.println("Exception attrapée dans A : " + e.getMessage());
	        }
	    }
	 public static void main(String[] args) {

	        methodeA();
	    }

}
