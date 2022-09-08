import java.util.*;
public class DivisibleSubarrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			long [] ar = new long[n];
			for(int i=0;i<n;i++){
				ar[i]=sc.nextLong();
			}
			long sum=0;
			int [] freq = new int[n];
			freq[0]=1;
			for(int i= 0; i<n;i++){
				sum+=ar[i];
				int ind = (int)(sum%n);
				if(ind<0) ind+=n;
				freq[ind] += 1;
			}
			long ans = 0;
			for(int i=0;i<freq.length;i++){
				if(freq[i]>=2){
					long p = freq[i];
					ans += (p*(p-1))/2;
				}
			}
			System.out.println(ans);
			

		}
    }
}
