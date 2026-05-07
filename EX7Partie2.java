package TP5;

class QuotaDepasseException extends Exception {

    public QuotaDepasseException(String message) {
        super(message);
    }
}

class Telechargement {

    
    private final double LIMITE = 100;

    public void telechargerFichier(double taille)
            throws QuotaDepasseException {


        if (taille > LIMITE) {

            throw new QuotaDepasseException(
                    " taille trop grande");
        }

        System.out.println("Télechargement Validé");
    }
}

public class EX7Partie2 {

    public static void main(String[] args) {

        Telechargement t = new Telechargement();

        try {

            t.telechargerFichier(50);

            t.telechargerFichier(150);

        } catch (QuotaDepasseException e) {

            System.out.println("Erreur : " + e.getMessage());
        }
    }
}