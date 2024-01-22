package com.profound.awt;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class WindowListener extends Frame implements java.awt.event.WindowListener {
	WindowListener() {
		setLayout(new FlowLayout());
		setSize(500, 500);
		setVisible(true);
		addWindowListener(this);
	}

	public static void main(String[] args) {

		new WindowListener();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("Opened");

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Closing");

	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("Closed");

	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Iconified");

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Deiconified");

	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Activated");

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Deactivated");

	}

}
