package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class startPanel extends JPanel {
	private PanelChange ch;
	private JButton startButton;
	private ImageIcon startButtonImg = new ImageIcon("Images//gameStart.png");


	public startPanel(PanelChange ch) {
		this.ch = ch;
		setLayout(null);
		setPreferredSize(new Dimension(1280, 720));
		startButton = new JButton("");
		startButton.setIcon(startButtonImg);
		startButton.setBounds(550, 320, 175, 53);
		add(startButton);
		
		startButton.addActionListener(new StartListener());
		startButton.setOpaque(false);
		startButton.setContentAreaFilled(false);
		startButton.setBorderPainted(false);
	}
	
	class StartListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == startButton) {
				ch.change("tocharSel");
				
			
			}
		}
	}
}
