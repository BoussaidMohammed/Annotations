package org.mql.java.ui.components;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class RadioBox extends JPanel {
	
	private static final long serialVersionUID = 1L;

	public RadioBox(String label, String...items) {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		if(!label.contains(":")) label += " : ";
		JLabel l1 = new JLabel(label);add(l1);
		ButtonGroup gr = new ButtonGroup();
		for(String s: items) {
			JRadioButton r1 = new JRadioButton(s);
			gr.add(r1);add(r1);
		}
	}
	
	public RadioBox(String label, int labelWidth, int labelHeight, String...items) {
		this(label, items);
		JLabel l1 = (JLabel)getComponent(0);
		l1.setPreferredSize(new Dimension(labelWidth, labelHeight));
	}
}
