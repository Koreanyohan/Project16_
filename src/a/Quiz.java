package a;
// 내 풀이 문제점 : 겁나게 지저분함. 어거지로 결과 나오게 한 느낌. 그리고 Subject클래스에 subNumber(과목별 번호) 사용 안함.
import java.util.ArrayList;

public class Quiz {

	public static void main(String[] args) {
		Subject kor = new Subject();   // 답안 - 여기서 Subject클래스의 변수들 다 생성./ define클래스 생성해서 사용
		Subject math = new Subject();  
		Subject dance = new Subject();
		kor.subName = "국어"; // 이거 애초에 생성자에서 생성할때 넣었으면 되지
		math.subName = "수학";
		dance.subName = "댄스";
			
			
		// 과목별 필수여부
		kor.mandatory = true;
		math.mandatory = true;
		dance.mandatory = false;


		ArrayList<Student> studentList = new ArrayList<Student>();
		// 학생 객체 생성
		Student stu1 = new Student("안성원", 1812);
		Student stu2 = new Student("오태훈", 1823);
		Student stu3 = new Student("이동호", 1715);
		Student stu4 = new Student("조성욱", 1723);
		Student stu5 = new Student("최태평", 1712);
		
		// 답안 - 수강 신청 메서드 (register 메서드 사용)
		
		
		
		
		
		
		

		// 학생별 과목별 점수 생성
		Score score1_stu1 = new Score(stu2.id, kor, 95);
		Score score2_stu1 = new Score(stu2.id, math, 56);
		Score score3_stu1 = new Score(stu2.id, dance, 95);

		Score score1_stu2 = new Score(stu3.id, kor, 95);
		Score score2_stu2 = new Score(stu3.id, math, 98);
		Score score3_stu2 = new Score(stu3.id, dance, 85);

		Score score1_stu3 = new Score(stu4.id, kor, 100);
		Score score2_stu3 = new Score(stu4.id, math, 88);
		Score score3_stu3 = new Score(stu4.id, dance, 55);

		Score score1_stu4 = new Score(stu5.id, kor, 89);
		Score score2_stu4 = new Score(stu5.id, math, 95);

		Score score1_stu5 = new Score(stu1.id, kor, 83);
		Score score2_stu5 = new Score(stu1.id, math, 56);

		// 점수 추가 -> 수정해야 클래스정의할듯
		stu1.addScore(score1_stu1);
		stu1.addScore(score2_stu1);
		stu1.addScore(score3_stu1);

		stu2.addScore(score1_stu2);
		stu2.addScore(score2_stu2);
		stu2.addScore(score3_stu2);

		stu3.addScore(score1_stu3);
		stu3.addScore(score2_stu3);
		stu3.addScore(score3_stu3);

		stu4.addScore(score1_stu4);
		stu4.addScore(score2_stu4);

		stu5.addScore(score1_stu5);
		stu5.addScore(score2_stu5);

		// Subject 메서드의 subStuList에 추가
		kor.addstudent(stu1);
		kor.addstudent(stu2);
		kor.addstudent(stu3);
		kor.addstudent(stu4);
		kor.addstudent(stu5);
		
		math.addstudent(stu1);
		math.addstudent(stu2);
		math.addstudent(stu3);
		math.addstudent(stu4);
		math.addstudent(stu5);
		
		dance.addstudent(stu1);
		dance.addstudent(stu2);
		dance.addstudent(stu3);
		dance.addstudent(stu4);
		dance.addstudent(stu5);

			
//		System.out.println("------------------");
//		System.out.println("  국어 수강생 학점");
//		System.out.println(" 이름 | 학번 | 점수");
//		System.out.println("------------------");
//		System.out.println(stu1.name + " | " + stu1.id + " | " + score1_stu1.score + ":" + test(kor, score1_stu1));
//		System.out.println("------------------");
//		System.out.println(stu2.name + " | " + stu2.id + " | " + score1_stu2.score + ":" + test(kor, score1_stu2));
//		System.out.println("------------------");	
//		System.out.println(stu3.name + " | " + stu3.id + " | " + score1_stu3.score + ":" + test(kor, score1_stu3));
//		System.out.println("------------------");
//		System.out.println(stu4.name + " | " + stu4.id + " | " + score1_stu4.score + ":" + test(kor, score1_stu4));
//		System.out.println("------------------");
//		System.out.println(stu5.name + " | " + stu5.id + " | " + score1_stu5.score + ":" + test(kor, score1_stu5));
//		System.out.println("------------------");
//
//		
//		
//		
//		System.out.println("------------------");
//		System.out.println("  수학 수강생 학점");
//		System.out.println(" 이름 | 학번 | 점수");
//		System.out.println("------------------");
//		System.out.println(stu1.name + " | " + stu1.id + " | " + score2_stu1.score + ":" + test(math, score2_stu1));
//		System.out.println("------------------");
//		System.out.println(stu2.name + " | " + stu2.id + " | " + score2_stu2.score + ":" + test(math, score2_stu2));
//		System.out.println("------------------");
//		System.out.println(stu3.name + " | " + stu3.id + " | " + score2_stu3.score + ":" + test(math, score2_stu3));
//		System.out.println("------------------");
//		System.out.println(stu4.name + " | " + stu4.id + " | " + score2_stu4.score + ":" + test(math, score2_stu4));
//		System.out.println("------------------");
//		System.out.println(stu5.name + " | " + stu5.id + " | " + score2_stu5.score + ":" + test(math, score2_stu5));
//		System.out.println("------------------");
//
//		System.out.println("------------------");
//		System.out.println("  댄스 수강생 학점");
//		System.out.println(" 이름 | 학번 | 점수");
//		System.out.println("------------------");
//		System.out.println(stu1.name + " | " + stu1.id + " | " + score3_stu1.score + ":" + test(dance, score2_stu5));
//		System.out.println("------------------");
//		System.out.println(stu2.name + " | " + stu2.id + " | " + score3_stu2.score + ":" + test(dance, score2_stu5));
//		System.out.println("------------------");
//		System.out.println(stu3.name + " | " + stu3.id + " | " + score3_stu3.score + ":" + test(dance, score2_stu5));
//		System.out.println("------------------");
		
		
		

		Report report = new Report(); 
		report.appraisal(kor);
		report.appraisal(math);
		report.appraisal(dance);  // 이거 왜 indexoutofboundsexception뜨냐?
	}
	
	
	static char test (Subject subject, Score score) {		
		GradeEvaluation evaluation;
		if(subject.mandatory == true) {
			evaluation = new MajorEvaluation();
		} else {
			evaluation = new PassEvaluation();
		}				
		return evaluation.GradeEva(subject, score);
	}
}
