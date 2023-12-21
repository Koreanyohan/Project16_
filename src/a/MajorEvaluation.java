package a;
//필수 합/불 가리기

class MajorEvaluation implements GradeEvaluation {

	@Override
	public char GradeEva(Subject subject, Score score) {
		char result = 0;
		if (subject.mandatory == true) {
			if (score.score >= 90) {
				result = 'A';
			} else if (score.score >= 80) {
				result = 'B';
			} else if (score.score >= 70) {
				result = 'C';
			} else if (score.score >= 60) {
				result = 'D';
			} else {
				result = 'F';
			}			
		}
		return result;
		
		
		// 답지 : 
//		public String getGrade (int score) {
//			String result ;
//		
//			if (score >= 90) 
//				result = 'A';
//			 else if (score >= 80) 
//				result = 'B';
//			 else if (score >= 70) 
//				result = 'C';
//			 else if (score >= 60) 
//				result = 'D';
//			 else 
//				result = 'F';
//			return result;	
//		}
		
		
		
		
	}
}