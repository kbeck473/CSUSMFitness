package csusmfitness;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;

public class newUserPanel extends JPanel  {
	
	JPanel panel = new JPanel();
	private final ButtonGroup sexButtonGroup = new ButtonGroup();
	
	public newUserPanel() {
		panel.setBounds(0, 0, 1584, 839);
		panel.setOpaque(false);
		panel.setRequestFocusEnabled(false);
		panel.setFocusTraversalPolicyProvider(true);
		panel.setPreferredSize(new Dimension(698, 508));
		//contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel NewUserTitleLabel = new JLabel("CREATE NEW USER");
		NewUserTitleLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		NewUserTitleLabel.setBounds(104, 28, 352, 36);
		panel.add(NewUserTitleLabel);
		
		JLabel CreateUserFirstNameLabel = new JLabel("First Name");
		CreateUserFirstNameLabel.setBounds(104, 139, 86, 14);
		panel.add(CreateUserFirstNameLabel);
		
		JLabel CreateUserLastNameLabel = new JLabel("Last Name");
		CreateUserLastNameLabel.setBounds(104, 171, 61, 14);
		panel.add(CreateUserLastNameLabel);
		
		JTextField CreateUserFirstNameTextbox = new JTextField();
		CreateUserFirstNameTextbox.setBounds(200, 136, 184, 20);
		panel.add(CreateUserFirstNameTextbox);
		CreateUserFirstNameTextbox.setColumns(10);
		
		JTextField CreateUserLastNameTextbox = new JTextField();
		CreateUserLastNameTextbox.setBounds(200, 168, 184, 20);
		panel.add(CreateUserLastNameTextbox);
		CreateUserLastNameTextbox.setColumns(10);
		
		JRadioButton MaleSexRaidoButton = new JRadioButton("Male ");
		sexButtonGroup.add(MaleSexRaidoButton);
		MaleSexRaidoButton.setBounds(200, 217, 61, 23);
		panel.add(MaleSexRaidoButton);
		
		JRadioButton OtherSexRaidoButton = new JRadioButton("Female");
		sexButtonGroup.add(OtherSexRaidoButton);
		OtherSexRaidoButton.setBounds(263, 217, 66, 23);
		panel.add(OtherSexRaidoButton);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Other");
		sexButtonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(347, 217, 73, 23);
		panel.add(rdbtnNewRadioButton_2);
		
		JLabel NewUserSexLabel = new JLabel("Sex");
		NewUserSexLabel.setBounds(104, 221, 46, 14);
		panel.add(NewUserSexLabel);
		
		JLabel PersonalInfoLabel = new JLabel("Personal Info");
		PersonalInfoLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		PersonalInfoLabel.setBounds(185, 78, 189, 54);
		panel.add(PersonalInfoLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spinner.setBounds(200, 261, 39, 20);
		panel.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(1, 0, 31, 1));
		spinner_1.setBounds(263, 261, 39, 20);
		panel.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(1900, 1900, 2050, 1));
		spinner_2.setBounds(335, 261, 49, 20);
		panel.add(spinner_2);
		
		JLabel lblNewLabel = new JLabel("Birthdate (M/D/Y)");
		lblNewLabel.setBounds(104, 264, 86, 13);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.setBounds(10, 10, 85, 21);
		panel.add(btnNewButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Bronze");
		rdbtnNewRadioButton.setForeground(new Color(128, 64, 0));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnNewRadioButton.setBounds(200, 303, 103, 21);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnSilver = new JRadioButton("Silver");
		rdbtnSilver.setBounds(317, 303, 103, 21);
		panel.add(rdbtnSilver);
		
		JRadioButton rdbtnGold = new JRadioButton("Gold");
		rdbtnGold.setBounds(442, 303, 103, 21);
		panel.add(rdbtnGold);
	}
}
