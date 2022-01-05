package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class mainGame extends JPanel {
	private PanelChange ch;
	public int test = 1;
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
			Azir azir = new Azir();
			HP_value = azir.HP;
			MP_value = azir.MP;
			MoveSpeed_value = azir.MoveSpeed;
			AttackSpeed_value = azir.AttackSpeed;
			AttackDamage_value = azir.AttackDamage;
			Defense_value = azir.Defense;
					
		}

		else if(ch.charSel.charidx == 1) {
			Ryze ryze = new Ryze();
			HP_value = ryze.HP;
			MP_value = ryze.MP;
			MoveSpeed_value = ryze.MoveSpeed;
			AttackSpeed_value = ryze.AttackSpeed;
			AttackDamage_value = ryze.AttackDamage;
			Defense_value = ryze.Defense;
					
		}
		
		else if(ch.charSel.charidx == 2) {
			Akali akali = new Akali();
			HP_value = akali.HP;
			MP_value = akali.MP;
			MoveSpeed_value = akali.MoveSpeed;
			AttackSpeed_value = akali.AttackSpeed;
			AttackDamage_value = akali.AttackDamage;
			Defense_value = akali.Defense;
					
		}
		
		else if(ch.charSel.charidx == 3) {
			Yone yone = new Yone();
			HP_value = yone.HP;
			MP_value = yone.MP;
			MoveSpeed_value = yone.MoveSpeed;
			AttackSpeed_value = yone.AttackSpeed;
			AttackDamage_value = yone.AttackDamage;
			Defense_value = yone.Defense;
					
		}
		
		else if(ch.charSel.charidx == 4) {
			Yasuo yasuo = new Yasuo();
			HP_value = yasuo.HP;
			MP_value = yasuo.MP;
			MoveSpeed_value = yasuo.MoveSpeed;
			AttackSpeed_value = yasuo.AttackSpeed;
			AttackDamage_value = yasuo.AttackDamage;
			Defense_value = yasuo.Defense;
					
		}
		
		else if(ch.charSel.charidx == 5) {
			Sylas sylas = new Sylas();
			HP_value = sylas.HP;
			MP_value = sylas.MP;
			MoveSpeed_value = sylas.MoveSpeed;
			AttackSpeed_value = sylas.AttackSpeed;
			AttackDamage_value = sylas.AttackDamage;
			Defense_value = sylas.Defense;
					
		}
		
		//����� ĭ
		
		else if(ch.charSel.charidx == 7) {
			Vex vex = new Vex();
			HP_value = vex.HP;
			MP_value = vex.MP;
			MoveSpeed_value = vex.MoveSpeed;
			AttackSpeed_value = vex.AttackSpeed;
			AttackDamage_value = vex.AttackDamage;
			Defense_value = vex.Defense;
					
		}
		
		else if(ch.charSel.charidx == 8) {
			Zed zed = new Zed();
			HP_value = zed.HP;
			MP_value = zed.MP;
			MoveSpeed_value = zed.MoveSpeed;
			AttackSpeed_value = zed.AttackSpeed;
			AttackDamage_value = zed.AttackDamage;
			Defense_value = zed.Defense;
					
		}
		
		else if(ch.charSel.charidx == 9) {
			Viktor viktor = new Viktor();
			HP_value = viktor.HP;
			MP_value = viktor.MP;
			MoveSpeed_value = viktor.MoveSpeed;
			AttackSpeed_value = viktor.AttackSpeed;
			AttackDamage_value = viktor.AttackDamage;
			Defense_value = viktor.Defense;
					
		}

		charPortrait.setIcon(ch.charSel.charImg[ch.charSel.charidx]);
		charPortrait.setBounds(190, 100, 100, 100);
		GOLD = new JLabel("GOLD : " + GOLD_value);
		HP = new JLabel("HP : " + HP_value);
		MP = new JLabel("MP : " + MP_value);
		Button1 = new JButton("�ο췯����");
		Button2 = new JButton("��������");
		MoveSpeed = new JLabel("�̵��ӵ� : " + MoveSpeed_value);
		AttackSpeed = new JLabel("���ݼӵ� : " + AttackSpeed_value);
		AttackDamage = new JLabel("AD : " + AttackDamage_value);
		Defense = new JLabel("���� : " + Defense_value);
		GOLD.setFont(new Font("���� ���", Font.PLAIN, 20));
		HP.setFont(new Font("���� ���", Font.PLAIN, 20));
		MP.setFont(new Font("���� ���", Font.PLAIN, 20));
		MoveSpeed.setFont(new Font("���� ���", Font.PLAIN, 20));
		AttackSpeed.setFont(new Font("���� ���", Font.PLAIN, 20));
		AttackDamage.setFont(new Font("���� ���", Font.PLAIN, 20));
		Defense.setFont(new Font("���� ���", Font.PLAIN, 20));
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
	}

}
