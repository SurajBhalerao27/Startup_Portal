package com.profound.awt; // Abstract Window Toolkit

import java.awt.*;
import java.awt.event.*;

public class First_Extend_Frame extends Frame {

	Label l;
	TextField tf;
	Button b;

	First_Extend_Frame() {
		setSize(400, 400);
		setVisible(true);
		setLayout(new FlowLayout());

		l = new Label("Name");
		tf = new TextField(15);
		b = new Button("Click");

		add(l);
		add(tf);
		add(b);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new First_Extend_Frame();
	}

}
