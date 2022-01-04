package Game;

import javax.swing.*;

public class PanelChange extends JFrame {
	
	public startPanel startPanel = null;
	public mainGame mainGame = null;
	public char1Panel char1Panel = null;
	
	public void change(String panelName) {
		if(panelName.equals("tomainGame")) {
			getContentPane().removeAll();
			getContentPane().add(mainGame);
			revalidate();
			repaint();
		}
		else if(panelName.equals("tochar1Panel")) {
			getContentPane().removeAll();
			getContentPane().add(char1Panel);
			revalidate();
			repaint();
		}
	}
}


