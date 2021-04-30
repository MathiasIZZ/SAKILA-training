import java.util.List;

public class main {

    public static void main(String[] args) {
        List<Actor> actors = ActorDAO.getActors();
        displayActors(actors);
    }

    public static void displayActors(List<Actor> actors) {
        for(Actor actor : actors) {
            System.out.println(actor);
        }
    }




}
