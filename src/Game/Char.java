package Game;

public class Char {
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
				ch.stagePanel.textarea.append("빅토르가 평타 침\n");
			}
			ch.stagePanel.textCount += 1;
			if(ch.stagePanel.enemy_HP_value <= 0) {
				ch.stagePanel.enemy_HP_value = 0;
				ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
				ch.stagePanel.textarea.setText("승리");
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
			// 사일러스 Q 2타 예정
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
			// 빅토르 Q 추가평타 작성
		}
		ch.stagePanel.textCount += 1;
		if(ch.stagePanel.enemy_HP_value <= 0) {
			ch.stagePanel.enemy_HP_value = 0;
			ch.stagePanel.enemyHP.setText("HP : " + ch.stagePanel.enemy_HP_value);
			ch.stagePanel.textarea.setText("승리");
			ch.stagePanel.AD.setEnabled(false);
			ch.stagePanel.skillQ.setEnabled(false);
			ch.stagePanel.skillW.setEnabled(false);
			ch.stagePanel.skillE.setEnabled(false);
			ch.stagePanel.skillR.setEnabled(false);		
		}
	}	
	public void W() {
			
	}
	public void E() {
			
	}	
	public void R() {
		
	}
	
}
