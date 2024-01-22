package com.profound.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Second_Frame_Obj {

	Label l;
	Button b;
	TextArea tf;
	Frame f;

	Second_Frame_Obj() {
		f = new Frame("Student Form");
		f.setSize(400, 400);
		f.setVisible(true);
		f.setLayout(new FlowLayout());

		l = new Label("Address");
		tf = new TextArea(3, 10);

		f.add(l);
		f.add(tf);

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Second_Frame_Obj();
	}

}
