import java.io.Serializable;
import java.sql.Timestamp;

public class Actor implements Serializable {
    /**
     * Java Bean
     */
    private static final long serialVersionUID = 1L;
    private int actor_id;
    private String first_name;
    private String last_name;
    private Timestamp last_update;

    public Actor() {

    }
    /**
     * @param actor_id
     * @param first_name
     * @param last_name
     * @param last_update
     */
    public Actor(int actor_id, String first_name, String last_name, Timestamp last_update) {
        this.actor_id = actor_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.last_update = last_update;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return
                actor_id + ", " +
                        first_name + ", " +
                        last_name + ", " +
                        last_update
                ;
    }


}
