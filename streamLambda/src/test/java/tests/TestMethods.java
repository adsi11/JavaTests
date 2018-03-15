package tests;

import lambdaStream.Jugador;

public class TestMethods {
	
	public static boolean isOrderedIdAsc(Jugador[] jugadores) {
		int ant = 0, cur = 0;
		
		for (int i = 0; i < jugadores.length; i++) {
			cur = jugadores[i].getId();
			if(!(cur >= ant))
				return false;
			ant = cur;
		}
		return true;
	}
	
	public static boolean isOrderedIdDesc(Jugador[] jugadores) {
		int ant = 0, cur = 0;
		
		for (int i = jugadores.length - 1; i >= 0; i--) {
			cur = jugadores[i].getId();
			if(!(cur >= ant))
				return false;
			ant = cur;
		}
		return true;
	}
	
	public static boolean isOrderedRatingAsc(Jugador[] jugadores) {
		int ant = 0, cur = 0;
		
		for (int i = 0; i < jugadores.length; i++) {
			cur = jugadores[i].getRating();
			if(!(cur >= ant))
				return false;
			ant = cur;
		}
		return true;
	}
	
	public static boolean isOrderedRatingDesc(Jugador[] jugadores) {
		int ant = 0, cur = 0;
		
		for (int i = jugadores.length - 1; i >= 0; i--) {
			cur = jugadores[i].getRating();
			if(!(cur >= ant))
				return false;
			ant = cur;
		}
		return true;
	}
	
	public static double getPromedio(Jugador[] jugadores) {
		double suma = 0;
		
		for(Jugador j : jugadores)
			suma += j.getRating();
		
		return suma / jugadores.length;
	}
	
}
