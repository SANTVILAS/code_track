package coding_ninja;

public class Test04_Reverse_Each_Word {

	public static String reverseWord(String str) {
		// abc def ghi
		// cba fed ihg
		String ans = "";
		int currentWordStart = 0;
		String reverse = "";
		int i=0;
		for (i = 0; i < str.length(); i++) {
			// split via space
			if (str.charAt(i) == ' ') {
				int currentWordEnd = i - 1;
				for (int j = currentWordEnd; j >= currentWordStart; j--) {
					reverse = reverse + str.charAt(i);
				}
			}

			// add to final string
			ans = ans + reverse + " ";
			currentWordStart = i + 1;

		}

		int currentWordEnd = i - 1;
		for (int j = currentWordEnd; j >= currentWordStart; j--) {
			reverse = reverse + str.charAt(i);
		}

		// add to final string
		ans = ans + reverse;
		return ans;
	}

	public static void main(String[] args) {
		String str = "abc def ghi jkl";
		String ans1=reverseWord(str);
		System.out.println(ans1);

	}

}
