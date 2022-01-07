package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class mainGame extends JPanel {
	private PanelChange ch;
	public JLabel charPortrait = new JLabel();
	public JButton Button1;
	public JButton Button2;
	public JLabel GOLD;
	public JLabel HP;
	public JLabel MP;
	public JLabel MoveSpeed;
	public JLabel AttackSpeed;
	public JLabel AttackDamage;
	public JLabel Defense;
	public int GOLD_value = 500;
	public int HP_value;
	public int MP_value;
	public int MoveSpeed_value;
	public int AttackSpeed_value;
	public int AttackDamage_value;
	public int Defense_value;
	
	public mainGame(PanelChange ch) {
		setLayout(null);
		this.ch = ch;
		if(ch.charSel.charidx == 0) {
			HP_value = ch.myChar.Azir_HP;
			MP_value = ch.myChar.Azir_MP;
			MoveSpeed_value = ch.myChar.Azir_MoveSpeed;
			AttackSpeed_value = ch.myChar.Azir_AttackSpeed;
			AttackDamage_value = ch.myChar.Azir_AttackDamage;
			Defense_value = ch.myChar.Azir_Defense;
		}
		else if(ch.charSel.charidx == 1) {
			HP_value = ch.myChar.Ryze_HP;
			MP_value = ch.myChar.Ryze_MP;
			MoveSpeed_value = ch.myChar.Ryze_MoveSpeed;
			AttackSpeed_value = ch.myChar.Ryze_AttackSpeed;
			AttackDamage_value = ch.myChar.Ryze_AttackDamage;
			Defense_value = ch.myChar.Ryze_Defense;
		}
		else if(ch.charSel.charidx == 2) {
			HP_value = ch.myChar.Akail_HP;
			MP_value = ch.myChar.Akail_MP;
			MoveSpeed_value = ch.myChar.Akail_MoveSpeed;
			AttackSpeed_value = ch.myChar.Akail_AttackSpeed;
			AttackDamage_value = ch.myChar.Akail_AttackDamage;
			Defense_value = ch.myChar.Akail_Defense;
		}
		else if(ch.charSel.charidx == 3) {
			HP_value = ch.myChar.Yone_HP;
			MP_value = ch.myChar.Yone_MP;
			MoveSpeed_value = ch.myChar.Yone_MoveSpeed;
			AttackSpeed_value = ch.myChar.Yone_AttackSpeed;
			AttackDamage_value = ch.myChar.Yone_AttackDamage;
			Defense_value = ch.myChar.Yone_Defense;
		}
		else if(ch.charSel.charidx == 4) {
			HP_value = ch.myChar.Yasuo_HP;
			MP_value = ch.myChar.Yasuo_MP;
			MoveSpeed_value = ch.myChar.Yasuo_MoveSpeed;
			AttackSpeed_value = ch.myChar.Yasuo_AttackSpeed;
			AttackDamage_value = ch.myChar.Yasuo_AttackDamage;
			Defense_value = ch.myChar.Yasuo_Defense;
		}
		else if(ch.charSel.charidx == 5) {
			HP_value = ch.myChar.Sylas_HP;
			MP_value = ch.myChar.Sylas_MP;
			MoveSpeed_value = ch.myChar.Sylas_MoveSpeed;
			AttackSpeed_value = ch.myChar.Sylas_AttackSpeed;
			AttackDamage_value = ch.myChar.Sylas_AttackDamage;
			Defense_value = ch.myChar.Sylas_Defense;
		}
		/*else if(ch.charSel.charidx == 6) {
			HP_value = ch.myChar.Azir_HP;
			MP_value = ch.myChar.Azir_MP;
			MoveSpeed_value = ch.myChar.Azir_MoveSpeed;
			AttackSpeed_value = ch.myChar.Azir_AttackSpeed;
			AttackDamage_value = ch.myChar.Azir_AttackDamage;
			Defense_value = ch.myChar.Azir_Defense;
		}*/
		else if(ch.charSel.charidx == 7) {
			HP_value = ch.myChar.Vex_HP;
			MP_value = ch.myChar.Vex_MP;
			MoveSpeed_value = ch.myChar.Vex_MoveSpeed;
			AttackSpeed_value = ch.myChar.Vex_AttackSpeed;
			AttackDamage_value = ch.myChar.Vex_AttackDamage;
			Defense_value = ch.myChar.Vex_Defense;
		}
		else if(ch.charSel.charidx == 8) {
			HP_value = ch.myChar.Zed_HP;
			MP_value = ch.myChar.Zed_MP;
			MoveSpeed_value = ch.myChar.Zed_MoveSpeed;
			AttackSpeed_value = ch.myChar.Zed_AttackSpeed;
			AttackDamage_value = ch.myChar.Zed_AttackDamage;
			Defense_value = ch.myChar.Zed_Defense;
		}
		else if(ch.charSel.charidx == 9) {
			HP_value = ch.myChar.Viktor_HP;
			MP_value = ch.myChar.Viktor_MP;
			MoveSpeed_value = ch.myChar.Viktor_MoveSpeed;
			AttackSpeed_value = ch.myChar.Viktor_AttackSpeed;
			AttackDamage_value = ch.myChar.Viktor_AttackDamage;
			Defense_value = ch.myChar.Viktor_Defense;
		}
		charPortrait.setIcon(ch.charSel.charImg[ch.charSel.charidx]);
		charPortrait.setBounds(190, 100, 100, 100);
		GOLD = new JLabel("GOLD : " + GOLD_value);
		HP = new JLabel("HP : " + HP_value);
		MP = new JLabel("MP : " + MP_value);
		Button1 = new JButton("½Î¿ì·¯°¡±â");
		Button2 = new JButton("»óÁ¡°¡±â");
		MoveSpeed = new JLabel("ÀÌµ¿¼Óµµ : " + MoveSpeed_value);
		AttackSpeed = new JLabel("°ø°Ý¼Óµµ : " + AttackSpeed_value);
		AttackDamage = new JLabel("AD : " + AttackDamage_value);
		Defense = new JLabel("¹æ¾î·Â : " + Defense_value);
		GOLD.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		HP.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		MP.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		MoveSpeed.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		AttackSpeed.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		AttackDamage.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		Defense.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		Button1.setBounds(800, 100, 200, 50);
		Button2.setBounds(800, 200, 200, 50);
		GOLD.setBounds(190, 200, 200, 50);
		HP.setBounds(350, 100, 200, 50);
		MP.setBounds(350, 150, 200, 50);
		MoveSpeed.setBounds(350, 200, 200, 50);
		AttackSpeed.setBounds(350, 250, 200, 50);
		AttackDamage.setBounds(350, 300, 200, 50);
		Defense.setBounds(350, 350, 200, 50);
		add(Button1);
		add(Button2);
		add(charPortrait);
		add(GOLD);
		add(HP);
		add(MP);
		add(MoveSpeed);
		add(AttackSpeed);
		add(AttackDamage);
		add(Defense);
		Button1.addActionListener(new ButtonListener());
		
	}
	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == Button1) {
				ch.fightSel = new fightSel(ch);
				ch.change("tofightSel");
				
			}
		}
	}

}
