package de.basf.application;

import de.basf.collections.Stapel;
import de.basf.geo.Kreis;
import de.basf.geo.Punkt;
import de.basf.tiere.Schwein;

public class Main {

	public static void main(String[] args) {
		
		Stapel myStapel = new Stapel(40);
		
		for(int i = 0; i < 10; i++) {
			if(! myStapel.isFull()) {
				//myStapel.push(i);
				myStapel.push(new Schwein("Schwein Nr." + i));
				myStapel.push(new Punkt(i,i));
				myStapel.push(new Kreis(i));
			}
		}
		
		while(! myStapel.isEmpty()) {
			System.out.println(myStapel.pop());
		}

	}

}
