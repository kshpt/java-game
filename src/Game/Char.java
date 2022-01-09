package Game;

import java.util.*;

public class Char {
	private Random r = new Random();
	private PanelChange ch;
	public int Azir_HP = 550; //기본적인 스텟의 소숫값은 버림으로
	public int Azir_MP = 480;
	public int Azir_MoveSpeed = 335;
	public int Azir_AttackSpeed = 1; //공속은 아지르 기준 1로 설정
	public int Azir_AttackDamage = 52; //주문력과 공격력은 공격력으로 통일
	public int Azir_Defense = 20; //방어력과 마저도 방어력으로 통일, 방어력은 방 + 마저 평균값
	
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
		
	public void AD() { //스킬 매소드 내부에서 챔피언에 따른 선택문을 분기하여 구현
			if(ch.charSel.charidx == 0) {
				//이곳에 아지르 평타 구현
				ch.stagePanel.enemy_HP_value -= 52;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
				if(ch.stagePanel.textCount == 28) {
					ch.stagePanel.textarea.setText("");
					ch.stagePanel.textCount = 0;
				}
				ch.stagePanel.textarea.append("아지르가 평타 침\n");
			}
			else if(ch.charSel.charidx == 1) {
				ch.stagePanel.enemy_HP_value -= 58;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
				if(ch.stagePanel.textCount == 28) {
					ch.stagePanel.textarea.setText("");
					ch.stagePanel.textCount = 0;
				}
				ch.stagePanel.textarea.append("라이즈가 평타 침\n");
			}
			else if(ch.charSel.charidx == 2) {
				ch.stagePanel.enemy_HP_value -= 62;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
				if(ch.stagePanel.textCount == 28) {
					ch.stagePanel.textarea.setText("");
					ch.stagePanel.textCount = 0;
				}
				ch.stagePanel.textarea.append("아칼리가 평타 침\n");
			}
			else if(ch.charSel.charidx == 3) {
				ch.stagePanel.enemy_HP_value -= 60;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
				if(ch.stagePanel.textCount == 28) {
					ch.stagePanel.textarea.setText("");
					ch.stagePanel.textCount = 0;
				}
				ch.stagePanel.textarea.append("요네가 평타 침\n");
			}
			else if(ch.charSel.charidx == 4) {
				ch.stagePanel.enemy_HP_value -= 60;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
				if(ch.stagePanel.textCount == 28) {
					ch.stagePanel.textarea.setText("");
					ch.stagePanel.textCount = 0;
				}
				ch.stagePanel.textarea.append("야스오가 평타 침\n");
			}
			else if(ch.charSel.charidx == 5) {
				ch.stagePanel.enemy_HP_value -= 61;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
				if(ch.stagePanel.textCount == 28) {
					ch.stagePanel.textarea.setText("");
					ch.stagePanel.textCount = 0;
				}
				ch.stagePanel.textarea.append("사일러스가 평타 침\n");
			}
			/*else if(ch.charSel.charidx == 6) {
				ch.stagePanel.enemy_HP_value -= 58;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
				if(ch.stagePanel.textCount == 28) {
					ch.stagePanel.textarea.setText("");
					ch.stagePanel.textCount = 0;
				}
				ch.stagePanel.textarea.append("아지르가 평타 침\n");
			}*/
			else if(ch.charSel.charidx == 7) {
				ch.stagePanel.enemy_HP_value -= 54;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
				if(ch.stagePanel.textCount == 28) {
					ch.stagePanel.textarea.setText("");
					ch.stagePanel.textCount = 0;
				}
				ch.stagePanel.textarea.append("벡스가 평타 침\n");
			}
			else if(ch.charSel.charidx == 8) {
				ch.stagePanel.enemy_HP_value -= 54;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
				if(ch.stagePanel.textCount == 28) {
					ch.stagePanel.textarea.setText("");
					ch.stagePanel.textCount = 0;
				}
				ch.stagePanel.textarea.append("제드가 평타 침\n");
			}
			else if(ch.charSel.charidx == 9) {
				ch.stagePanel.enemy_HP_value -= 53;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
				if(ch.stagePanel.textCount == 28) {
					ch.stagePanel.textarea.setText("");
					ch.stagePanel.textCount = 0;
				}
				if(Viktor_Q_AD_Enhance == false) {
					ch.stagePanel.textarea.append("빅토르가 평타 침\n");	
				}
				else if(Viktor_Q_AD_Enhance == true) {
					ch.stagePanel.enemy_HP_value -= 20;
					ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
					ch.stagePanel.textarea.append("빅토르가 강화 평타 침\n");
					Viktor_Q_AD_Enhance = false;
				}
				
			}
			ch.stagePanel.textCount += 1;
			if(ch.stagePanel.enemy_HP_value <= 0) {
				ch.stagePanel.enemy_HP_value = 0;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
				ch.stagePanel.textarea.setText("승리\n");
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
			ch.stagePanel.textarea.append("아지르가 사막의 맹습 사용\n");
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
			ch.stagePanel.textarea.append("라이즈가 과부하 사용\n");
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
			ch.stagePanel.textarea.append("아칼리가 오연투척검 사용\n");
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
			ch.stagePanel.textarea.append("요네가 필멸의 검 사용\n");
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
			ch.stagePanel.textarea.append("야스오가 강철폭풍 사용\n");
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
			ch.stagePanel.textarea.append("사일러스가 사슬 후려치기 사용\n");
			if(r.nextInt(10) < 3) { //30% 확률로 적중
				ch.stagePanel.textarea.append("사슬 후려치기 2타 적중!\n");
				ch.stagePanel.enemy_HP_value -= 70;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			}
			else {
				ch.stagePanel.textarea.append("사슬 후려치기 2타 빗나감!\n");
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
			ch.stagePanel.textarea.append("아지르가 평타 침\n");
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
			ch.stagePanel.textarea.append("벡스가 안개 화살 사용\n");
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
			ch.stagePanel.textarea.append("제드가 예리한 표창 사용\n");
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
			ch.stagePanel.textarea.append("빅토르가 힘의 흡수 사용\n");
			Viktor_Q_AD_Enhance = true;
			// 빅토르 Q 추가평타 작성
		}
		ch.stagePanel.textCount += 1;
		if(ch.stagePanel.enemy_HP_value <= 0) {
			ch.stagePanel.enemy_HP_value = 0;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			ch.stagePanel.textarea.setText("승리\n");
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
			ch.stagePanel.textarea.append("아지르는 w 구현 안함\n");
		}*/
		if(ch.charSel.charidx == 1) {
			ch.stagePanel.enemy_HP_value -= 80;
			ch.stagePanel.enemy_MoveSpeed_value -= 1; //둔화 적용(수치는 임시), e 사용 시 조건부 속박은 미구현
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			ch.stagePanel.MP_value -= 40;
			ch.stagePanel.myMP.setText("MP : " + ch.stagePanel.MP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("라이즈가 룬 감옥 사용\n");
			
		}
		else if(ch.charSel.charidx == 2) {
			ch.stagePanel.MP_value += 80;
			ch.stagePanel.myMP.setText("MP : " + ch.stagePanel.MP_value);
			ch.stagePanel.MoveSpeed_value += 1;
			ch.stagePanel.myMoveSpeed.setText("이속 : " + ch.stagePanel.MoveSpeed_value);
			//상한선은 280으로 되도록
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("아칼리가 황혼의 장막 사용\n");
		}
		else if(ch.charSel.charidx == 3) {
			ch.stagePanel.enemy_HP_value -= (10 + ch.stagePanel.enemy_HP_value * 11 / 100);
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			//방어막 구현은 나중에
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("요네가 영혼 가르기 사용\n");
		}
		else if(ch.charSel.charidx == 4) {
			ch.stagePanel.enemy_HP_value -= 52;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			//장막 구현은 나중에
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("야스오가 바람 장막 사용\n");
		}
		else if(ch.charSel.charidx == 5) {
			ch.stagePanel.enemy_HP_value -= 70;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			ch.stagePanel.MP_value -= 70;
			ch.stagePanel.myMP.setText("HP : " + ch.stagePanel.MP_value);
			if(ch.stagePanel.HP_value < Sylas_HP * 0.4) {
				if(ch.stagePanel.HP_value + 50 > Sylas_HP) { //50 회복했을 때 수치가 풀피를 넘을 경우 풀피로 설정
					ch.stagePanel.HP_value = Sylas_HP;
				}
				else {
					ch.stagePanel.HP_value += 50; //현제 체력 40% 미만일 경우 회복량 두배
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
			ch.stagePanel.textarea.append("사일러스가 국왕시해자 사용\n");
		}
		/*else if(ch.charSel.charidx == 6) {
			ch.stagePanel.enemy_HP_value -= 52;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("라이즈가 룬 감옥 사용\n");
		}*/
		else if(ch.charSel.charidx == 7) {
			ch.stagePanel.enemy_HP_value -= 52;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("라이즈가 룬 감옥 사용\n");
		}
		else if(ch.charSel.charidx == 8) {
			ch.stagePanel.enemy_HP_value -= 52;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("라이즈가 룬 감옥 사용\n");
		}
		else if(ch.charSel.charidx == 9) {
			ch.stagePanel.enemy_HP_value -= 52;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("라이즈가 룬 감옥 사용\n");
		}
		if(ch.stagePanel.enemy_HP_value <= 0) {
			ch.stagePanel.enemy_HP_value = 0;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			ch.stagePanel.textarea.setText("승리\n");
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
			ch.stagePanel.textarea.append("상대 아지르가 평타 침\n");
		}
		else if(ch.fightSel.charidx == 1) {
			ch.stagePanel.HP_value -= 58;
			ch.stagePanel.myHP.setText("HP : " + ch.stagePanel.HP_value);
			if(ch.stagePanel.textCount == 28) {
				ch.stagePanel.textarea.setText("");
				ch.stagePanel.textCount = 0;
			}
			ch.stagePanel.textarea.append("상대 라이즈가 평타 침\n");
		}
	}
	
}
