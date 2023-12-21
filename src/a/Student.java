package a;

import java.util.ArrayList;

class Student {
	String name; // 이름
	int id;			// 학번
	ArrayList<Score> scoreList = new ArrayList(); // 학생의 점수 리스트

	public void addScore(Score score) {
		scoreList.add(score);
	}

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;

	}
}