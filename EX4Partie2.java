package TP5;


class EmailInvalideException extends Exception {

    public EmailInvalideException(String message) {
        super(message);
    }
}

class AgeInvalideException extends Exception {

    public AgeInvalideException(String message) {
        super(message);
    }
}

class Utilisateur {

    public void inscrire(String email, int age)
            throws EmailInvalideException, AgeInvalideException {

        
        if (email == null || !email.contains("@")) {
            throw new EmailInvalideException("Email invalide");
        }

        if (age < 18) {
            throw new AgeInvalideException("Age invalide : moins de 18 ans");
        }

        System.out.println("Inscription réussie");
    }
}

public class EX4Partie2 {

    public static void main(String[] args) {

        Utilisateur u = new Utilisateur();

        try {

            u.inscrire("test@gmail.com", 27);

            u.inscrire("testgmail.com", 30);

            u.inscrire("kaoutar@gmail.com", 13);

        } catch (EmailInvalideException e) {

            System.out.println("Erreur Email : " + e.getMessage());

        } catch (AgeInvalideException e) {

            System.out.println("Erreur Age : " + e.getMessage());
        }
    }
}
