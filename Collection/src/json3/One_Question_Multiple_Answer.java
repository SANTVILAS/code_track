package json3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class One_Question_Multiple_Answer {

//	1.What is java
//	Ans java is programming
//	2.java is robust
//	3.java is oop language
//	
	public static void main(String[] args) {

		String question = "What is java";

		Map<String, List<String>> map = new HashMap();

		List<String> answerList = new ArrayList<String>();
		answerList.add("java is programming");
		answerList.add("java is robust");
		answerList.add("java is oop language");
		map.put(question, answerList);
		

		question = "who is santvilas";
		answerList = new ArrayList<String>();
		answerList.add("Son");
		answerList.add("Married");
		answerList.add("Beta");

		map.put(question, answerList);
		System.out.println(map);
	}
}
//{who is santvilas=[Son, Married, Beta], What is java=[java is programming, java is robust, java is oop language]}