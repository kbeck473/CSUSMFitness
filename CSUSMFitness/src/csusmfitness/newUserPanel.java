package csusmfitness;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.Font;

import java.awt.event.*;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;

import java.util.Date;
import java.text.SimpleDateFormat;


public class newUserPanel extends JPanel implements ActionListener  {
	
	private final ButtonGroup sexButtonGroup = new ButtonGroup();
	private final ButtonGroup TierButtonGroup = new ButtonGroup();
	//JPanel panel = new JPanel();
	
	JLabel NewUserTitleLabel, CreateUserFirstNameLabel, CreateUserLastNameLabel;
	
	JTextField CreateUserFirstNameTextbox, CreateUserLastNameTextbox;
	
	JRadioButton MaleSexRaidoButton, OtherSexRaidoButton, rdbtnNewRadioButton_2;
	JLabel NewUserSexLabel, PersonalInfoLabel;
	
	JSpinner spinner, spinner_1, spinner_2;
	JLabel lblNewLabel;
	
	JRadioButton rdbtnNewRadioButton, rdbtnSilver, rdbtnGold;
	
	JButton CreateUserButton;
	
	public newUserPanel() {
		setBackground(new Color(255, 255, 255));
		setMinimumSize(new Dimension(600, 500));
		setBounds(0, 0, 1584, 839);
		setOpaque(false);
		setRequestFocusEnabled(false);
		setFocusTraversalPolicyProvider(true);
		setPreferredSize(new Dimension(667, 439));
		//contentPane.add(panel);
		setLayout(null);
		
		//=====================================================================================
		//CREATE LABELS
		NewUserTitleLabel = new JLabel("CREATE NEW USER");
		NewUserTitleLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		NewUserTitleLabel.setBounds(104, 28, 352, 36);
		add(NewUserTitleLabel);
		
		CreateUserFirstNameLabel = new JLabel("First Name");
		CreateUserFirstNameLabel.setBounds(104, 139, 86, 14);
		add(CreateUserFirstNameLabel);
		
		CreateUserLastNameLabel = new JLabel("Last Name");
		CreateUserLastNameLabel.setBounds(104, 171, 61, 14);
		add(CreateUserLastNameLabel);
		
		//=====================================================================================
		//NAME TEXT FIELDS
		CreateUserFirstNameTextbox = new JTextField(); //First Name text field
		CreateUserFirstNameTextbox.setBounds(200, 136, 184, 20);
		add(CreateUserFirstNameTextbox);
		CreateUserFirstNameTextbox.setColumns(10);
		
		CreateUserLastNameTextbox = new JTextField(); //Last Name text field
		CreateUserLastNameTextbox.setBounds(200, 168, 184, 20);
		add(CreateUserLastNameTextbox);
		CreateUserLastNameTextbox.setColumns(10);
		
		//=====================================================================================
		//SEX CHOICE
		MaleSexRaidoButton = new JRadioButton("Male "); // male choice for sex
		sexButtonGroup.add(MaleSexRaidoButton);
		MaleSexRaidoButton.setBounds(200, 217, 61, 23);
		add(MaleSexRaidoButton);
		
		OtherSexRaidoButton = new JRadioButton("Female"); //female choice for sex
		sexButtonGroup.add(OtherSexRaidoButton);
		OtherSexRaidoButton.setBounds(263, 217, 66, 23);
		add(OtherSexRaidoButton);
		
		rdbtnNewRadioButton_2 = new JRadioButton("Other"); //other choice for sex
		sexButtonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(347, 217, 73, 23);
		add(rdbtnNewRadioButton_2);
		
		NewUserSexLabel = new JLabel("Sex");
		NewUserSexLabel.setBounds(104, 221, 46, 14);
		add(NewUserSexLabel);
		
		PersonalInfoLabel = new JLabel("Personal Info");
		PersonalInfoLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		PersonalInfoLabel.setBounds(185, 78, 189, 54);
		add(PersonalInfoLabel);
		
		//=====================================================================================
		//SET OF CREATE SPINNERS -- THIS IS FOR THE MENUS FOR BIRTHDAYS!
		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spinner.setBounds(200, 261, 39, 20);
		add(spinner);
		
		spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		spinner_1.setBounds(263, 261, 39, 20);
		add(spinner_1);
		
		spinner_2 = new JSpinner();
		spinner_2.setModel(new SpinnerNumberModel(1900, 1900, 2050, 1));
		spinner_2.setBounds(335, 261, 49, 20);
		add(spinner_2);
		
		lblNewLabel = new JLabel("Birthdate (M/D/Y)");
		lblNewLabel.setBounds(104, 264, 86, 13);
		add(lblNewLabel);
		
		//=====================================================================================
		//MEMBERSHIP TIERS
		rdbtnNewRadioButton = new JRadioButton("Bronze");
		rdbtnNewRadioButton.setForeground(new Color(128, 64, 0));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnNewRadioButton.setBounds(200, 303, 103, 21);
		add(rdbtnNewRadioButton);
		
		rdbtnSilver = new JRadioButton("Silver");
		rdbtnSilver.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtnSilver.setForeground(Color.GRAY);
		rdbtnSilver.setBounds(317, 303, 67, 21);
		add(rdbtnSilver);
		
		rdbtnGold = new JRadioButton("Gold");
		rdbtnGold.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnGold.setBackground(new Color(192, 192, 192));
		rdbtnGold.setForeground(new Color(253, 242, 34));
		rdbtnGold.setBounds(402, 304, 103, 21);
		add(rdbtnGold);
		
		//=====================================================================================
		//Button to send info to DBQuery class
		CreateUserButton = new JButton("Create User");
		CreateUserButton.setBounds(263, 372, 113, 21);
		
		CreateUserButton.addActionListener(this);
		add(CreateUserButton);
		
		
	}
	public void actionPerformed(ActionEvent e){
		String firstName = "";
		String lastName = "";
		String sex = "";
		String birthday = "";
		String tier = "";
		String day, month, year;
		if(e.getSource() == CreateUserButton) {
			if(CreateUserFirstNameTextbox.getText() == "") 
				System.out.println("Please enter in a proper first name");
			else
				firstName = CreateUserFirstNameTextbox.getText();
			
			if(CreateUserLastNameTextbox.getText() == "")
				System.out.println("Please enter in a proper last name");
			else
				lastName = CreateUserLastNameTextbox.getText();
			
			if(MaleSexRaidoButton.isSelected())
				sex = "Male";
			else if(OtherSexRaidoButton.isSelected())
				sex = "Female";
			else if(rdbtnNewRadioButton_2.isSelected())
				sex = "Other";
			
			int dayConvert = Integer.parseInt(spinner.getValue().toString());
			day = (dayConvert < 10 ? "0" : "") + dayConvert;
			
			int monthConvert = Integer.parseInt(spinner_1.getValue().toString());
			month = (monthConvert < 10 ? "0" : "") + monthConvert;
			
			year = spinner_2.getValue().toString();
			birthday = month + "/" + day + "/" + year;
			
			if(rdbtnNewRadioButton.isSelected())
				tier = "Bronze";
			else if(rdbtnSilver.isSelected())
				tier = "Silver";
			else if (rdbtnGold.isSelected())
				tier = "Gold";
			
			DbQuery newUser = new DbQuery();
			
			try {
				newUser.newUserQuery(firstName, lastName, sex, birthday, tier);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}
}
