package cwd.lamdaFunction;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class MyWin {

	public static void main(String[] args) {

		// Window Object ----> Object using Jframe
		JFrame frame = new JFrame("My Window is ");
		frame.setSize(400, 500);
		frame.setLayout(new FlowLayout());

//		ActionListener

		// Create button using JButton
		JButton button = new JButton("Click Me");
		// Adding Action Listener to it ...
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.print("Button Clicked");
				JOptionPane.showMessageDialog(null, "HELLO...ButtonClicked");
			}
		});

// Using Lambda Functiion how to create it
//
//		button.addActionListener(ActionEvent e)->{
//			System.out.println("Button Clicked 3333");
//			JOptionPane.showMessageDialog(null, "HEYYYYYYYYY....Clicked");
//		};
		frame.add(button);

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
