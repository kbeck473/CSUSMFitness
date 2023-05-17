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

public class MenuHome extends JFrame{

	private JPanel contentPane;
	private JTabbedPane tabbedPane;

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
		final DbQuery b = new DbQuery();
		setTitle("CSUSM MMS (NOT FINAL) SRS SAMPLES");
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
		
		JPanel sideBar = new JPanel();
		sideBar.setBackground(new Color(95, 185, 245));
		sideBar.setBounds(0, 53, 255, 662);
		panel.add(sideBar);
		sideBar.setLayout(null);
		
		JPanel sideBarButtonPanel_0 = new JPanel();
		sideBarButtonPanel_0.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
				try {
					int valOfUsers = b.changeCheckInOut();
					System.out.println("CURRENT NUM USERS: " + valOfUsers);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
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
				try {
					int valOfUsers = b.changeCheckInOut();
					System.out.println("CURRENT NUM USERS: " + valOfUsers);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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
				try {
					int valOfUsers = b.changeCheckInOut();
					System.out.println("CURRENT NUM USERS: " + valOfUsers);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		sideBarButtonPanel_2.setBounds(0, 216, 255, 77);
		sideBar.add(sideBarButtonPanel_2);
		
		JLabel lblDeleteUser = new JLabel("Delete user");
		lblDeleteUser.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		sideBarButtonPanel_2.add(lblDeleteUser);
		
		JPanel sideBarButtonPanel_3 = new JPanel();
		sideBarButtonPanel_3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(4);
				try {
					int valOfUsers = b.changeCheckInOut();
					System.out.println("CURRENT NUM USERS: " + valOfUsers);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		sideBarButtonPanel_3.setBounds(0, 304, 255, 77);
		sideBar.add(sideBarButtonPanel_3);
		
		JLabel lblCo = new JLabel("Check In/Out");
		lblCo.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		sideBarButtonPanel_3.add(lblCo);
		
		JPanel sideBarButtonPanel_4 = new JPanel();
		sideBarButtonPanel_4.setBounds(0, 574, 255, 77);
		sideBar.add(sideBarButtonPanel_4);
		sideBarButtonPanel_4.setLayout(null);
		
		//================================================================
		JLabel lblCommingSoon = new JLabel("Checked In users: 0");
		lblCommingSoon.setBounds(10, 37, 245, 29);
		lblCommingSoon.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		sideBarButtonPanel_4.add(lblCommingSoon);
		//END OF PUTTON PANNEL
		
		//================================================================

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
				try {
					int valOfUsers = b.changeCheckInOut();
					System.out.println("CURRENT NUM USERS: " + valOfUsers);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});


		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 40));
		lblNewLabel.setBounds(26, 11, 313, 30);
		topBar.add(lblNewLabel);
		
		 tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		 tabbedPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		 tabbedPane.setBounds(255, 26, 916, 689);
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
		 
		 
		 //ADDS NewUserPanel
		 newUserPanel newUserPanel_ = new newUserPanel();
		 tabbedPane.addTab("New tab", null, newUserPanel_, null);
		 newUserPanel_.setLayout(null);
		 newUserPanel_.revalidate();
		 
		 viewUserPanel viewUserPanel_ = new viewUserPanel();
		 tabbedPane.addTab("New tab", null, viewUserPanel_, null);
		 
		 tabbedPane.setSelectedIndex(0);
		 
		 deleteUserPanel deleteUserPanel_ = new deleteUserPanel();
		 tabbedPane.addTab("New tab", null, deleteUserPanel_, null);
		 
		 CheckInOut checkInOut = new CheckInOut();
		 tabbedPane.addTab("New tab", null, checkInOut, null);


		
		
		
	}
}


