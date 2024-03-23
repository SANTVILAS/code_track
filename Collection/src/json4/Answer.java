package json4;

import java.util.List;

public class Answer {
    private Integer answerNumber;
	private List<String> answerList;
	
	public Answer(Integer answerNumber, List<String> answerList) {
		super();
		this.answerNumber = answerNumber;
		this.answerList = answerList;
	}

	@Override
	public String toString() {
		return "[answerNumber=" + answerNumber + ", answerList=" + answerList + "]";
	}
	

	
	
}
