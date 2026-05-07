package TP5;


class StockInsuffisantException extends Exception {

    public StockInsuffisantException(String message) {
        super(message);
    }
}


class Produit {

    private int stock;

   
    public Produit(int stock) {
        this.stock = stock;
    }

    public void retirerDuStock(int quantite)
            throws StockInsuffisantException {

        if (quantite > stock) {

            throw new StockInsuffisantException(
                    "Stock insuffisant");
        }

        stock -= quantite;

        System.out.println(
                "Retrait effectué. Stock restant = " + stock);
    }
}

public class EX6Partie2 {

    public static void main(String[] args) {

        Produit p = new Produit(50);

        try {

            p.retirerDuStock(30);

            p.retirerDuStock(40);

        } catch (StockInsuffisantException e) {

            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
