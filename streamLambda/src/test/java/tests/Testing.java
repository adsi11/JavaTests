package tests;

import lambdaStream.Main;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.ThreadLocalRandom;

public class Testing {
	
	public static void main(String[] args) {
		try {
			int i;
			int totalJugadores;
			for (i = 1; i <= 1000; i++) {
				totalJugadores = ThreadLocalRandom.current().nextInt(0, 10000);
				Main m = new Main(totalJugadores);
				m.sortIdAsc();
				assertTrue(TestMethods.isOrderedIdAsc(m.getNumbers()));
				m.sortIdDesc();
				assertTrue(TestMethods.isOrderedIdDesc(m.getNumbers()));
				m.sortRatingAsc();
				assertTrue(TestMethods.isOrderedRatingAsc(m.getNumbers()));
				m.sortRatingDesc();
				assertTrue(TestMethods.isOrderedRatingDesc(m.getNumbers()));
				assertTrue(TestMethods.getPromedio(m.getNumbers()) == m.average());
				System.out.println("Test " + i + " passed");
			}
			System.out.println("Se pasaron las " + (i - 1) + " pruebas. Todas con número de jugadores aleatorio entre 0 y 10000.");
		} catch (Exception e) {
			System.out.println("Test not passed");
		}
	}
}
