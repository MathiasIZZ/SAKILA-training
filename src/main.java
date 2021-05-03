import java.util.List;
import java.util.Scanner;

public class main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        //String toto = afficherMenu();
        //priseChoix(toto);

        priseChoix(afficherMenu());
        System.out.println("Quel est votre choix ?");

        String choixStr = scanner.nextLine();
        int choix = Integer.parseInt(choixStr);
        System.out.println(choix);

    }

    public static String afficherMenu(){
        String choix = null;

        System.out.println("Bonjour et bienvenue dans notre videotheque");
        System.out.println("Tapez: ");
        System.out.println("0: Retour au menu principal");
        System.out.println("1: Liste des films");
        System.out.println("2: Liste des acteurs");

        choix = scanner.nextLine();
        return choix;
    }

    public static void displayMenuActors(){
        System.out.println("Veuillez taper: ");
        System.out.println("L'identifiant du film pour en savoir plus");
        System.out.println("0: Pour repartir au menu principal");
    }

    public static void displayMenuFilms(){
        String choixStr = null;
        System.out.println("Veuillez taper: ");
        System.out.println("L'identifiant du film pour en savoir plus");
        System.out.println("0: Pour repartir au menu principal");

        choixStr = scanner.nextLine();
        int choix = Integer.parseInt(choixStr);

        List<Film> film_description = FilmDAO.getFilmById(choix);
        displayFilmDescription(film_description);
    };



    public static void priseChoix(String choix) {
        int choixInt = Integer.parseInt(choix);

        switch (choixInt) {
            case 0 : {
                System.out.println("Retour au menu principal");
                priseChoix(afficherMenu());

                break;
            }
            case 1 : {
                List<Film> films = FilmDAO.getFilms();
                displayFilms(films);
                displayMenuFilms();

                break;
            }
            case 2: {
                List<Actor> actors = ActorDAO.getActors();
                displayActors(actors);
                displayMenuActors();

                break;
            }
            default : {
                System.out.println("Saisie Incorrect");
                priseChoix(afficherMenu());

                break;
            }
        }
    }


    public static void displayActors(List<Actor> actors) {
        for(Actor actor : actors) {
            System.out.println(actor);
        }
    }
    public static void displayFilms(List<Film> films) {
        for (Film film: films) {
            System.out.println(film);
        }
    }

    public static void displayFilmDescription(List<Film> film_description) {
        for (Film film: film_description) {
            System.out.println("Cest partit ! ");
            System.out.println(film.getDescritpion());
        }
    }


}
