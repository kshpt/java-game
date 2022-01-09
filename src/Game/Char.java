package Game;

import java.util.*;

public class Char {
	private Random r = new Random();
	private PanelChange ch;
	public int Azir_HP = 550; //�⺻���� ������ �Ҽ����� ��������
	public int Azir_MP = 480;
	public int Azir_MoveSpeed = 335;
	public int Azir_AttackSpeed = 1; //������ ������ ���� 1�� ����
	public int Azir_AttackDamage = 52; //�ֹ��°� ���ݷ��� ���ݷ����� ����
	public int Azir_Defense = 20; //���°� ������ �������� ����, ������ �� + ���� ��հ�
	
	public int Ryze_HP = 575; 
	public int Ryze_MP = 300;
	public int Ryze_MoveSpeed = 340;
	public int Ryze_AttackSpeed = 2;
	public int Ryze_AttackDamage = 58; 
	public int Ryze_Defense = 29; 
	
	public int Akail_HP = 500; 
	public int Akail_MP = 200; 
	public int Akail_MoveSpeed = 345;
	public int Akail_AttackSpeed = 2; 
	public int Akail_AttackDamage = 62; 
	public int Akail_Defense = 30; 
	
	public int Yone_HP = 550; 
	public int Yone_MP = 0; 
	public int Yone_MoveSpeed = 345;
	public int Yone_AttackSpeed = 2;
	public int Yone_AttackDamage = 60; 
	public int Yone_Defense = 30; 
	
	public int Yasuo_HP = 490; 
	public int Yasuo_MP = 0;
	public int Yasuo_MoveSpeed = 345;
	public int Yasuo_AttackSpeed = 5;
	public int Yasuo_AttackDamage = 60;
	public int Yasuo_Defense = 31;
	
	public int Sylas_HP = 525; 
	public int Sylas_MP = 310;
	public int Sylas_MoveSpeed = 340;
	public int Sylas_AttackSpeed = 3;
	public int Sylas_AttackDamage = 61;
	public int Sylas_Defense = 30;
	
	public int Vex_HP = 520;
	public int Vex_MP = 490;
	public int Vex_MoveSpeed = 335;
	public int Vex_AttackSpeed = 6;
	public int Vex_AttackDamage = 54;
	public int Vex_Defense = 26; 
	
	public int Zed_HP = 584;
	public int Zed_MP = 200; 
	public int Zed_MoveSpeed = 345;
	public int Zed_AttackSpeed = 4; 
	public int Zed_AttackDamage = 54;
	public int Zed_Defense = 32; 
	
	public int Viktor_HP = 530; 
	public int Viktor_MP = 405; 
	public int Viktor_MoveSpeed = 335;
	public int Viktor_AttackSpeed = 2; 
	public int Viktor_AttackDamage = 53; 
	public int Viktor_Defense = 27;
	public boolean Viktor_Q_AD_Enhance = false;
	
	public Char(PanelChange ch) {
		this.ch = ch;
	}	
		
