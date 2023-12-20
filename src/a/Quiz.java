package a;

import java.util.ArrayList;

public class Quiz {

	public static void main(String[] args) {
		Subject kor = new Subject();
		Subject math = new Subject();
		Subject dance = new Subject();
		
//		StudentList studentList = new StudentList();
		
		// 학생 객체 생성
		Student stu1 = new Student ("안성원", 1812);
		Student stu2 = new Student ("오태훈", 1823);
		Student stu3 = new Student ("이동호", 1715);
		Student stu4 = new Student ("조성욱", 1723);
		Student stu5 = new Student ("최태평", 1712);
					
		// 학생별 과목별 점수 생성
		Score score1_stu1 = new Score(stu2.id, kor, 95);
		Score score2_stu1 = new Score(stu2.id, math, 56);
		Score score3_stu1= new Score(stu2.id, dance, 95);
		
		Score score1_stu2 = new Score(stu3.id, kor, 95);
		Score score2_stu2 = new Score(stu3.id, math, 98);
		Score score3_stu2= new Score(stu3.id, dance, 85);
		
		Score score1_stu3 = new Score(stu4.id, kor, 100);
		Score score2_stu3 = new Score(stu4.id, math, 88);
		Score score3_stu3= new Score(stu4.id, dance, 55);
		
		Score score1_stu4 = new Score(stu5.id, kor, 89);
		Score score2_stu4 = new Score(stu5.id, math, 95);		
		
		Score score1_stu5 = new Score(stu1.id, kor, 83);
		Score score2_stu5 = new Score(stu1.id, math, 56);		
		
		
		//점수 추가
		stu1.addScore(score1_stu1);
		stu1.addScore(score2_stu1);
		stu1.addScore(score3_stu1);
		
		stu2.addScore(score1_stu2);
		stu2.addScore(score2_stu2);
		stu2.addScore(score3_stu2);
		
		stu2.addScore(score1_stu3);
		stu2.addScore(score2_stu3);
		stu2.addScore(score3_stu3);
		
		stu2.addScore(score1_stu4);
		stu2.addScore(score2_stu4);		
		
		stu2.addScore(score1_stu5);
		stu2.addScore(score2_stu5);		
		
		
		
		kor.addstudent(stu1);
		kor.addstudent(stu2);
		kor.addstudent(stu3);
		kor.addstudent(stu4);
		kor.addstudent(stu5);
		stu1.Scores();		
		
		
		
		
	}
}









