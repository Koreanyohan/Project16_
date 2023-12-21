package a;

import java.util.ArrayList;

class Subject {
	String subName; // 과목 이름
	int subNumber; // 과목 고유 번호 (1001:국어, 2001:수학, 3001:댄스) 
//	int subjectType; // 과목 구분 (1:필수, 2:교양)  난 이거 대신 boolean 으로 처리함.
	boolean mandatory; // (필수/교양)
	
	// 이 과목수강하는 학생 리스트
	ArrayList<Student> subStuList = new ArrayList<Student>();

	public void addstudent(Student student) {
		subStuList.add(student);
		// 나머지 변수 생성자 왜안썼니!! mandatory라도 선언했으면 문풀 쉬워졌지
	}
	
	
}