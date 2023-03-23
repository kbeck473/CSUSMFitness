package csusmfitness;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JMenuBar;


public class Frame extends JFrame implements ActionListener{
		
	
	
	Frame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000,500);
		this.setLayout(new FlowLayout());
		
		JMenuBar menubar = new JMenuBar();  // creates menubar
		this.setJMenuBar(menubar);//adds menubar to frame
		
		
		
		this.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}