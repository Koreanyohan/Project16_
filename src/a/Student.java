package a;

import java.util.ArrayList;

class Student {
	String name;
	int id;
	ArrayList<Score> scoreList = new ArrayList();

	public void addScore(Score score) {
		scoreList.add(score);
	}

	public void Scores () {
	for (int i =0 ; i<=scoreList.size(); i++){
		if (i==0 ) {
			Score kor = scoreList.get(0);
		}	else if (i==1) {			
			Score math = scoreList.get(1);
		}  	else if (i==2) {
			Score dance = scoreList.get(2);
		}
	}
	}

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

}