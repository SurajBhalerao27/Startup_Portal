package com.profound.awt;

import java.awt.*;
import java.awt.event.*;

public class calc extends Frame implements ActionListener {

	Label l1, l2, l3;
	Button b1, b2;
	TextField tf1, tf2, tf3;

	calc() {
		setBackground(Color.CYAN);
		setForeground(Color.RED);
		Font f = new Font("Calibri", Font.BOLD, 12);
		setSize(400, 500);
		setVisible(true);
		setLayout(null);

		l1 = new Label("First Value");
		l1.setBounds(50, 60, 70, 80);
		l1.setFont(f);
		tf1 = new TextField(10);
		tf1.setBounds(160, 60, 100, 30);

		l2 = new Label("Second Value");
		l2.setFont(f);
		l2.setBounds(50, 110, 100, 30);
		tf2 = new TextField(10);
		tf2.setBounds(160, 110, 100, 30);

		l3 = new Label("Result");
		l3.setFont(f);
		l3.setBounds(50, 160, 70, 30);
		tf3 = new TextField(10);
		tf3.setEditable(false);
		tf3.setBounds(160, 160, 100, 30);

		b1 = new Button("Add");
		b1.setBounds(70, 220, 100, 30);

		b2 = new Button("Clear");
		b2.setBounds(200, 220, 100, 30);

		b1.addActionListener(this);
		b2.addActionListener(this);

		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(l3);
		add(tf3);
		add(b1);
		add(b2);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {
			try {

				int a = Integer.parseInt(tf1.getText());
				int b = Integer.parseInt(tf2.getText());
				int c = a + b;
				tf3.setText(String.valueOf(c));
			} catch (NumberFormatException ex) {
				tf3.setText("Invalid Input");
			}
		} else if (e.getSource() == b2) {
			tf1.setText(" ");
			tf2.setText(" ");
			tf3.setText(" ");
		}
	}

	public static void main(String[] args) {
		new calc();
	}

}
