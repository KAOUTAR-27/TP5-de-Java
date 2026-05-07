package TP5;


class ChampObligatoireException extends Exception {

    public ChampObligatoireException(String message) {
        super(message);
    }
}


class Formulaire {

    public void validerFormulaire(String nom, String email)
            throws ChampObligatoireException {

     
        if (nom == null || nom.isEmpty()
                || email == null || email.isEmpty()) {

            throw new ChampObligatoireException(
                    "Champ obligatoire vide");
        }

        System.out.println("Formulaire valide");
    }
}

public class EX8Partie2 {

    public static void main(String[] args) {

        Formulaire f = new Formulaire();

        try {

            f.validerFormulaire("Kaoutar", "kaoutar@gmail.com");

            f.validerFormulaire("", "test@gmail.com");

        } catch (ChampObligatoireException e) {

            System.out.println("Erreur : " + e.getMessage());
        }
    }
}