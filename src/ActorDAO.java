import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;


public class ActorDAO {

    public static List<Actor> getActors() {
        List<Actor> actors = new ArrayList<Actor>();

        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            // Partie connexion
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/sakila",
                    "root",
                    ""
            );
            System.out.println("On est connectés !");

            // Partie requête
            statement = connection.createStatement();
            statement.execute("SELECT * FROM actor LIMIT 10");

            // Partie résultat
            rs = statement.getResultSet();
            while(rs.next()) {
                int actorId = rs.getInt("actor_id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                Timestamp lastUpdate = rs.getTimestamp("last_update");

                Actor a = new Actor(actorId, firstName, lastName, lastUpdate);
                actors.add(a);

				/* En une ligne
				actors.add(new Actor(
					rs.getInt("actor_id"),
					rs.getString("first_name"),
					rs.getString("last_name"),
					rs.getTimestamp("last_update")
				));
				*/
            }
        } catch(SQLException e) {
            e.printStackTrace();
        } finally {
            if(connection != null) {
                try {
                    connection.close();
                } catch(SQLException e) {
                    connection = null;
                }
            }
            if(statement != null) {
                try {
                    statement.close();
                } catch(SQLException e) {
                    statement = null;
                }
            }
            if(rs != null) {
                try {
                    rs.close();
                } catch(SQLException e) {
                    rs = null;
                }
            }
        }
        return actors;
    }
}
