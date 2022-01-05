package Game;

public class Azir {
	public int HP = 550; //�⺻���� ������ �Ҽ����� ��������
	public int MP = 480;
	public int MoveSpeed = 335;
	public int AttackSpeed = 1; //������ ������ ���� 1�� ����
	public int AttackDamage = 52; //�ֹ��°� ���ݷ��� ���ݷ����� ����
	public int Defense = 20; //���°� ������ �������� ����, ������ �� + ���� ��հ�
	private PanelChange ch;
	
	public Azir(PanelChange ch) {
		this.ch = ch;
	}
	
	public void Azir_AD() {
		if(ch.fightSel.charidx == 0) {
			ch.enemyAzir.HP -= 52;
			ch.stagePanel.enemyHP.setText("HP : " + ch.enemyAzir.HP);
		}
		else if(ch.fightSel.charidx == 1) {
			ch.enemyRyze.HP -= 52;
			ch.stagePanel.enemyHP.setText("HP : " + ch.enemyRyze.HP);
		}
		else if(ch.fightSel.charidx == 2) {
			ch.enemyAkali.HP -= 52;
			ch.stagePanel.enemyHP.setText("HP : " + ch.enemyAkali.HP);
		}
	}
	public void Azir_Q() {
		
		
	}
	public void Azir_W() {
		
	}
	public void Azir_E() {
		
	}
	public void Azir_R() {
	
	}
	
}