package csusmfitness;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class viewUserPanel extends JPanel implements ActionListener {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public viewUserPanel(){
		setMinimumSize(new Dimension(600, 500));
		setLayout(null);
		
		textField = new JTextField(); // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
		textField.setBounds(158, 101, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID Number");
		lblNewLabel.setBounds(83, 104, 65, 14);
		add(lblNewLabel);
		
		JLabel viewUserTitle = new JLabel("View User");
		viewUserTitle.setFont(new Font("Tahoma", Font.PLAIN, 30));
		viewUserTitle.setBounds(171, 11, 190, 56);
		add(viewUserTitle);
		
		JButton btnNewButton = new JButton("search");
		btnNewButton.setBounds(264, 100, 89, 23);
		add(btnNewButton);
		
		btnNewButton.addActionListener((ActionListener) this);
		
		JLabel lblNewLabel_1 = new JLabel("Name ");
		lblNewLabel_1.setBounds(86, 148, 46, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("first");
		lblNewLabel_2.setBounds(171, 148, 46, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Last");
		lblNewLabel_3.setBounds(208, 148, 46, 14);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("DOB");
		lblNewLabel_4.setBounds(86, 225, 46, 14);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("01/01/01");
		lblNewLabel_5.setBounds(171, 225, 46, 14);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Member level");
		lblNewLabel_6.setBounds(83, 264, 65, 14);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("MembershipTier");
		lblNewLabel_7.setBounds(171, 264, 120, 14);
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_4_1 = new JLabel("Sex");
		lblNewLabel_4_1.setBounds(86, 184, 46, 14);
		add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("User Sex");
		lblNewLabel_5_1.setBounds(171, 184, 46, 14);
		add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_8 = new JLabel("Check in status");
		lblNewLabel_8.setBounds(83, 302, 73, 14);
		add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("in/out");
		lblNewLabel_9.setBounds(183, 302, 46, 14);
		add(lblNewLabel_9);

	}
	
	public void actionPerformed(ActionEvent e) {
		int passID = Integer.parseInt(textField.getText());
		DbQuery b = new DbQuery();
		try {
			b.viewUserDataQuery(passID);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
