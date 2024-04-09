package risebird;

import java.util.stream.IntStream;

public class Test {
	public static void main(String[] args) {
       int sum=IntStream.range(0, 100).filter(i->i%2==0).sum();
       System.out.println(sum);
	}
}
