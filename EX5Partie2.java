package TP5;

class AuthentificationException extends Exception {

    public AuthentificationException(String message) {
        super(message);
    }
}

class Authentification {

    public void login(String username, String password)
            throws AuthentificationException {

       
        String userCorrect = "admin";
        String passCorrect = "1234";

      
        if (!username.equals(userCorrect) || !password.equals(passCorrect)) {

            throw new AuthentificationException(
                    "Identifiants incorrects");
        }

        System.out.println("Connexion réussie");
    }
}

public class EX5Partie2 {

    public static void main(String[] args) {

        Authentification a = new Authentification();

        try {

            a.login("admin", "1234");

            a.login("user", "0000");

        } catch (AuthentificationException e) {

            System.out.println("Erreur : " + e.getMessage());
        }
    }
}