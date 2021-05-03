import java.util.Scanner;

public class Menu {

	public static String choix;

	public static void afficherMenu() {
		System.out.println("Pour voir les fims, tapez 1");
		System.out.println("Pour voir les acteurs, tapez 2");
		System.out.println("Pour revenir au menu principal, tapez 0");

	}

	public static void choixMenu(String choix) {
		if (choix == "1") {
			main.displayFilms(null);
		} else if (choix == "2") {
			main.displayActors(null);
		} else if (choix == "0") {
			afficherMenu();
		} else {
			while(choix !="0" ||choix !="1" ||choix !="2")
			System.out.println("Saisie invalide");
			afficherMenu();

		}
	}
}
