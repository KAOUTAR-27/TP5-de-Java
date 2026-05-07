package TP5;


class SoldeInsuffisantException extends Exception {

    public SoldeInsuffisantException(String message) {
        super(message);
    }
}
 class CompteBancaire {

    private String code;
    private double solde;

    public CompteBancaire(String code, double solde) {
        this.code = code;
        this.solde = solde;
    }

   
    public void verser(double montant) {

        solde += montant;
        System.out.println("Versement effectué. Solde = " + solde);
    }

   
    public void retirer(double montant) throws SoldeInsuffisantException {

        if (montant > solde) {
            throw new SoldeInsuffisantException("Solde insuffisant !");
        }

        solde -= montant;
        System.out.println("Retrait effectué. Solde = " + solde);
    }

    public double getSolde() {
        return solde;
    }
}

public class EX1Partie2 {
	public static void main(String[] args) {

        CompteBancaire compte = new CompteBancaire("C001", 500);

        compte.verser(200); 

        try {

            compte.retirer(100); 
            compte.retirer(1000); 

        } catch (SoldeInsuffisantException e) {

            System.out.println("Erreur : " + e.getMessage());
        }
    }

}
