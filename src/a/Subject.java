package a;

import java.util.ArrayList;

class Subject {
	String subName;
	int subNumber;
	// 학점 산출방식 나중에
	ArrayList<Student> subStuList = new ArrayList<Student>();

	public void addstudent(Student student) {
		subStuList.add(student);
	}

}