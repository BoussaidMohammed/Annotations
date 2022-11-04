package org.mql.java.ui.components;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Form extends JPanel {
	private static final long serialVersionUID = 1L;
	private int labelWidth = 100, labelHeight = 25;
	
	public Form(String title) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		EtchedBorder border = new EtchedBorder();
		setBorder(new TitledBorder(border," "+title+""));
	}
	
	public Form(String title, int labelWidth, int labelHeight) {
		this(title);
		this.labelWidth = labelWidth;
		this.labelHeight = labelHeight;
	}
	
	public void addTextField(LabeledTextField field) {
		add(field);
	}
	
	public void addTextField(String label,int size) {
		add(new LabeledTextField(label,size,labelWidth,labelHeight));
	}

	public void addRadioBox(RadioBox radioBox) {
		add(radioBox);
	}
	
	public void addRadioBox(String label,String...items) {
		add(new RadioBox(label, labelWidth, labelHeight, items));
	}
	
public void addCombo(Combo combo) {
		add(combo);
	}

	public void addCombo(String label, String... items) {
		addCombo(new Combo(label, labelWidth, labelHeight, items));
	}
	
}
