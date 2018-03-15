package lambdaStream;

public class Jugador {
	private int id;
	private int rating;

	public Jugador(int id, int rating) {
		super();
		this.id = id;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public int getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "Jugador [id=" + id + ", rating=" + rating + "]";
	}
}