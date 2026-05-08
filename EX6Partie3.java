package TP5;

public class EX6Partie3 {

    
    public static <T> void afficherTableau(T[] tableau) {

        for (T element : tableau) {
            System.out.println(element);
        }
    }

    
    public static <T> T getPremier(T[] tableau) {

        return tableau[0];
    }

    
    public static void main(String[] args) {

        
        String[] mots = {"Java", "Python", "C++"};

        
        Integer[] nombres = {10, 20, 30};

        
        System.out.println("Tableau String :");
        afficherTableau(mots);

        System.out.println();

        System.out.println("Tableau Integer :");
        afficherTableau(nombres);

        System.out.println();

        
        System.out.println("Premier mot : " + getPremier(mots));
        System.out.println("Premier nombre : " + getPremier(nombres));
    }
}