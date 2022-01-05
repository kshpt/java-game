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
	public JLabel AbilityPower;
	public JLabel Defense;
	public JLabel MagicDefense;
	public int GOLD_value = 100;
	public int HP_value = 100;
	public int MP_value = 100;
	public int MoveSpeed_value = 100;
	public int AttackSpeed_value = 100;
	public int AttackDamage_value = 100;
	public int AbilityPower_value = 100;
	public int Defense_value = 100;
	public int MagicDefense_value = 100;
	
	public mainGame(PanelChange ch) {
		setLayout(null);
		this.ch = ch;
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
		AbilityPower = new JLabel("AP : " + AbilityPower_value);
		Defense = new JLabel("¹æ¾î·Â : " + Defense_value);
		MagicDefense = new JLabel("¸¶¹ý¹æ¾î·Â : " + MagicDefense_value);
		GOLD.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		HP.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		MP.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		MoveSpeed.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		AttackSpeed.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		AttackDamage.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		AbilityPower.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		Defense.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		MagicDefense.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 20));
		Button1.setBounds(800, 100, 200, 50);
		Button2.setBounds(800, 200, 200, 50);
		GOLD.setBounds(190, 200, 200, 50);
		HP.setBounds(350, 100, 200, 50);
		MP.setBounds(350, 150, 200, 50);
		MoveSpeed.setBounds(350, 200, 200, 50);
		AttackSpeed.setBounds(350, 250, 200, 50);
		AttackDamage.setBounds(350, 300, 200, 50);
		AbilityPower.setBounds(350, 350, 200, 50);
		Defense.setBounds(350, 400, 200, 50);
		MagicDefense.setBounds(350, 450, 200, 50);
		add(Button1);
		add(Button2);
		add(charPortrait);
		add(GOLD);
		add(HP);
		add(MP);
		add(MoveSpeed);
		add(AttackSpeed);
		add(AttackDamage);
		add(AbilityPower);
		add(Defense);
		add(MagicDefense);
	}

}
