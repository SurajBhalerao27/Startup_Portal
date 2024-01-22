package com.profound.awt;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Scrollbar;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class ScrollBar extends Frame implements ActionListener {

	Scrollbar s;
	TextField f;

	public ScrollBar() {

		setLayout(new FlowLayout());
		setSize(400, 600);
		setVisible(true);

		s = new Scrollbar(0, 10, 50, 1, 200); // Starting number is it indicate whether it is horizontal or vertical
												// 0 for horizontal and 1 for vertical

		f = new TextField(50);

		add(f);
		add(s);
		try {
			s.addAdjustmentListener((AdjustmentListener) this); // in this line typecast is used to allocating and try
																// catch is used to supress the warnings
		} catch (Exception e) {

		}

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		f.setText(" " + s.getValue());

	}

	public static void main(String[] args) {
		new ScrollBar();
	}

}