	public void AD() { //��ų �żҵ� ���ο��� è�Ǿ� ���� ���ù��� �б��Ͽ� ����
			if(ch.charSel.charidx == 0) {
				//�̰��� ������ ��Ÿ ����
				ch.stagePanel.enemy_HP_value -= 52;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
				if(ch.stagePanel.textCount == 28) {
					ch.stagePanel.textarea.setText("");
					ch.stagePanel.textCount = 0;
				}
				ch.stagePanel.textarea.append("�������� ��Ÿ ħ\n");
			}
			else if(ch.charSel.charidx == 1) {
				ch.stagePanel.enemy_HP_value -= 58;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
				if(ch.stagePanel.textCount == 28) {
					ch.stagePanel.textarea.setText("");
					ch.stagePanel.textCount = 0;
				}
				ch.stagePanel.textarea.append("����� ��Ÿ ħ\n");
			}
			else if(ch.charSel.charidx == 2) {
				ch.stagePanel.enemy_HP_value -= 62;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
				if(ch.stagePanel.textCount == 28) {
					ch.stagePanel.textarea.setText("");
					ch.stagePanel.textCount = 0;
				}
				ch.stagePanel.textarea.append("��Į���� ��Ÿ ħ\n");
			}
			else if(ch.charSel.charidx == 3) {
				ch.stagePanel.enemy_HP_value -= 60;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
				if(ch.stagePanel.textCount == 28) {
					ch.stagePanel.textarea.setText("");
					ch.stagePanel.textCount = 0;
				}
				ch.stagePanel.textarea.append("��װ� ��Ÿ ħ\n");
			}
			else if(ch.charSel.charidx == 4) {
				ch.stagePanel.enemy_HP_value -= 60;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
				if(ch.stagePanel.textCount == 28) {
					ch.stagePanel.textarea.setText("");
					ch.stagePanel.textCount = 0;
				}
				ch.stagePanel.textarea.append("�߽����� ��Ÿ ħ\n");
			}
			else if(ch.charSel.charidx == 5) {
				ch.stagePanel.enemy_HP_value -= 61;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
				if(ch.stagePanel.textCount == 28) {
					ch.stagePanel.textarea.setText("");
					ch.stagePanel.textCount = 0;
				}
				ch.stagePanel.textarea.append("���Ϸ����� ��Ÿ ħ\n");
			}
			/*else if(ch.charSel.charidx == 6) {
				ch.stagePanel.enemy_HP_value -= 58;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
				if(ch.stagePanel.textCount == 28) {
					ch.stagePanel.textarea.setText("");
					ch.stagePanel.textCount = 0;
				}
				ch.stagePanel.textarea.append("�������� ��Ÿ ħ\n");
			}*/
			else if(ch.charSel.charidx == 7) {
				ch.stagePanel.enemy_HP_value -= 54;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
				if(ch.stagePanel.textCount == 28) {
					ch.stagePanel.textarea.setText("");
					ch.stagePanel.textCount = 0;
				}
				ch.stagePanel.textarea.append("������ ��Ÿ ħ\n");
			}
			else if(ch.charSel.charidx == 8) {
				ch.stagePanel.enemy_HP_value -= 54;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
				if(ch.stagePanel.textCount == 28) {
					ch.stagePanel.textarea.setText("");
					ch.stagePanel.textCount = 0;
				}
				ch.stagePanel.textarea.append("���尡 ��Ÿ ħ\n");
			}
			else if(ch.charSel.charidx == 9) {
				ch.stagePanel.enemy_HP_value -= 53;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
				if(ch.stagePanel.textCount == 28) {
					ch.stagePanel.textarea.setText("");
					ch.stagePanel.textCount = 0;
				}
				if(Viktor_Q_AD_Enhance == false) {
					ch.stagePanel.textarea.append("���丣�� ��Ÿ ħ\n");	
				}
				else if(Viktor_Q_AD_Enhance == true) {
					ch.stagePanel.enemy_HP_value -= 20;
					ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
					ch.stagePanel.textarea.append("���丣�� ��ȭ ��Ÿ ħ\n");
					Viktor_Q_AD_Enhance = false;
				}
				
			}
			ch.stagePanel.textCount += 1;
			if(ch.stagePanel.enemy_HP_value <= 0) {
				ch.stagePanel.enemy_HP_value = 0;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
				ch.stagePanel.textarea.setText("�¸�\n");
				ch.stagePanel.AD.setEnabled(false);
				ch.stagePanel.skillQ.setEnabled(false);
				ch.stagePanel.skillW.setEnabled(false);
				ch.stagePanel.skillE.setEnabled(false);
				ch.stagePanel.skillR.setEnabled(false);		
			}
			
	}
	public void Q() {
		if(ch.charSel.charidx == 0) {
			ch.stagePanel.enemy_HP_value -= 70;
			ch.stagePanel.MP_value -= 55;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			ch.stagePanel.myMP.setText("MP : " + ch.stagePanel.MP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("�������� �縷�� �ͽ� ���\n");
		}
		else if(ch.charSel.charidx == 1) {
			ch.stagePanel.enemy_HP_value -= 75;
			ch.stagePanel.MP_value -= 40;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			ch.stagePanel.myMP.setText("MP : " + ch.stagePanel.MP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("����� ������ ���\n");
		}
		else if(ch.charSel.charidx == 2) {
			ch.stagePanel.enemy_HP_value -= 30;
			ch.stagePanel.MP_value -= 130;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			ch.stagePanel.myMP.setText("MP : " + ch.stagePanel.MP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("��Į���� ������ô�� ���\n");
		}
		else if(ch.charSel.charidx == 3) {
			ch.stagePanel.enemy_HP_value -= 80;
			ch.stagePanel.MP_value -= 0;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			ch.stagePanel.myMP.setText("MP : " + ch.stagePanel.MP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("��װ� �ʸ��� �� ���\n");
		}
		else if(ch.charSel.charidx == 4) {
			ch.stagePanel.enemy_HP_value -= 80;
			ch.stagePanel.MP_value -= 0;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			ch.stagePanel.myMP.setText("MP : " + ch.stagePanel.MP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("�߽����� ��ö��ǳ ���\n");
		}
		else if(ch.charSel.charidx == 5) {
			ch.stagePanel.enemy_HP_value -= 40;
			ch.stagePanel.MP_value -= 55;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			ch.stagePanel.myMP.setText("MP : " + ch.stagePanel.MP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("���Ϸ����� �罽 �ķ�ġ�� ���\n");
			if(r.nextInt(10) < 3) { //30% Ȯ���� ����
				ch.stagePanel.textarea.append("�罽 �ķ�ġ�� 2Ÿ ����!\n");
				ch.stagePanel.enemy_HP_value -= 70;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			}
			else {
				ch.stagePanel.textarea.append("�罽 �ķ�ġ�� 2Ÿ ������!\n");
			}
		}
		/*else if(ch.charSel.charidx == 6) {
			ch.stagePanel.enemy_HP_value -= 70;
			ch.stagePanel.MP_value -= 55;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			ch.stagePanel.myMP.setText("MP : " + ch.stagePanel.MP_value);
						if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("�������� ��Ÿ ħ\n");
		}*/
		else if(ch.charSel.charidx == 7) {
			ch.stagePanel.enemy_HP_value -= 60;
			ch.stagePanel.MP_value -= 40;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			ch.stagePanel.myMP.setText("MP : " + ch.stagePanel.MP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("������ �Ȱ� ȭ�� ���\n");
		}
		else if(ch.charSel.charidx == 8) {
			ch.stagePanel.enemy_HP_value -= 80;
			ch.stagePanel.MP_value -= 75;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			ch.stagePanel.myMP.setText("MP : " + ch.stagePanel.MP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("���尡 ������ ǥâ ���\n");
		}
		else if(ch.charSel.charidx == 9) {
			ch.stagePanel.enemy_HP_value -= 50;
			ch.stagePanel.MP_value -= 45;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			ch.stagePanel.myMP.setText("MP : " + ch.stagePanel.MP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("���丣�� ���� ��� ���\n");
			Viktor_Q_AD_Enhance = true;
			// ���丣 Q �߰���Ÿ �ۼ�
		}
		ch.stagePanel.textCount += 1;
		if(ch.stagePanel.enemy_HP_value <= 0) {
			ch.stagePanel.enemy_HP_value = 0;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			ch.stagePanel.textarea.setText("�¸�\n");
			ch.stagePanel.AD.setEnabled(false);
			ch.stagePanel.skillQ.setEnabled(false);
			ch.stagePanel.skillW.setEnabled(false);
			ch.stagePanel.skillE.setEnabled(false);
			ch.stagePanel.skillR.setEnabled(false);		
		}
	}	
	public void W() {
		  /*if(ch.charSel.charidx == 0) {
			ch.stagePanel.enemy_HP_value -= 52;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("�������� w ���� ����\n");
		}*/
		if(ch.charSel.charidx == 1) {
			ch.stagePanel.enemy_HP_value -= 80;
			ch.stagePanel.enemy_MoveSpeed_value -= 1; //��ȭ ����(��ġ�� �ӽ�), e ��� �� ���Ǻ� �ӹ��� �̱���
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			ch.stagePanel.MP_value -= 40;
			ch.stagePanel.myMP.setText("MP : " + ch.stagePanel.MP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("����� �� ���� ���\n");
			
		}
		else if(ch.charSel.charidx == 2) {
			ch.stagePanel.MP_value += 80;
			ch.stagePanel.myMP.setText("MP : " + ch.stagePanel.MP_value);
			ch.stagePanel.MoveSpeed_value += 1;
			ch.stagePanel.myMoveSpeed.setText("�̼� : " + ch.stagePanel.MoveSpeed_value);
			//���Ѽ��� 280���� �ǵ���
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("��Į���� Ȳȥ�� �帷 ���\n");
		}
		else if(ch.charSel.charidx == 3) {
			ch.stagePanel.enemy_HP_value -= (10 + ch.stagePanel.enemy_HP_value * 11 / 100);
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			//�� ������ ���߿�
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("��װ� ��ȥ ������ ���\n");
		}
		else if(ch.charSel.charidx == 4) {
			ch.stagePanel.enemy_HP_value -= 52;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			//�帷 ������ ���߿�
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("�߽����� �ٶ� �帷 ���\n");
		}
		else if(ch.charSel.charidx == 5) {
			ch.stagePanel.enemy_HP_value -= 70;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			ch.stagePanel.MP_value -= 70;
			ch.stagePanel.myMP.setText("HP : " + ch.stagePanel.MP_value);
			if(ch.stagePanel.HP_value < Sylas_HP * 0.4) {
				if(ch.stagePanel.HP_value + 50 > Sylas_HP) { //50 ȸ������ �� ��ġ�� Ǯ�Ǹ� ���� ��� Ǯ�Ƿ� ����
					ch.stagePanel.HP_value = Sylas_HP;
				}
				else {
					ch.stagePanel.HP_value += 50; //���� ü�� 40% �̸��� ��� ȸ���� �ι�
				}
			}
			else {
				if(ch.stagePanel.HP_value + 25 > Sylas_HP) {
					ch.stagePanel.HP_value = Sylas_HP;		
				}
				else {
					ch.stagePanel.HP_value += 25;
				}
			}
			ch.stagePanel.myHP.setText("HP : " + ch.stagePanel.HP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("���Ϸ����� ���ս����� ���\n");
		}
		/*else if(ch.charSel.charidx == 6) {
			ch.stagePanel.enemy_HP_value -= 52;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("����� �� ���� ���\n");
		}*/
		else if(ch.charSel.charidx == 7) {
			ch.stagePanel.enemy_HP_value -= 52;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("����� �� ���� ���\n");
		}
		else if(ch.charSel.charidx == 8) {
			ch.stagePanel.enemy_HP_value -= 52;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("����� �� ���� ���\n");
		}
		else if(ch.charSel.charidx == 9) {
			ch.stagePanel.enemy_HP_value -= 52;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("����� �� ���� ���\n");
		}
		if(ch.stagePanel.enemy_HP_value <= 0) {
			ch.stagePanel.enemy_HP_value = 0;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			ch.stagePanel.textarea.setText("�¸�\n");
			ch.stagePanel.AD.setEnabled(false);
			ch.stagePanel.skillQ.setEnabled(false);
			ch.stagePanel.skillW.setEnabled(false);
			ch.stagePanel.skillE.setEnabled(false);
			ch.stagePanel.skillR.setEnabled(false);		
		}		
	}
	public void E() {
			
	}	
	public void R() {
		
	}
	public void enemyAD() {
		if(ch.fightSel.charidx == 0) {
			ch.stagePanel.HP_value -= 52;
			ch.stagePanel.myHP.setText("HP : " + ch.stagePanel.HP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("��� �������� ��Ÿ ħ\n");
		}
		else if(ch.fightSel.charidx == 1) {
			ch.stagePanel.HP_value -= 58;
			ch.stagePanel.myHP.setText("HP : " + ch.stagePanel.HP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("��� ����� ��Ÿ ħ\n");
		}
	}
	
}
