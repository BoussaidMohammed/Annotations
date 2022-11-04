package org.mql.java.ui.components;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LabeledTextField extends JPanel{
	private static final long serialVersionUID = 1L;

	public LabeledTextField(String label, int size) {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		if(!label.contains(":")) label += " : ";
		JLabel l1 = new JLabel(label);add(l1);
		JTextField f1 = new JTextField(size);add(f1);
	}
	
	public LabeledTextField(String label, int size, int labelWidth, int labelHeight) {
		this(label,size);
		JLabel l1 = (JLabel)getComponent(0);
		l1.setPreferredSize(new Dimension(labelWidth, labelHeight));
	}

}
