import java.io.Serial;
import java.io.Serializable;

public class Film implements Serializable {

	private static final long serialVersionUID = 1L;
	private int film_id;
	private String title;
	private String description;
	private int language_id;

	@Override
	public String toString() {
		return "[Film] id: " + film_id + " title: " + title;
	}

	public Film(int film_id, String title, String description, int language_id) {
		super();
		this.film_id = film_id;
		this.title = title;
		this.description = description;
		this.language_id = language_id;
	}

	public Film(int film_id, String title){
		this.film_id = film_id;
		this.title = title;
	}

	public Film(String description){

		this.description = description;
	}

	public Film() {
	}

	public int getFilm_id() {
		return film_id;
	}

	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescritpion() {
		return description;
	}

	public void setDescritpion(String descritpion) {
		this.description = descritpion;
	}

	public int getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}

}
