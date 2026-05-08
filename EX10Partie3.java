package TP5;


class Repository<T> {

 
 public void save(T obj) {
     System.out.println("Sauvegarde de : " + obj);
 }
}


class User {
 String nom;

 public User(String nom) {
     this.nom = nom;
 }

 
 public String toString() {
     return nom;
 }
}


class UserRepository extends Repository<User> {
	
}


public class EX10Partie3 {

 public static void main(String[] args) {

     UserRepository repo = new UserRepository();

     User u1 = new User("Kaoutar");
     User u2 = new User("Salma");

     repo.save(u1);
     repo.save(u2);
 }
}
