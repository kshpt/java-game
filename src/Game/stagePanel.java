package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class stagePanel extends JPanel {
	private PanelChange ch;
	public JLabel myPort = new JLabel();
	public JLabel enemyPort = new JLabel();
	public JButton AD = new JButton("∆Ú≈∏");
	public JButton skillQ = new JButton("Q");
	public JLabel enemyHP; 
	
	public stagePanel(PanelChange ch) {
		setLayout(null);
		this.ch = ch;
		myPort.setIcon(ch.charSel.charImg[ch.charSel.charidx]);
		enemyPort.setIcon(ch.fightSel.charImg[ch.fightSel.charidx]);
		myPort.setBounds(190, 100, 100, 100);
		enemyPort.setBounds(990, 100, 100, 100);
		add(myPort);
		add(enemyPort);
		AD.setBounds(190, 300, 100, 50);
		skillQ.setBounds(190, 400, 100, 50);
		add(AD);
		add(skillQ);
		AD.addActionListener(new ADListener());
		if(ch.fightSel.charidx == 0) {
			enemyHP = new JLabel("HP : " + ch.enemyAzir.HP);
			enemyHP.setBounds(990, 300, 100, 100);
			add(enemyHP);
		}
		else if(ch.fightSel.charidx == 1) {
			enemyHP = new JLabel("HP : " + ch.enemyRyze.HP);
			enemyHP.setBounds(990, 300, 100, 100);
			add(enemyHP);
		}
		else if(ch.fightSel.charidx == 2) {
			enemyHP = new JLabel("HP : " + ch.enemyAkali.HP);
			enemyHP.setBounds(990, 300, 100, 100);
			add(enemyHP);
		}
	}
	
	class ADListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(ch.charSel.charidx == 0) {
				if(e.getSource() == AD) {
					ch.azir.Azir_AD();
					
				}
				//else if(e.getSource() == )
			}
			else if(ch.charSel.charidx == 1) {
				
			}
		}
	}
}
