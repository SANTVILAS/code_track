package json4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test_Question_Answer {
	public static void main(String[] args) {
    
		Map<Question, Answer> map = new HashMap<Question, Answer>();
		
		Question que1 = new Question(1, "What is java");
		
		
         List<String> answerList = new ArrayList<String>();
         answerList.add("java is good");
         answerList.add("java is robust");
         answerList.add("java supports inheritance");
		 Answer ans1 = new Answer(1,answerList);
		
		 map.put(que1, ans1);
		 System.out.println(map);
		 
		
		
	}
}
