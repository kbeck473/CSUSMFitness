package csusmfitness;

import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CheckInOut extends JPanel{
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public CheckInOut() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(218, 109, 86, 20);
		add(textField);
		
		JLabel lblNewLabel = new JLabel("ID Number");
		lblNewLabel.setBounds(143, 112, 65, 14);
		add(lblNewLabel);
		
		JLabel lblCheckInout = new JLabel("Check in/Out");
		lblCheckInout.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCheckInout.setBounds(164, 32, 190, 56);
		add(lblCheckInout);
		
		JButton btnIn = new JButton("CHANGE STATUS");
		btnIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int passID = Integer.parseInt(textField.getText());
				DbQuery b = new DbQuery();
				try {
					b.checkInOutQuery(passID);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnIn.setBounds(129, 182, 89, 23);
		add(btnIn);
		
		JButton btnNewButton = new JButton("Out");
		btnNewButton.setBounds(259, 182, 89, 23);
		add(btnNewButton);

	}

}
