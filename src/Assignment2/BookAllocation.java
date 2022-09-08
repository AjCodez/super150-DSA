import java.util.*;
public class BookAllocation {
	private static boolean isPossible(long [] arr, long t, long s){
		long r = 0;
		int c = 1;
		int i = 0;
		while(i<arr.length){
			if (r+arr[i]<=t){
				r+=arr[i];
				i++;
			}
			else {
				c++;
				r=0;
			}
			
			if(c>s) return false;
		}
		return true;
	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			long s = sc.nextLong();
			long [] arr = new long[n];
			long l = 0;
			long r = 0;
			for(int i=0;i<n;i++){
				arr[i] = sc.nextLong();
				r+=arr[i];
			}
			long ans=0;
			while (l<=r){
				long m = (l+r)/2;
				if(isPossible(arr, m, s)){
					ans = m;
					r=m-1;
				}
				else l=m+1;
			}
			System.out.println(ans);
		}
    }
}