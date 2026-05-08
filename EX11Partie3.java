package TP5;

import java.util.List;

public class EX11Partie3 {

    
    public static void afficherListe(List<?> liste) {

        for (Object element : liste) {
            System.out.println(element);
        }
    }

    
    public static void main(String[] args) {

        List<String> noms = List.of("kaoutar", "dounia", "salma");
        List<Integer> nombres = List.of(10, 20, 30);

        System.out.println("Liste String :");
        afficherListe(noms);

        System.out.println();

        System.out.println("Liste Integer :");
        afficherListe(nombres);
    }
}
