package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

public class Main{
	private final int MAX_CAP = 15;
	private Jugador numbers[];
	
	public Main() {
		this.numbers = new Jugador[MAX_CAP];
		this.fillArray();
	}
	
	public static Comparator<Jugador> byIdAsc = (Jugador j1, Jugador j2) -> j1.getId() - j2.getId();
	public static Comparator<Jugador> byIdDesc = (Jugador j1, Jugador j2) -> j2.getId() - j1.getId();
	
	public void fillArray(){
		for (int i = 0; i < numbers.length; i++) {
			this.numbers[i] = new Jugador(ThreadLocalRandom.current().nextInt(0, Math.max(MAX_CAP - 45, 45)));
		}	
	}
	
	public void sortAsc(){
		Arrays.sort(numbers, Main.byIdAsc);
	}
	
	public void sortDesc(){
		Arrays.sort(numbers, Main.byIdDesc);
	}
	
	public String toString(){
		String string = "";
		
		for (Jugador i : this.numbers) 
			string += i.toString() + "\n";
		return string;
	}
	
	public void print(){
		System.out.println(this.toString());
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.print();
		m.sortAsc();
		m.print();
		m.sortDesc();
		m.print();
	}
}
