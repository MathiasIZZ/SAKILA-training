import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FilmDAO {

	public static List<Film> getFilmById(int id) {
		List<Film> film_description = new ArrayList<Film>();

		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/sakila", "root", "");
			System.out.println("Connexion ok pour film description");
			statement = connection.createStatement();

			statement.execute("SELECT description FROM film WHERE film.film_id = " + id );

			rs = statement.getResultSet();

			while (rs.next()) {

				String description = rs.getString("description");
				Film b = new Film(description);
				film_description.add(b);
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



		return film_description;
	}

	public static List<Film> getFilms() {
		List<Film> films = new ArrayList<Film>();

		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/sakila", "root", "");
			System.out.println("Connexion: OK");
			statement = connection.createStatement();
			statement.execute("SELECT film_id, title FROM film LIMIT 10, 10");
			rs = statement.getResultSet();
			while (rs.next()) {
				int film_id = rs.getInt("film_id");
				String title = rs.getString("title");
				Film a = new Film(film_id, title);
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
