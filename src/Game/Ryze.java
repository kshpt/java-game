package Game;

public class Ryze {
	public int HP = 575; //�⺻���� ������ �Ҽ����� ��������
	public int MP = 300;
	public int MoveSpeed = 340;
	public int AttackSpeed = 2; //������ ������ ���� 1�� ����
	public int AttackDamage = 58; //�ֹ��°� ���ݷ��� ���ݷ����� ����
	public int Defense = 29; //���°� ������ �������� ����, ������ �� + ���� ��հ�
	private PanelChange ch;
	
	public Ryze(PanelChange ch) {
		this.ch = ch;
	}
}
