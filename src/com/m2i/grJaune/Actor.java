import java.io.Serializable;
import java.sql.Timestamp;

public class Actor implements Serializable {
    /**
     * Java Bean
     */
    private static final long serialVersionUID = 1L;
    private int actorId;
    private String firstName;
    private String lastName;
    private Timestamp lastUpdate;

    public Actor() {

    }
    /**
     * @param actorId
     * @param firstName
     * @param lastName
     * @param lastUpdate
     */
    public Actor(int actorId, String firstName, String lastName, Timestamp lastUpdate) {
        this.actorId = actorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdate = lastUpdate;
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return
                actorId + ", " +
                        firstName + ", " +
                        lastName + ", " +
                        lastUpdate
                ;
    }


}
