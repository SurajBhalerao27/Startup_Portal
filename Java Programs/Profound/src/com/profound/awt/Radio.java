package com.profound.awt;

import java.awt.*;
import java.awt.event.*;

public class Radio extends Frame {
	Label l;
	Button b;
	Checkbox c1, c2;
	CheckboxGroup cbg;

	Radio() {
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 500);

		l = new Label("Gender");
		cbg = new CheckboxGroup();
		c1 = new Checkbox("Male", cbg, true);
		c2 = new Checkbox("Female", cbg, false);
		b = new Button("Submit");
		add(l);
		add(b);
		add(c1);
		add(c2);

		// Windows Closing code <<< Windows Lsitner >>>
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new Radio(); // Anonymous Object of class...
	}
}
