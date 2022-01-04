package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class charSel extends JPanel {
	private PanelChange ch;
	private JButton[] charbtn = new JButton[10];
	public JLabel[] charlb = new JLabel[10];
	public ImageIcon[] charImg =new ImageIcon[10];
	public int phase = 1; //현재 단계(캐릭터 보유 개수)
	public int charidx = 0;

	
	public charSel(PanelChange ch) {
		this.ch = ch;
		setLayout(null);
		charImg[0] = new ImageIcon("Images//Azir.png");
		charImg[1] = new ImageIcon("Images//Ryze.png");
		charImg[2] = new ImageIcon("Images//Akali.png");
		charImg[3] = new ImageIcon("Images//Yone.png");
		charImg[4] = new ImageIcon("Images//Yasuo.png");
		charImg[5] = new ImageIcon("Images//Sylas.png");
		charImg[6] = new ImageIcon("Images//Leblanc.png");
		charImg[7] = new ImageIcon("Images//Vex.png");
		charImg[8] = new ImageIcon("Images//Zed.png");
		charImg[9] = new ImageIcon("Images//Viktor.png"); //각각의 캐릭터 초상화
		for(int i = 0; i < 10; i++) {
			charlb[i] = new JLabel();
			charlb[i].setIcon(charImg[i]);
		}
		for(int i = 0; i < 5; i++) {
			charbtn[i] = new JButton();
			charbtn[i].setBounds(190 + 200 * i, 200, 100, 40);
			charlb[i].setBounds(190 + 200 * i, 100, 100, 100);
			add(charbtn[i]);
			add(charlb[i]);
		}
		for(int i = 5; i < 10; i++) {
			charbtn[i] = new JButton();
			charbtn[i].setBounds(190 + 200 * (i - 5), 500, 100, 40);
			charlb[i].setBounds(190 + 200 * (i - 5), 400, 100, 100);
			add(charbtn[i]);
			add(charlb[i]);
		}
		
		for(int i = 1; i < 10; i++) {
			charbtn[i].setEnabled(false);
		} //처음에 캐릭터 아지르 제외 비활성화
		
		if(phase == 2) {
			charbtn[1].setEnabled(true);
		} //phase 가 2가 되면 라이즈 해금, 순차적임
		if(phase == 3) {
			charbtn[2].setEnabled(true);
		}
		if(phase == 4) {
			charbtn[3].setEnabled(true);
		}
		if(phase == 5) {
			charbtn[4].setEnabled(true);
		}
		if(phase == 6) {
			charbtn[5].setEnabled(true);
		}
		if(phase == 7) {
			charbtn[6].setEnabled(true);
		}
		if(phase == 8) {
			charbtn[7].setEnabled(true);
		}
		if(phase == 9) {
			charbtn[8].setEnabled(true);
		}
		if(phase == 10) {
			charbtn[9].setEnabled(true);
		}

		/*char1.setOpaque(false);
		char1.setContentAreaFilled(false);
		char1.setBorderPainted(false);*/
		
		for(int i = 0; i < 10; i++) {
			charbtn[i].addActionListener(new StartListener());	
		}
	}
	
	class StartListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == charbtn[0]) {
				ch.mainGame = new mainGame(ch);
			}
			else if (e.getSource() == charbtn[1]) {
				ch.charSel.charidx = 1;
				ch.mainGame = new mainGame(ch); //이 때 메인게임 객체를 만들어줘야 초상화가 잘 반영됨
			}
			else if (e.getSource() == charbtn[8]) {
				ch.charSel.charidx = 8;
				ch.mainGame = new mainGame(ch);
			}
			
			ch.change("tomainGame");
		}
	}
}
