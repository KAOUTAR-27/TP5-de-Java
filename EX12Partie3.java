package TP5;

import java.util.List;

public class EX12Partie3 {

    
    public static void afficherNombres(List<? extends Number> liste) {

        for (Number n : liste) {
            System.out.println(n);
        }
    }

    
    public static void main(String[] args) {

        
        List<Integer> entiers = List.of(1, 2, 3, 4);

        
        List<Double> reels = List.of(1.5, 2.5, 3.5);

        System.out.println("Liste Integer :");
        afficherNombres(entiers);

        System.out.println();

        System.out.println("Liste Double :");
        afficherNombres(reels);
    }
}