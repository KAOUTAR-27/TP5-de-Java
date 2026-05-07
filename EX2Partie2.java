package TP5;
class MontantInvalideException extends Exception {

    public MontantInvalideException(String message) {
        super(message);
    }
}
public class EX2Partie2 {
	

	    public static void verifierMontant(double montant) throws MontantInvalideException {

	        if (montant <= 0) {
	            throw new MontantInvalideException("Montant invalide : doit être > 0");
	        }

	        System.out.println("Montant valide : " + montant);
	    }

	    public static void main(String[] args) {

	        try {

	            verifierMontant(460);   
	            verifierMontant(-330);  
	            verifierMontant(0);   

	        } catch (MontantInvalideException e) {

	            System.out.println("Erreur : " + e.getMessage());
	        }
	    }
	

}
