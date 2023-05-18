package csusmfitness;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class deleteUserPanel extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public deleteUserPanel() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(202, 101, 86, 20);
		add(textField);
		
		JLabel lblNewLabel = new JLabel("ID Number");
		lblNewLabel.setBounds(127, 104, 65, 14);
		add(lblNewLabel);
		
		JLabel lblDeleteUser = new JLabel("Delete User");
		lblDeleteUser.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblDeleteUser.setBounds(215, 11, 190, 56);
		add(lblDeleteUser);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idInput = Integer.parseInt(textField.getText());
				DbQuery deleteUser = new DbQuery();
				try {
					deleteUser.deleteUserQuery(idInput);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnDelete.setBounds(331, 100, 89, 23);
		add(btnDelete);

	}
}
