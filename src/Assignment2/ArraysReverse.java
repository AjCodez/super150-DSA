import java.util.*;
public class ArraysReverse {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long [] ar = new long[n];
		for(int i=0;i<n;i++){
			ar[n-1-i]=sc.nextLong();
		}
		for(int i=0;i<n;i++){
			System.out.println(ar[i]);
		}
    }
}