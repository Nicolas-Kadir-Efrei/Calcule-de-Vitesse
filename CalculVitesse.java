package vitesse_GauthierDubois;
import java.util.Scanner;

public class CalculVitesse {
	
	public static float CalculerVitesse(float duree1, float temps) {
		return duree1 / temps;
	}
	
	public static void AfficherVitesse(float afficherVitesse) {
		System.out.println("Votre vitesse en moyenne est " + afficherVitesse + "km/h");
	}

	public static void main(String[] args) {
		//Demander l'utilisateur la distance(km) et temp(h)
		//Distance
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner moi le distance parcourue en kilomètre");
		float kilometre = sc.nextFloat();
		
		//Temps
		System.out.println("Donner moi le temp parcourue en heure");
		float heure = sc.nextFloat();
		
		sc.close();
		
		float afficherVitesse = CalculerVitesse(kilometre, heure);
		AfficherVitesse (afficherVitesse);

	}

}
