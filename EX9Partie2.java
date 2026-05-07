package TP5;


class PaiementRefuseException extends Exception {

    public PaiementRefuseException(String message) {
        super(message);
    }
}


class CarteExpireeException extends Exception {

    public CarteExpireeException(String message) {
        super(message);
    }
}

class Paiement {

    private final double PLAFOND = 5000;
    private boolean carteExpiree;

  
    public Paiement(boolean carteExpiree) {
        this.carteExpiree = carteExpiree;
    }

   
    public void payer(double montant)
            throws PaiementRefuseException,
                   CarteExpireeException {

        
        if (carteExpiree) {

            throw new CarteExpireeException(
                    "Carte expirée");
        }

    
        if (montant > PLAFOND) {

            throw new PaiementRefuseException(
                    "Paiement refusé : plafond dépassé");
        }

        System.out.println("Paiement effectué avec succès");
    }
}

public class EX9Partie2 {

    public static void main(String[] args) {

        Paiement p = new Paiement(false);

        try {

            p.payer(1000);

            p.payer(7000);

        } catch (PaiementRefuseException e) {

            System.out.println("Erreur paiement : "
                    + e.getMessage());

        } catch (CarteExpireeException e) {

            System.out.println("Erreur carte : "
                    + e.getMessage());
        }
    }
}
