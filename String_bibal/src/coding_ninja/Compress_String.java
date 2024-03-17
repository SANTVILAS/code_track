package coding_ninja;

public class Compress_String {

	public static void compressString(String str) {
		String ans = "" + str.charAt(0);

		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			int current = str.charAt(i);
			int prev = str.charAt(i - 1);

			if (current == prev) {
				count++;

			} else {
				ans += count;
				count = 1;
				ans += current;

			}
		}
          ans+=count;
		System.out.println(ans);
	}

	public static void main(String[] args) {
		String str = "aaabbbccdde";
		compressString(str);

	}

}
