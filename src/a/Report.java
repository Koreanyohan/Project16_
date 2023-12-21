package a;

// 과목별 메서드
class Report extends Test {

	public void appraisal(Subject subject) {

		String a = "";
		int b, c = 0;
		char d = ' ';

		// subject == 국어
		System.out.println("------------------");
		System.out.println("   " + subject.subName + "수강생 학점");
		System.out.println(" 이름 | 학번 | 점수");
		System.out.println("------------------");
		for (int i = 0; i < subject.subStuList.size(); i++) {
//			System.out.println("subject.subStuList.get(i).name + subject.subStuList.get(i).id + subject.subStuList.get(i).scoreList.get(0).score");
//					ㄴ 국어수강 학생1 - 이름					ㄴ 국어 수강 학생1 - id    - 여기까지 국어 수강 학생1 국어 score 소환/ 국어 점수
			int j = 0 ;
			if(subject.subName == "국어") {
				j = 0;
			} else if (subject.subName == "수학") {
				j = 1;
			} else if (subject.subName == "댄스") {
				j = 2;
			}				
			a = subject.subStuList.get(i).name;
			b = subject.subStuList.get(i).id;
			c = subject.subStuList.get(i).scoreList.get(j).score;
			d = test(subject, subject.subStuList.get(i).scoreList.get(j));
			System.out.println(a + " | " + b + " | " + c + ":" + d);
			System.out.println("------------------");
		}

	}
}
