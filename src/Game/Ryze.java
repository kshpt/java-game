package Game;

public class Ryze {
	public int HP = 575; //기본적인 스텟의 소숫값은 버림으로
	public int MP = 300;
	public int MoveSpeed = 340;
	public int AttackSpeed = 2; //공속은 아지르 기준 1로 설정
	public int AttackDamage = 58; //주문력과 공격력은 공격력으로 통일
	public int Defense = 29; //방어력과 마저도 방어력으로 통일, 방어력은 방 + 마저 평균값
	private PanelChange ch;
	
	public Ryze(PanelChange ch) {
		this.ch = ch;
	}
}
