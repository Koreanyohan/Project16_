package a;

class PassEvaluation implements GradeEvaluation {

	@Override
	public char GradeEva(Subject subject, Score score) {
		char result = 0;
		if (subject.mandatory == false) {
			if (score.score >= 70) {
				result = 'P';
			} else {
				result = 'F';
			}			
		}	
		return result;
	}
	
//	public String getGrade (int score) {
//		
//		if (score >= 70) 
//			return = 'P';
//		 else 
//			result = 'F';	
//	}
}
