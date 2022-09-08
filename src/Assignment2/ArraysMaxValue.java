import java.util.*;
public class ArraysMaxValue {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = Long.MIN_VALUE;
		for (int i=0;i<n;i++){
			m=Math.max(m,sc.nextLong());
		}
		System.out.println(m);
    }
}