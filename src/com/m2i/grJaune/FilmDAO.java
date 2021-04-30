import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FilmDAO {

	public static List<Film> getFilms() {
		List<Film> films = new ArrayList<Film>();

		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/sakila", "root", "");
			System.out.println("On est connectés");
			statement = connection.createStatement();
			statement.execute("SELECT * FROM film LIMIT 10");
			rs = statement.getResultSet();
			while (rs.next()) {
				int film_id = rs.getInt("film_id");
				String title = rs.getString("title");
				String description = rs.getString("description");
				int language_id = rs.getInt("language_id");
				Film a = new Film(film_id, title, description, language_id);
				films.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					connection = null;
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					statement = null;
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					rs = null;
				}
			}
		}
		return films;
	}

}
