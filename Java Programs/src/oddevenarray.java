import java.util.Iterator;

public class oddevenarray {
	public static void main(String[] args) {
		int[] num= {2,7,14,9,10,51};
		System.out.println("num and their types");
		for (int i : num) {
			if (i%2==0) {
				System.out.println(i+" is even");
			} else {
				System.out.println(i+" is odd");
			}
		}
	}
}
