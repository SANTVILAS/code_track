package Array2D_pwc;

public class ForEach_loop_In_2DArray_Test3{
	
	public static void main(String[] args) {
		int a[] = {1,2,3};
		
		/*
		 * for(int x : a) { System.out.print(x+" "); }
		 */
		
		
		int b[][] = {{1,2,3},{4,5,6}};
		
		for (int[] x : b) {
			for(int elem : x) {
				System.out.print(elem+" ");
			}
		}
		
	}

}
