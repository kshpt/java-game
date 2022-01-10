package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class stagePanel extends JPanel {
	private PanelChange ch;
	//���� �޼��� ���
	public JTextArea textarea = new JTextArea();
	public int textCount = 0;
	//�ʻ�ȭ
	public JLabel myPort = new JLabel();
	public JLabel enemyPort = new JLabel();
	//��ų ��ư
	public JButton AD = new JButton("��Ÿ");
	public JButton skillQ = new JButton("Q");
	public JButton skillW = new JButton("W");
	public JButton skillE = new JButton("E");
	public JButton skillR = new JButton("R");
	//�� ĳ���� ������ ����
	public int HP_value;
	public int MP_value;
	public int MoveSpeed_value;
	public int AttackSpeed_value;
	public int AttackDamage_value;
	public int Defense_value;
	//��� ĳ���� ������ ����
	public int enemy_HP_value;
	public int enemy_MP_value;
	public int enemy_MoveSpeed_value;
	public int enemy_AttackSpeed_value;
	public int enemy_AttackDamage_value;
	public int enemy_Defense_value;
	//�� ĳ���� ���� ǥ��
	public JLabel myHP;
	public JLabel myMP;
	public JLabel myMoveSpeed;
	public JLabel myAttackSpeed;
	public JLabel myAttackDamage;
	public JLabel myDefense;
	//��� ĳ���� ���� ǥ��
	public JLabel enemyHP;
	//�� �ѱ�� ����
	public int gameTurn = 1;
	
	public stagePanel(PanelChange ch) {
		setLayout(null);
		this.ch = ch;
		//�� ĳ���� ���� ��ġ ���� ��ɾ�
		HP_value = ch.mainGame.HP_value;
		MP_value = ch.mainGame.MP_value;
		MoveSpeed_value = ch.mainGame.MoveSpeed_value;
		AttackSpeed_value = ch.mainGame.AttackSpeed_value;
		AttackDamage_value = ch.mainGame.AttackDamage_value;
		Defense_value = ch.mainGame.Defense_value;
		//�� ĳ���� ���� ���̰� �ϴ� ��ɾ�
		myHP = new JLabel("HP : " + HP_value);
		myHP.setBounds(350, 100, 100, 40);
		add(myHP);
		myMP = new JLabel("MP : " + MP_value);
		myMP.setBounds(350, 150, 100, 40);
		add(myMP);
		myMoveSpeed = new JLabel("�̼� : " + MoveSpeed_value);
		myMoveSpeed.setBounds(350, 200, 100, 40);
		add(myMoveSpeed);
		myAttackSpeed = new JLabel("���� : " + AttackSpeed_value);
		myAttackSpeed.setBounds(350, 250, 100, 40);
		add(myAttackSpeed);
		myAttackDamage = new JLabel("���ݷ� : " + AttackDamage_value);
		myAttackDamage.setBounds(350, 300, 100, 40);
		add(myAttackDamage);
		myDefense = new JLabel("���� : " + Defense_value);
		myDefense.setBounds(350, 350, 100, 40);
		add(myDefense);
		//��� ĳ���� ���� ���� ��ɾ�
		if(ch.fightSel.charidx == 0) {
			enemy_HP_value = ch.myChar.Azir_HP;
			enemy_MP_value = ch.myChar.Azir_MP;
			enemy_MoveSpeed_value = ch.myChar.Azir_MoveSpeed;
			enemy_AttackSpeed_value = ch.myChar.Azir_AttackSpeed;
			enemy_AttackDamage_value = ch.myChar.Azir_AttackDamage;
			enemy_Defense_value = ch.myChar.Azir_Defense;
		}
		else if(ch.fightSel.charidx == 1) {
			enemy_HP_value = ch.myChar.Ryze_HP;
			enemy_MP_value = ch.myChar.Ryze_MP;
			enemy_MoveSpeed_value = ch.myChar.Ryze_MoveSpeed;
			enemy_AttackSpeed_value = ch.myChar.Ryze_AttackSpeed;
			enemy_AttackDamage_value = ch.myChar.Ryze_AttackDamage;
			enemy_Defense_value = ch.myChar.Ryze_Defense;
		}
		else if(ch.fightSel.charidx == 2) {
			enemy_HP_value = ch.myChar.Akail_HP;
			enemy_MP_value = ch.myChar.Akail_MP;
			enemy_MoveSpeed_value = ch.myChar.Akail_MoveSpeed;
			enemy_AttackSpeed_value = ch.myChar.Akail_AttackSpeed;
			enemy_AttackDamage_value = ch.myChar.Akail_AttackDamage;
			enemy_Defense_value = ch.myChar.Akail_Defense;
		}
		else if(ch.fightSel.charidx == 3) {
			enemy_HP_value = ch.myChar.Yone_HP;
			enemy_MP_value = ch.myChar.Yone_MP;
			enemy_MoveSpeed_value = ch.myChar.Yone_MoveSpeed;
			enemy_AttackSpeed_value = ch.myChar.Yone_AttackSpeed;
			enemy_AttackDamage_value = ch.myChar.Yone_AttackDamage;
			enemy_Defense_value = ch.myChar.Yone_Defense;
		}
		else if(ch.fightSel.charidx == 4) {
			enemy_HP_value = ch.myChar.Yasuo_HP;
			enemy_MP_value = ch.myChar.Yasuo_MP;
			enemy_MoveSpeed_value = ch.myChar.Yasuo_MoveSpeed;
			enemy_AttackSpeed_value = ch.myChar.Yasuo_AttackSpeed;
			enemy_AttackDamage_value = ch.myChar.Yasuo_AttackDamage;
			enemy_Defense_value = ch.myChar.Yasuo_Defense;
		}
		else if(ch.fightSel.charidx == 5) {
			enemy_HP_value = ch.myChar.Sylas_HP;
			enemy_MP_value = ch.myChar.Sylas_MP;
			enemy_MoveSpeed_value = ch.myChar.Sylas_MoveSpeed;
			enemy_AttackSpeed_value = ch.myChar.Sylas_AttackSpeed;
			enemy_AttackDamage_value = ch.myChar.Sylas_AttackDamage;
			enemy_Defense_value = ch.myChar.Sylas_Defense;
		}
		/*else if(ch.fightSel.charidx == 6) {
			enemy_HP_value = ch.myChar.Azir_HP;
			enemy_MP_value = ch.myChar.Azir_MP;
			enemy_MoveSpeed_value = ch.myChar.Azir_MoveSpeed;
			enemy_AttackSpeed_value = ch.myChar.Azir_AttackSpeed;
			enemy_AttackDamage_value = ch.myChar.Azir_AttackDamage;
			enemy_Defense_value = ch.myChar.Azir_Defense;
		}*/
		else if(ch.fightSel.charidx == 7) {
			enemy_HP_value = ch.myChar.Vex_HP;
			enemy_MP_value = ch.myChar.Vex_MP;
			enemy_MoveSpeed_value = ch.myChar.Vex_MoveSpeed;
			enemy_AttackSpeed_value = ch.myChar.Vex_AttackSpeed;
			enemy_AttackDamage_value = ch.myChar.Vex_AttackDamage;
			enemy_Defense_value = ch.myChar.Vex_Defense;
		}
		else if(ch.fightSel.charidx == 8) {
			enemy_HP_value = ch.myChar.Zed_HP;
			enemy_MP_value = ch.myChar.Zed_MP;
			enemy_MoveSpeed_value = ch.myChar.Zed_MoveSpeed;
			enemy_AttackSpeed_value = ch.myChar.Zed_AttackSpeed;
			enemy_AttackDamage_value = ch.myChar.Zed_AttackDamage;
			enemy_Defense_value = ch.myChar.Zed_Defense;
		}
		else if(ch.fightSel.charidx == 9) {
			enemy_HP_value = ch.myChar.Viktor_HP;
			enemy_MP_value = ch.myChar.Viktor_MP;
			enemy_MoveSpeed_value = ch.myChar.Viktor_MoveSpeed;
			enemy_AttackSpeed_value = ch.myChar.Viktor_AttackSpeed;
			enemy_AttackDamage_value = ch.myChar.Viktor_AttackDamage;
			enemy_Defense_value = ch.myChar.Viktor_Defense;
		}
		//��� ���� ���̰� �ϴ� ��ɾ�
		enemyHP = new JLabel("HP : " + enemy_HP_value);
		enemyHP.setBounds(860, 100, 100, 40);
		add(enemyHP);
		//�ʻ�ȭ ���̰� �ϴ� ��ɾ�
		myPort.setIcon(ch.charSel.charImg[ch.charSel.charidx]);
		enemyPort.setIcon(ch.fightSel.charImg[ch.fightSel.charidx]);
		myPort.setBounds(190, 100, 100, 100);
		enemyPort.setBounds(990, 100, 100, 100);
		add(myPort);
		add(enemyPort);
		//��ų ��ư ���̰� �ϴ� ��ɾ�
		AD.setBounds(190, 300, 100, 40);
		skillQ.setBounds(190, 350, 100, 40);
		skillW.setBounds(190, 400, 100, 40);
		skillE.setBounds(190, 450, 100, 40);
		skillR.setBounds(190, 500, 100, 40);
		add(AD);
		add(skillQ);
		add(skillW);
		add(skillE);
		add(skillR);
		//��ư�� ������ �ޱ�
		AD.addActionListener(new ADListener());
		skillQ.addActionListener(new ADListener());
		skillW.addActionListener(new ADListener());
		skillE.addActionListener(new ADListener());
		skillR.addActionListener(new ADListener());
		//���� �޼���
		textarea.setBounds(450, 100, 400, 500);
		add(textarea);
		textarea.setEditable(false);		
		
	
		
	}
	//��ų ��ư�� ����Ǵ� ������
	class ADListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == AD) {
				ch.myChar.AD();
				gameTurn += 1; //��ų�� ����ߴٸ� ����� ��
				if(ch.stagePanel.enemy_HP_value > 0) {
					if(gameTurn % 2 == 0) { //�������� ¦�� ��, ���� ��ų�� 1ȸ ��ٸ�	
						ch.myChar.enemyAD();
						if(ch.stagePanel.textCount == 14) {
							ch.stagePanel.textarea.setText("");
							ch.stagePanel.textCount = 0;
						}
						gameTurn += 1;
						
					}
				}
			}
			else if(e.getSource() == skillQ) {
				ch.myChar.Q();
				gameTurn += 1;
				if(ch.stagePanel.enemy_HP_value > 0) {
					if(gameTurn % 2 == 0) { //�������� ¦�� ��, ���� ��ų�� 1ȸ ��ٸ�	
						ch.myChar.enemyAD();
						if(ch.stagePanel.textCount == 14) {
							ch.stagePanel.textarea.setText("");
							ch.stagePanel.textCount = 0;
						}
						gameTurn += 1;
						
					}
				}
			}
			else if(e.getSource() == skillW) {
				ch.myChar.W();
				gameTurn += 1;
				if(ch.stagePanel.enemy_HP_value > 0) {
					if(gameTurn % 2 == 0) { //�������� ¦�� ��, ���� ��ų�� 1ȸ ��ٸ�	
						ch.myChar.enemyAD();
						if(ch.stagePanel.textCount == 14) {
							ch.stagePanel.textarea.setText("");
							ch.stagePanel.textCount = 0;
						}
						gameTurn += 1;
						
					}
				}
			}
			else if(e.getSource() == skillE) {
				ch.myChar.E();
				gameTurn += 1;
				if(ch.stagePanel.enemy_HP_value > 0) {
					if(gameTurn % 2 == 0) { //�������� ¦�� ��, ���� ��ų�� 1ȸ ��ٸ�	
						ch.myChar.enemyAD();
						if(ch.stagePanel.textCount == 14) {
							ch.stagePanel.textarea.setText("");
							ch.stagePanel.textCount = 0;
						}
						gameTurn += 1;
						
					}
				}
			}
			else if(e.getSource() == skillR) {
				ch.myChar.R();
				gameTurn += 1;
				if(ch.stagePanel.enemy_HP_value > 0) {
					if(gameTurn % 2 == 0) { //�������� ¦�� ��, ���� ��ų�� 1ȸ ��ٸ�	
						ch.myChar.enemyAD();
						if(ch.stagePanel.textCount == 14) {
							ch.stagePanel.textarea.setText("");
							ch.stagePanel.textCount = 0;
						}
						gameTurn += 1;
						
					}
				}
			}
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
}
