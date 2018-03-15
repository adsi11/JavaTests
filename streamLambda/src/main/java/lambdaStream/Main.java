package lambdaStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

public class Main{
	private Jugador numbers[];
	private int cap;
	
	public Main(int cap) {
		this.numbers = new Jugador[cap];
		this.cap = cap;
		this.fillArray();
	}
	
	public static Comparator<Jugador> byIdAsc = (Jugador j1, Jugador j2) -> j1.getId() - j2.getId();
	public static Comparator<Jugador> byIdDesc = (Jugador j1, Jugador j2) -> j2.getId() - j1.getId();
	public static Comparator<Jugador> byRatingAsc = (Jugador j1, Jugador j2) -> j1.getRating() - j2.getRating();
    public static Comparator<Jugador> byRatingDesc = (Jugador j1, Jugador j2) -> j2.getRating() - j1.getRating(); 
        
	public double average(){ 
		return Arrays.asList(numbers).stream().mapToInt(j -> j.getRating()).average().getAsDouble();
	}
	
	public void fillArray(){
		for (int i = 0; i < numbers.length; i++) {
			this.numbers[i] = new Jugador(ThreadLocalRandom.current().nextInt(0, Math.max(this.cap - 45, 45)),
				ThreadLocalRandom.current().nextInt(1600, 2950));
		}	
	}
	
	public void sortIdAsc(){
		Arrays.sort(numbers, Main.byIdAsc);
	}
	
	public void sortIdDesc(){
		Arrays.sort(numbers, Main.byIdDesc);
	}
	
        public void sortRatingAsc(){
		Arrays.sort(numbers, Main.byRatingAsc);
	}
	
	public void sortRatingDesc(){
		Arrays.sort(numbers, Main.byRatingDesc);
	}
    
    public Jugador[] getNumbers() {
		return numbers;
	}

	@Override
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
		int totalJugadores = 50;
		
        	System.out.println("=====================Inicio del Main=======================");
		Main m = new Main(totalJugadores);
        	System.out.println("=====================Impresión inicial de datos=======================");
		m.print();
		m.sortIdAsc();
        	System.out.println("=====================Datos ordenados ascendentemente por ID=======================");
		m.print();
        	System.out.println("=====================Datos ordenados descendentemente por ID=======================");
		m.sortIdDesc();
		m.print();
        m.sortRatingAsc();
        	System.out.println("=====================Datos ordenados ascendentemente por rating=======================");
		m.print();
        	System.out.println("=====================Datos ordenados descendentemente por rating=======================");
		m.sortRatingDesc();
		m.print();
        System.out.println("=====================Calculo del rating promedio=======================");
		System.out.println("Rating average is = " + m.average());
        System.out.println("=====================Fin del Main=======================");
	}
}
