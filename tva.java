package p003;
import java.util.Scanner;
public class tva {
	public static void main(String[] args) {
		Scanner clavier = new Scanner( System.in ); //
		
		// Variables entrées au clavier
		double prixHtva; // Prix htva
		double tauxTva; // taux de tva en %

		// Variables sorties calculées
		double prixTvac; // prix tva compris (calculé)
		double tva;
		
		// Entrées
		System.out.println("Entrez les données du calcul de la tva");
		System.out.print("Entrez le prix hors tva: ");
		prixHtva = clavier.nextDouble();
		System.out.print("Entrez le taux de tva (en %): ");
		tauxTva = clavier.nextDouble();
		
		// Calculs
		prixTvac = prixHtva * (1 + tauxTva/100); //
		tva = prixHtva * (tauxTva/100);
		
		// Sorties
		System.out.printf("Le montant de la tva est:  %1.2f%n", tva );
		System.out.printf("Le prix tvac est:  %1.2f%n", prixTvac);
		clavier.close();
	}

}
