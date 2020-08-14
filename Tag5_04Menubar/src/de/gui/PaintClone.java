package de.gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PaintClone extends Frame {
	private static final int SIZE = 1000;
	
	public enum FORM {LINIE,RECHTECK,OVAL,LÖSCHEN}
	
	private FORM form = FORM.LINIE;
	private Color color = Color.WHITE;
	
	
	


	public FORM getForm() {
		return form;
	}


	public void setForm(FORM form) {
		this.form = form;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	public PaintClone() {
		setSize(SIZE, SIZE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}

		});
		setMenuBar(new MyMenuBar(this));
	}

	
	public static void main(String[] args) {
		new PaintClone().setVisible(true);
	}
	
	
}
