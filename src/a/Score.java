package a;

import java.util.ArrayList;

class Score { // 특정 학생의 특정 과목의 점수 저장
	int id; // 학번
	Subject subject; // 과목   -> 과목클래스의 모든 iv이용 위해 Subject로 선언
	int score; // 점수

	public Score(int id, Subject subject, int score) {
		super();
		this.id = id;
		this.subject = subject;
		this.score = score;
	}


	

}
