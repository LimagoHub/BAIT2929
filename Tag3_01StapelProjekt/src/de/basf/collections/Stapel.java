package de.basf.collections;

/**
 * Fachlichen Kommentar
 * Eine tolle Klasse
 * @author JoachimWagner
 *
 */
public class Stapel {
	
	private Object [] data;
	private int index;
	
	public Stapel() throws StapelException {
		this(10);
		
	}
	
	public Stapel(int groesse) throws StapelException {
		try {
			data = new Object[groesse];// potenzieller Fehler // Fehler ausl�sen
			index = 0;
		} catch (Exception e) {
			throw new StapelException("falsche Gr��e",e);
		}
	}
	
	/**
	 * 
	 * @param wert erwartet Teller ......
	 * @throws StapelException 
	 */
	public void push(Object wert) throws StapelException {
		
		try {
			data[index++] = wert;
		} catch (Exception e) {
			throw new StapelException("Overflow",e);
		}
	}
	
	/**
	 * 
	 * @return gibt Teller zur�ck
	 * @throws StapelException 
	 */
	public Object pop() throws StapelException {
		if(isEmpty()) throw new StapelException("Underflow");
		return data[--index];
	}

	public boolean isEmpty() {
		return index <= 0; 
	}

	public boolean isFull() {
		return index >= data.length;
	}
}
