package lambda;

public class Jugador {
	private int id;

	public Jugador(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Jugador [id=" + id + "]";
	}
}