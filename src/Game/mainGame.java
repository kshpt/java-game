package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mainGame extends JPanel {
	private PanelChange ch;
	private JButton char1;
	private JLabel char1lb;
	private ImageIcon char1Img = new ImageIcon("Images//Azir.png");
	
	public mainGame(PanelChange ch) {
		this.ch = ch;
		setLayout(null); 
		setPreferredSize(new Dimension(1920, 1080));
		char1 = new JButton("¾ÆÁö¸£");
		char1.setBounds(100, 300, 200, 60);
		char1lb = new JLabel("");
		char1lb.setBounds(100, 100, 200, 200);
		char1lb.setIcon(char1Img);
		add(char1);
		add(char1lb);
		char1.setOpaque(false);
		char1.setContentAreaFilled(false);
		char1.setBorderPainted(false);
		
		
		char1.addActionListener(new StartListener());
	}
	
	class StartListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == char1) {
				ch.change("tochar1Panel");
			}	
		}
	}
}
