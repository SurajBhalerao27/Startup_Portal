package com.profound.awt;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseListener extends Frame implements java.awt.event.MouseListener {

	Label l;

	MouseListener() {

		addMouseListener(this);
		l = new Label();
		l.setBounds(20, 50, 100, 20);
		add(l);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new MouseListener();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		l.setText("Clicked");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		l.setText("Pressed");

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		l.setText("Released");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		l.setText("Entered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		l.setText("Exited");
	}
}
