package TP5;

class Machine {
	 
 
	 private boolean etat ;
	 
	 public Machine() {
		 this.etat = false ;
	 }
	 public void demarrer() {

	        if (etat) {
	            throw new IllegalStateException("Erreur : la machine est déjà ON");
	       }
	        etat = true;
	        System.out.println("Machine démarrée");
	 }
	 
	 public void arreter() {
	        etat = false;
	        System.out.println("Machine arrêtée");
	    }
	 
	 public boolean getEtat() {
	        return etat;
	    }
}
 public class EX6 {

		    public static void main(String[] args) {

		        Machine m = new Machine();

		        m.demarrer(); 

		        m.demarrer(); 
		    }
		}


