package TP5;
//SANS TRY/CATCH
/* public class EX2 {
	public static void afficheLongueur(String ch) {
		
		if(ch == null) {
			System.out.println("la chaine est null");
		}else {
			System.out.println("Longueur = " + ch.length());
		}
	}
	public static void main(String[]args) {
		
		afficheLongueur("Kaoutar");
		
		afficheLongueur(null);
		
	}

} */
//AVEC TRY/CATCH

public class EX2 {
	public static void afficheLongueur(String ch) {
		
		try {
			System.out.println("Longueur = " + ch.length());
		}
		catch (NullPointerException e) {
			System.out.println("ERREUR:la chaine est null");
		}
	}
	public static void main(String[] args) {
		
		afficheLongueur("kaoutar");
		afficheLongueur(null);
	}

}

