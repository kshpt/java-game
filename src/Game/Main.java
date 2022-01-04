package Game;

import javax.swing.*;


public class Main {

	public static void main(String[] args) {
		
		PanelChange ch = new PanelChange();
		ch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ch.setTitle("RPG 게임 만들기");
		ch.startPanel = new startPanel(ch);
		ch.mainGame = new mainGame(ch);
		ch.char1Panel = new char1Panel(ch);
		
		ch.add(ch.startPanel);
		ch.pack();
		ch.setVisible(true);
		
	}

}
