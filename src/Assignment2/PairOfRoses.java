import java.util.*;
public class PairOfRoses {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int te = sc.nextInt();
		while(te-- > 0){
			int n =sc.nextInt();
			long [] ar = new long[n];
			for (int i=0;i<n;i++){
				ar[i] = sc.nextLong();
			}
			long t = sc.nextLong();
			Arrays.sort(ar);
			long one=0;
			long two=0;
			int l=0;
			int r=n-1;
			while (l<r){
				if(ar[l]+ar[r]==t){
					one =ar[l];
					two =ar[r];
					r--;
				}
				else if (ar[l]+ar[r]>t){
					r--;
				}
				else{
					l++;
				}
			}
			System.out.println("Deepak should buy roses whose prices are "+one+" and "+two+".");
		}
    }
}