package csusmfitness;

import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class JFrame extends javax.swing.JFrame {

	private JPanel contentPane;
	private JTextField CreateUserFirstNameTextbox;
	private JTextField CreateUserLastNameTextbox;
	private final ButtonGroup sexButton = new ButtonGroup();
	private JLabel CreateUserLastNameLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
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
	public JFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("MMS ACTIIONS");
		menuBar.add(mnNewMenu);
		contentPane = new JPanel();
		contentPane.setMinimumSize(new Dimension(500, 500));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1584, 839);
		panel.setOpaque(false);
		panel.setRequestFocusEnabled(false);
		panel.setFocusTraversalPolicyProvider(true);
		panel.setPreferredSize(new Dimension(500, 500));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel NewUserTitleLabel = new JLabel("CREATE NEW USER");
		NewUserTitleLabel.setFont(new Font("Tahoma", Font.BOLD, 36));
		NewUserTitleLabel.setBounds(104, 31, 352, 36);
		panel.add(NewUserTitleLabel);
		
		JLabel CreateUserFirstNameLabel = new JLabel("First Name");
		CreateUserFirstNameLabel.setBounds(104, 139, 86, 14);
		panel.add(CreateUserFirstNameLabel);
		
		CreateUserLastNameLabel = new JLabel("Last Name");
		CreateUserLastNameLabel.setBounds(104, 171, 61, 14);
		panel.add(CreateUserLastNameLabel);
		
		CreateUserFirstNameTextbox = new JTextField();
		CreateUserFirstNameTextbox.setBounds(200, 136, 184, 20);
		panel.add(CreateUserFirstNameTextbox);
		CreateUserFirstNameTextbox.setColumns(10);
		
		CreateUserLastNameTextbox = new JTextField();
		CreateUserLastNameTextbox.setBounds(200, 168, 184, 20);
		panel.add(CreateUserLastNameTextbox);
		CreateUserLastNameTextbox.setColumns(10);
		
		JRadioButton MaleSexRaidoButton = new JRadioButton("Male ");
		sexButton.add(MaleSexRaidoButton);
		MaleSexRaidoButton.setBounds(200, 217, 61, 23);
		panel.add(MaleSexRaidoButton);
		
		JRadioButton OtherSexRaidoButton = new JRadioButton("Female");
		sexButton.add(OtherSexRaidoButton);
		OtherSexRaidoButton.setBounds(263, 217, 66, 23);
		panel.add(OtherSexRaidoButton);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Other");
		sexButton.add(rdbtnNewRadioButton_2);
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
		spinner_1.setBounds(263, 261, 39, 20);
		panel.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(335, 261, 39, 20);
		panel.add(spinner_2);
	}
}
