package TP5;

class MontantInvalideException extends Exception {
    public MontantInvalideException(String message) {
        super(message);
    }
}

class SoldeInsuffisantException extends Exception {
    public SoldeInsuffisantException(String message) {
        super(message);
    }
}

class Compte {

    private double solde;

   
    public Compte(double solde) {
        this.solde = solde;
    }

    public void verser(double montant) throws MontantInvalideException {

        if (montant <= 0) {
            throw new MontantInvalideException("Montant invalide");
        }

        solde += montant;
        System.out.println("Versement OK. Solde = " + solde);
    }

    public void retirer(double montant)
            throws MontantInvalideException, SoldeInsuffisantException {

        if (montant <= 0) {
            throw new MontantInvalideException("Montant invalide");
        }

        if (montant > solde) {
            throw new SoldeInsuffisantException("Solde insuffisant");
        }

        solde -= montant;
        System.out.println("Retrait OK. Solde = " + solde);
    }

    public double getSolde() {
        return solde;
    }
}

public class EX3Partie2 {

    public static void main(String[] args) {

        Compte compte = new Compte(500);

        try {

            compte.retirer(200);
            compte.retirer(-10);
            compte.retirer(1000);

        } catch (MontantInvalideException e) {

            System.out.println("Erreur montant : " + e.getMessage());

        } catch (SoldeInsuffisantException e) {

            System.out.println("Erreur solde : " + e.getMessage());
        }
    }
}
	   