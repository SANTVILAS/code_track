package json4;

public class Question {

	private int questionNo;
	
	private String question;



	

	public Question(int questionNo, String question) {
		super();
		this.questionNo = questionNo;
		this.question = question;
	}



	@Override
	public String toString() {
		return "[questionNo=" + questionNo + ", question=" + question + "]";
	}



	public int getQuestionNo() {
		return questionNo;
	}



	public void setQuestionNo(int questionNo) {
		this.questionNo = questionNo;
	}



	public String getQuestion() {
		return question;
	}



	public void setQuestion(String question) {
		this.question = question;
	}



	
	
	
	
}
