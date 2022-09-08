import java.util.*;
public class MaxCircularSum {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while (t-- > 0){
			int n =sc.nextInt();
			long [] ar = new long[n];
			for (int i = 0;i<n;i++){
				ar[i] = sc.nextLong();
			}
			long ms=Long.MIN_VALUE;
			long s=0;
			int i=0;
			while (i!=n){
				int j=0;
				if (i!=n-1)
				j=i+1;
				s=ar[i];
				if (s<0) {
					ms=Math.max(s,ms);
					i++;
					continue;
				}
				while (j!=i){
					s+=ar[j];
					if (ms<s){
						ms=s;
					}
					if (s<0){
						s=0;
					}
					if(j==n-1)
					j=0;
					else
					j++;
				}
				i++;
			}
			System.out.println(ms);
		}
    }
}