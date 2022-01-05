package Game;

import java.awt.Dimension;

import javax.swing.*;

public class PanelChange extends JFrame {
	
	public startPanel startPanel = null;
	public charSel charSel = null;
	public mainGame mainGame = null;
	public fightSel fightSel = null;
	public stagePanel stagePanel = null;
	public Azir enemyAzir = null;
	public Azir azir = null;
	public Ryze enemyRyze = null;
	public Ryze ryze = null;
	public Akali enemyAkali = null;
	public Akali akali = null;
	
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
		else if(panelName.equals("tofightSel")) {
			getContentPane().removeAll();
			getContentPane().add(fightSel);
			revalidate();
			repaint();
		}
		else if(panelName.equals("tostagePanel")) {
			getContentPane().removeAll();
			getContentPane().add(stagePanel);
			revalidate();
			repaint();
		}
		
	}
}


