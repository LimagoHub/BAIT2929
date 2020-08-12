package de.basf.tiere;

public class Schwein {
	
	// Instanzvariablen
	private String name;
	private int gewicht;
	
	// Klassenvariablen
	private static int counter;
	
	public static int getCounter() {
		
		return counter;
	}

	// Klassenkonstruktor
	static {
		counter = 0;
	}
	
	
	// Instanz-Konstruktor initialisiert das Object(wird automatisch durch new aufgerufen)
	public Schwein() {
		this("nobody");
	}
	
	// Instanz-Konstruktor initialisiert das Object(wird automatisch durch new aufgerufen)
	public Schwein(String name) {
		this.name = name;
		this.gewicht = 10;
		counter ++;
		
	}
	
	// Destruktor
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Quieeeeeek!");
		counter --;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		if(name.equals("Elsa"))
			return ;
		this.name = name;
	}


	public int getGewicht() {
		return gewicht;
	}

	public void fressen() {
		gewicht ++;
	}



	@Override
	public String toString() {
		return "Schwein [name=" + name + ", gewicht=" + gewicht + "]";
	}



	

}
