package csusmfitness;

import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//test
import javax.swing.JButton;

public class viewUserPanel extends JPanel implements ActionListener {
	private JTextField textField;
	
//test for push
	/**
	 * Create the panel.
	 */
	JLabel UserDOBLabel;
	JLabel UserNameLabel;
	JLabel UserSexLabel;
	JLabel TeirLabel;
	JLabel Statuslabel;
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
		
		UserNameLabel = new JLabel("first");
		UserNameLabel.setBounds(171, 148, 120, 14);
		add(UserNameLabel);
		
		JLabel lblNewLabel_4 = new JLabel("DOB");
		lblNewLabel_4.setBounds(86, 225, 46, 14);
		add(lblNewLabel_4);
		
		 UserDOBLabel = new JLabel("01/01/01");
		UserDOBLabel.setBounds(171, 225, 46, 14);
		add(UserDOBLabel);
		
		JLabel lblNewLabel_6 = new JLabel("Member level");
		lblNewLabel_6.setBounds(83, 264, 65, 14);
		add(lblNewLabel_6);
		
		 TeirLabel = new JLabel("MembershipTier");
		TeirLabel.setBounds(171, 264, 137, 14);
		add(TeirLabel);
		
		JLabel lblNewLabel_4_1 = new JLabel("Sex");
		lblNewLabel_4_1.setBounds(86, 184, 46, 14);
		add(lblNewLabel_4_1);
		
		UserSexLabel = new JLabel("User Sex");
		UserSexLabel.setBounds(171, 184, 112, 14);
		add(UserSexLabel);
		
		JLabel lblNewLabel_8 = new JLabel("Check in status");
		lblNewLabel_8.setBounds(83, 302, 73, 14);
		add(lblNewLabel_8);
		
		 Statuslabel = new JLabel("in/out");
		Statuslabel.setBounds(183, 302, 46, 14);
		add(Statuslabel);

	}
	
	public void actionPerformed(ActionEvent e) {
		int passID = Integer.parseInt(textField.getText());
		DbQuery b = new DbQuery();
		try {
			UserInfo displayedUser = b.viewUserDataQuery(passID);
			updateView(displayedUser);
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void updateView(UserInfo user) {
		
		//System.out.print(user.FirstName);
		UserNameLabel.setText(user.FirstName + " " + user.LastName);
		UserDOBLabel.setText(user.Birthday);
		 UserSexLabel.setText(user.Sex);
		TeirLabel.setText(user.Membership);
		 Statuslabel.setText(user.curStatus);
	}
}
