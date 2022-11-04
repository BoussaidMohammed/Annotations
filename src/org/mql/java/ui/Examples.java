package org.mql.java.ui;

import java.awt.Container;

import javax.swing.JFrame;

import org.mql.java.annotations.FormEngine;
import org.mql.java.models.Author;
import org.mql.java.models.Document;

public class Examples extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public Examples() {
		exp2();
	}
	
	void exp1() {
		FormEngine engine = new FormEngine(Document.class);
		createFrame(engine.getForm());
	}
	
	void createFrame(Container content) {
		setContentPane(content);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}
	
	void exp2() {
		FormEngine engine = new FormEngine(Author.class);
		createFrame(engine.getForm());
	}
	
	public static void main(String[] args) {
		new Examples();
	}
}
