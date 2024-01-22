package com.profound.awt;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class KeyEvent extends Frame implements KeyListener {

	Label l;
	TextArea t;

	KeyEvent() {
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);

		l = new Label("Enter Text");
		t = new TextArea(20, 30);

		add(l);
		add(t);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void keyTyped(java.awt.event.KeyEvent e) {
//		String s = t.getText();
//		l.setText(" " + s.length() + l);
		l.setText("Typed");

	}

	@Override
	public void keyPressed(java.awt.event.KeyEvent e) {
		l.setText("Pressed");

	}

	@Override
	public void keyReleased(java.awt.event.KeyEvent e) {
		l.setText("Released");

	}

	public static void main(String[] args) {
		new KeyEvent();
	}

}
