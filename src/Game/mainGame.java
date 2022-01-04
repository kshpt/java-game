package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class mainGame extends JPanel {
	private PanelChange ch;
	public JLabel charPortrait = new JLabel();

	
	public mainGame(PanelChange ch) {
		setLayout(null);
		this.ch = ch;
		charPortrait.setIcon(ch.charSel.charImg[ch.charSel.charidx]);
		charPortrait.setBounds(190, 100, 100, 100);
		add(charPortrait);
	}

}
