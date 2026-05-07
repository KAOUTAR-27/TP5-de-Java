package TP5;

public class EX8 {
	 public static void verifierAge(int age) throws Exception {

	        if (age < 18) {
	            throw new Exception("Accès refusé : âge inférieur à 18 ans");
	        }

	        System.out.println("Accès autorisé");
	    }

	    public static void main(String[] args) {

	        try {

	            verifierAge(20); // OK
	            verifierAge(15); // Exception

	        } catch (Exception e) {

	            System.out.println("Erreur : " + e.getMessage());
	        }
	    }

}
