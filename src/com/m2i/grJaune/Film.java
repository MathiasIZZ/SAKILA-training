import java.io.Serializable;

public class Film implements Serializable {

	private static final long serialVersionUID = 1L;
	private int film_id;
	private String title;
	private String descritpion;
	private int language_id;

	@Override
	public String toString() {
		return "Film film_id : " + film_id + ", title : " + title + ", descritpion : " + descritpion + ", language_id : "
				+ language_id;
	}

	public Film(int film_id, String title, String descritpion, int language_id) {
		super();
		this.film_id = film_id;
		this.title = title;
		this.descritpion = descritpion;
		this.language_id = language_id;

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
		return descritpion;
	}

	public void setDescritpion(String descritpion) {
		this.descritpion = descritpion;
	}

	public int getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}

}
