package de.gui;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MyMenuBar extends MenuBar {
	
	public MyMenuBar(PaintClone paintClone) {
		Menu menu;
		MenuItem menuItem;
		
		menu = new Menu("Datei");
		
		menuItem = new MenuItem("beenden");
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				paintClone.dispose();
				
			}
		});
		menu.add(menuItem);
		
		add(menu);
		
		menu = new Menu("Formen");
		
		menuItem = new MenuItem("Linie");
		menuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				paintClone.setForm(PaintClone.FORM.LINIE);
			}
		});
		menu.add(menuItem);
		
		menuItem = new MenuItem("Oval");
		menu.add(menuItem);
		
		menuItem = new MenuItem("Rechteck");
		menu.add(menuItem);
		
		menu.addSeparator();
		
		menuItem = new MenuItem("Löschen");
		menu.add(menuItem);
		
		add(menu);
		
		
	}

}
