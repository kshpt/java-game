package Game;

import javax.swing.*;
import java.awt.*;


public class Main {

	public static void main(String[] args) {
		
		PanelChange ch = new PanelChange();
		ch.setSize(1280, 720);
		Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension dimen1 = ch.getSize();
		int xpos = (int)(dimen.getWidth()/2 - dimen1.getWidth()/2);
		int ypos = (int)(dimen.getHeight()/2 - dimen1.getHeight()/2);
		ch.setLocation(xpos, ypos);
		
		
		ch.setTitle("롤 턴제 RPG 게임 만들기");
		ch.startPanel = new startPanel(ch);
		ch.charSel = new charSel(ch);
		//mainGame 객체는 캐릭터를 바꿀 때 마다 생김
		ch.myChar = new Char(ch);
		
		
		ch.add(ch.startPanel);
		ch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ch.pack();
		ch.setVisible(true);
		
		
	}

}
