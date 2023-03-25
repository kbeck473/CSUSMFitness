package SwingUI;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JPanel  {
	
	JPanel currentHomePanel = new JPanel();
	
	public HomePage() {
		currentHomePanel.setBounds(0, 0, 1584, 839);
		currentHomePanel.setOpaque(false);
		currentHomePanel.setRequestFocusEnabled(false);
		currentHomePanel.setFocusTraversalPolicyProvider(true);
		currentHomePanel.setPreferredSize(new Dimension(698, 508));
		//contentPane.add(panel);
		currentHomePanel.setLayout(null);
		
		JLabel HomeTitle = new JLabel("CSUSM MMS");
		HomeTitle.setFont(new Font("Tahoma", Font.BOLD, 36));
		HomeTitle.setBounds(177, 27, 226, 36);
		currentHomePanel.add(HomeTitle);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(371, 167, 85, 21);
		currentHomePanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(253, 167, 85, 21);
		currentHomePanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New User");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print("New User ");
				currentHomePanel.setVisible(false);
			
				//currentNewUserPanel.setVisible(true);			
				
				
				
			}
		});
		btnNewButton_2.setBounds(133, 167, 85, 21);
		currentHomePanel.add(btnNewButton_2);
	}
}
