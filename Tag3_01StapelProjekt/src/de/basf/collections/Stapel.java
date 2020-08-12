package de.basf.collections;

/**
 * Fachlichen Kommentar
 * Eine tolle Klasse
 * @author JoachimWagner
 *
 */
public class Stapel {
	
	private int [] data;
	private int index;
	
	public Stapel() {
		this(10);
	}
	
	public Stapel(int groesse) {
		data = new int[groesse < 1 ? 10 : groesse];
		index = 0;
	}
	
	/**
	 * 
	 * @param wert erwartet Teller ......
	 */
	public void push(int wert) {
		if(isFull()) return;
		data[index++] = wert;
	}
	
	/**
	 * 
	 * @return gibt Teller zurück
	 */
	public int pop() {
		if(isEmpty()) return 0;
		return data[--index];
	}

	public boolean isEmpty() {
		return index <= 0; 
	}

	public boolean isFull() {
		return index >= data.length;
	}
}
