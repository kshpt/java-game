package Game;

public class Char {
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
	
	public Char(PanelChange ch) {
		this.ch = ch;
	}	
		
	public void AD() { //��ų �żҵ� ���ο��� è�Ǿ� ���� ���ù��� �б��Ͽ� ����
			if(ch.charSel.charidx == 0) {
				//�̰��� ������ ��Ÿ ����
				ch.stagePanel.enemy_HP_value -= 52;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			}
			else if(ch.charSel.charidx == 1) {
				ch.stagePanel.enemy_HP_value -= 58;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			}
			else if(ch.charSel.charidx == 2) {
				ch.stagePanel.enemy_HP_value -= 62;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			}
			else if(ch.charSel.charidx == 3) {
				ch.stagePanel.enemy_HP_value -= 60;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			}
			else if(ch.charSel.charidx == 4) {
				ch.stagePanel.enemy_HP_value -= 60;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			}
			else if(ch.charSel.charidx == 5) {
				ch.stagePanel.enemy_HP_value -= 61;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			}
			/*else if(ch.charSel.charidx == 6) {
				ch.stagePanel.enemy_HP_value -= 58;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			}*/
			else if(ch.charSel.charidx == 7) {
				ch.stagePanel.enemy_HP_value -= 54;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			}
			else if(ch.charSel.charidx == 8) {
				ch.stagePanel.enemy_HP_value -= 54;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			}
			else if(ch.charSel.charidx == 9) {
				ch.stagePanel.enemy_HP_value -= 53;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			}
			
	}
	public void Q() {
			
	}	
	public void W() {
			
	}
	public void E() {
			
	}	
	public void R() {
		
	}
	
}