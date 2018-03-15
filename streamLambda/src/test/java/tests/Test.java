package tests;

import lambdaStream.Jugador;

public class Test {
	
	public static boolean isOrderedAsc(Jugador[] jugadores) {
		int ant = 0, cur = 0;
		
		for (int i = 0; i < jugadores.length; i++) {
			cur = jugadores[i].getId();
			if(!(cur >= ant))
				return false;
			ant = cur;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
	}
}
