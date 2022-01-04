package Game;

import java.awt.Dimension;

import javax.swing.*;

public class PanelChange extends JFrame {
	
	public startPanel startPanel = null;
	public charSel charSel = null;
	public mainGame mainGame = null;
	
	public void change(String panelName) {
		if(panelName.equals("tocharSel")) {
			getContentPane().removeAll();
			getContentPane().add(charSel);
			revalidate();
			repaint();
		}
		else if(panelName.equals("tomainGame")) {
			getContentPane().removeAll();
			getContentPane().add(mainGame);
			revalidate();
			repaint();
		}
	}
}


