package com.profound.awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Student_Form {

	Label l1, l2, l3, l4, l5;
	Button b1, b2, b3, b4, b5;
	TextArea ta1, ta2, ta3, ta4;
	TextField tf1, tf2, tf3, tf4;
	Frame form;

	Student_Form() {
		form = new Frame("Student Form");
		form.setVisible(true);
		form.setSize(200, 500);
		form.setLayout(new FlowLayout());

		l1 = new Label("Name");
		ta1 = new TextArea(1, 20);
		l2 = new Label("Address");
		ta2 = new TextArea(1, 20);
		l3 = new Label("Age");
		ta3 = new TextArea(1, 20);
		l4 = new Label("College Name");
		ta4 = new TextArea(1, 20);
		b1 = new Button("Submit");
		b2 = new Button("Clear");
		b3 = new Button("Next");

		form.add(l1);
		form.add(ta1);
		form.add(l2);
		form.add(ta2);
		form.add(l3);
		form.add(ta3);
		form.add(l4);
		form.add(ta4);
		form.add(b1);
		form.add(b2);
		form.add(b3);

		form.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new Student_Form();
	}

}
