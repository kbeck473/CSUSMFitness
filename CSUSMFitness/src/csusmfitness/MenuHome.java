package csusmfitness;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.ComponentOrientation;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;

public class MenuHome extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTabbedPane tabbedPane;
	private final ButtonGroup SexButtonGroup = new ButtonGroup();
	private final ButtonGroup TeirButtonGroup = new ButtonGroup();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuHome frame = new MenuHome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1187, 754);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1171, 715);
		contentPane.add(panel);
		panel.setLayout(null);
		
		 tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		tabbedPane.setBounds(255, 53, 916, 662);
		panel.add(tabbedPane);
		
		JPanel WelcomeSplash = new JPanel();
		tabbedPane.addTab("New tab", null, WelcomeSplash, null);
		WelcomeSplash.setLayout(null);
		
		JLabel welcomebanner = new JLabel("Welcome to CSUSM MMS");
		welcomebanner.setFont(new Font("Tahoma", Font.BOLD, 30));
		welcomebanner.setBounds(237, 0, 390, 66);
		WelcomeSplash.add(welcomebanner);
		
		JLabel lblNewLabel_2 = new JLabel("Please make a selection from the buttons on the left");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(182, 94, 521, 66);
		WelcomeSplash.add(lblNewLabel_2);
		
		
		// START OF NEW USER PANE
		JPanel newUserPane = new JPanel();
		newUserPane.setBackground(Color.WHITE);
		newUserPane.setLayout(null);
		newUserPane.setRequestFocusEnabled(false);
		newUserPane.setPreferredSize(new Dimension(698, 508));
		newUserPane.setOpaque(false);
		newUserPane.setFocusTraversalPolicyProvider(true);
		tabbedPane.addTab("New tab", null, newUserPane, null);
		
		JLabel NewUserTitleLabel = new JLabel("CREATE NEW USER");
		NewUserTitleLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		NewUserTitleLabel.setBounds(56, 11, 352, 36);
		newUserPane.add(NewUserTitleLabel);
		
		JLabel CreateUserFirstNameLabel = new JLabel("First Name");
		CreateUserFirstNameLabel.setBounds(56, 122, 86, 14);
		newUserPane.add(CreateUserFirstNameLabel);
		
		JLabel CreateUserLastNameLabel = new JLabel("Last Name");
		CreateUserLastNameLabel.setBounds(56, 154, 61, 14);
		newUserPane.add(CreateUserLastNameLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(152, 119, 184, 20);
		newUserPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(152, 151, 184, 20);
		newUserPane.add(textField_1);
		
		JRadioButton MaleSexRaidoButton = new JRadioButton("Male ");
		SexButtonGroup.add(MaleSexRaidoButton);
		MaleSexRaidoButton.setBounds(152, 200, 61, 23);
		newUserPane.add(MaleSexRaidoButton);
		
		JRadioButton OtherSexRaidoButton = new JRadioButton("Female");
		SexButtonGroup.add(OtherSexRaidoButton);
		OtherSexRaidoButton.setBounds(215, 200, 66, 23);
		newUserPane.add(OtherSexRaidoButton);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Other");
		SexButtonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(299, 200, 73, 23);
		newUserPane.add(rdbtnNewRadioButton_2);
		
		JLabel NewUserSexLabel = new JLabel("Sex");
		NewUserSexLabel.setBounds(56, 204, 46, 14);
		newUserPane.add(NewUserSexLabel);
		
		JLabel PersonalInfoLabel = new JLabel("Personal Info");
		PersonalInfoLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		PersonalInfoLabel.setBounds(137, 61, 189, 54);
		newUserPane.add(PersonalInfoLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(152, 244, 39, 20);
		newUserPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(215, 244, 39, 20);
		newUserPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(287, 244, 49, 20);
		newUserPane.add(spinner_2);
		
		JLabel lblNewLabel_1 = new JLabel("Birthdate (M/D/Y)");
		lblNewLabel_1.setBounds(56, 247, 86, 13);
		newUserPane.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Bronze");
		TeirButtonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setForeground(new Color(128, 64, 0));
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnNewRadioButton.setBounds(152, 286, 86, 21);
		newUserPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnSilver = new JRadioButton("Silver");
		TeirButtonGroup.add(rdbtnSilver);
		rdbtnSilver.setForeground(Color.GRAY);
		rdbtnSilver.setBounds(269, 286, 67, 21);
		newUserPane.add(rdbtnSilver);
		
		JRadioButton rdbtnGold = new JRadioButton("Gold");
		TeirButtonGroup.add(rdbtnGold);
		rdbtnGold.setForeground(new Color(253, 242, 34));
		rdbtnGold.setBounds(354, 287, 103, 21);
		newUserPane.add(rdbtnGold);
		//  END OF NEW USER PANEL		
		
		
		
		
		//START OF PUTTON PANNEL
		JPanel ViewUserPanel = new JPanel();
		tabbedPane.addTab("New tab", null, ViewUserPanel, null);
		
		JLabel lblNewLabel_3 = new JLabel("View Uer");
		ViewUserPanel.add(lblNewLabel_3);
		
		JPanel sideBar = new JPanel();
		sideBar.setBackground(new Color(95, 185, 245));
		sideBar.setBounds(0, 53, 255, 662);
		panel.add(sideBar);
		sideBar.setLayout(null);
		
		JPanel sideBarButtonPanel_0 = new JPanel();
		sideBarButtonPanel_0.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
				
			}
		});
		
		sideBarButtonPanel_0.setBounds(0, 40, 255, 77);
		sideBar.add(sideBarButtonPanel_0);
		
		JLabel CreateNewUserLabel = new JLabel("Create New User");
	
		CreateNewUserLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		sideBarButtonPanel_0.add(CreateNewUserLabel);
		
		JPanel sideBarButtonPanel_1 = new JPanel();
		sideBarButtonPanel_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(2);

			}
		});
		sideBarButtonPanel_1.setBounds(0, 128, 255, 77);
		sideBar.add(sideBarButtonPanel_1);
		
		JLabel lblViewUsers = new JLabel("View Users");
		lblViewUsers.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		sideBarButtonPanel_1.add(lblViewUsers);
		
		JPanel sideBarButtonPanel_2 = new JPanel();
		sideBarButtonPanel_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(3);

			}
		});
		sideBarButtonPanel_2.setBounds(0, 216, 255, 77);
		sideBar.add(sideBarButtonPanel_2);
		
		JLabel lblDeleteUser = new JLabel("Delete user");
		lblDeleteUser.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		sideBarButtonPanel_2.add(lblDeleteUser);
		
		JPanel sideBarButtonPanel_3 = new JPanel();
		sideBarButtonPanel_3.setBounds(0, 304, 255, 77);
		sideBar.add(sideBarButtonPanel_3);
		
		JLabel lblCo = new JLabel("Comming Soon");
		lblCo.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		sideBarButtonPanel_3.add(lblCo);
		
		JPanel sideBarButtonPanel_4 = new JPanel();
		sideBarButtonPanel_4.setBounds(0, 392, 255, 77);
		sideBar.add(sideBarButtonPanel_4);
		
		JLabel lblCommingSoon = new JLabel("Comming Soon");
		lblCommingSoon.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		sideBarButtonPanel_4.add(lblCommingSoon);
		//END OF PUTTON PANNEL

		//START OF HEAD BAR

		JPanel topBar = new JPanel();
		topBar.setBounds(0, 0, 1171, 53);
		panel.add(topBar);
		topBar.setBackground(new Color(128, 128, 128));
		topBar.setLayout(null);

		JLabel lblNewLabel = new JLabel("CSUSM MMS");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(0);

			}
		});


		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 40));
		lblNewLabel.setBounds(26, 11, 313, 30);
		topBar.add(lblNewLabel);
		
		tabbedPane.setSelectedIndex(0);
		
		JPanel DeleteUserPanel = new JPanel();
		tabbedPane.addTab("New tab", null, DeleteUserPanel, null);
		
		JLabel lblNewLabel_4 = new JLabel("DeleteUser");
		DeleteUserPanel.add(lblNewLabel_4);

		
		
		
	}
	
	

}


