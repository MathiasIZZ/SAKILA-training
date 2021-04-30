import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        //List<Actor> actors = ActorDAO.getActors();
        //displayActors(actors);
        //List<Film> films = FilmDAO.getFilms();
        //displayFilms(films);

        afficherMenu();
        Scanner scanner = new Scanner(System.in);
        String choix = scanner.nextLine();
        System.out.println(choix);


    }



    public static void afficherMenu(){
        System.out.println("Bonjour et bienvenue dans notre videotheque");
        System.out.println("Tapez: ");
        System.out.println("1: Liste des films");
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


}
