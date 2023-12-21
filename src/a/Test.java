package a;

public class Test {
	
	public char test (Subject subject, Score score) {		
		GradeEvaluation evaluation;
		if(subject.mandatory == true) {
			evaluation = new MajorEvaluation();
		} else {
			evaluation = new PassEvaluation();
		}				
		return evaluation.GradeEva(subject, score);
	}
}
