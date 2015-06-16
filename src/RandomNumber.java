import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RandomNumber implements ActionListener {
	public JFrame mainFrame = new JFrame();
	public JPanel mainPanel = new JPanel();
	public JTextField TextField1 = new JTextField(15);
	public JTextField TextField2 = new JTextField(15);
	public JTextField TextField3 = new JTextField(15);
	public JButton Button1 = new JButton();

	public static void main(String[] args) {
		RandomNumber a = new RandomNumber();
		a.startCode();
	}

	public void startCode() {
		mainFrame.add(mainPanel);
		mainPanel.add(TextField1);
		mainPanel.add(TextField2);
		mainPanel.add(TextField3);
		mainPanel.add(Button1);

		Button1.setText("Go");
		Button1.addActionListener(this);
		// mainFrame.setSize(800, 800);

		mainFrame.setVisible(true);

		mainFrame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();

		if (buttonPressed == Button1) {
			int randomNum = 0;
			int minimum = 0;
			int maximum = 0;
			// int howManyTimes = 0;

			int Stringtoint1 = Integer.parseInt(TextField1.getText());
			int Stringtoint2 = Integer.parseInt(TextField2.getText());
			int Stringtoint3 = Integer.parseInt(TextField3.getText());
			
			System.out.println(Stringtoint1);
			System.out.println(Stringtoint2);
			System.out.println(Stringtoint3);

			for (int a = 0; a < Stringtoint3; a++) {
			randomNum = minimum + (int) (Math.random() * maximum);
				System.out.println(randomNum);
				
				
		}

			

			JOptionPane.showMessageDialog(null, "Calculating Score");

		}

	}
}
