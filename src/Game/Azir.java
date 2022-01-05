package Game;

public class Azir {
	public int HP = 550; //기본적인 스텟의 소숫값은 버림으로
	public int MP = 480;
	public int MoveSpeed = 335;
	public int AttackSpeed = 1; //공속은 아지르 기준 1로 설정
	public int AttackDamage = 52; //주문력과 공격력은 공격력으로 통일
	public int Defense = 20; //방어력과 마저도 방어력으로 통일, 방어력은 방 + 마저 평균값
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
		ch.azir.MP -= 55;
		ch.stagePanel.myMP.setText("MP : " + ch.azir.MP);
		if(ch.fightSel.charidx == 0) {
			ch.enemyAzir.HP -= 70;
			ch.stagePanel.enemyHP.setText("HP : " + ch.enemyAzir.HP);
		}
		
	}
	public void Azir_W() {
		
	}
	public void Azir_E() {
		ch.azir.MP -= 60;
		ch.stagePanel.myMP.setText("MP : " + ch.azir.MP);
		ch.azir.HP += 40;
		ch.stagePanel.myHP.setText("HP : " + ch.azir.HP);
		if(ch.fightSel.charidx == 0) {
			ch.enemyAzir.HP -= 30;
			ch.stagePanel.enemyHP.setText("HP : " + ch.enemyAzir.HP);
		}
		
	}
	public void Azir_R() {
	
	}
	
}
