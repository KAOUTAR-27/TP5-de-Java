package TP5;


class Animal<T> {

 T nom;


 public Animal(T nom) {
     this.nom = nom;
 }

 
 public void afficherNom() {
     System.out.println("Nom : " + nom);
 }
}


class Chien extends Animal<String> {

 
 public Chien(String nom) {
     super(nom);
 }
}


public class EX8Partie3 {

 public static void main(String[] args) {

     Chien chien = new Chien("ALEX");

     chien.afficherNom();
 }
}