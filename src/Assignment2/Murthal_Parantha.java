import java.util.*;
public class MurthalParantha {

	private static boolean isPossible(long [] arr, long t, long m){
		long s=0;
		long p=1;
		int i=0;
		while(i<arr.length){
			if ((s+arr[i]*p)<=m){
				s+=arr[i]*p;
				p++;
				t--;
			}
			if (s+arr[i]*p>m){
				s=0;
				p=1;
				i++;
			}
			if(t==0) return true;

		}
		return false;
	}

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		int n = sc.nextInt();
		long [] arr = new long[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		long l = 0;
		long r = 0;
		long ans = 0;
		long i = 1;
		while (i<=t){
			r+=i*arr[0];
			i++;
		}
		// System.out.println(r);
		while (l<=r){
			long m = (l+r)/2;
			if(isPossible(arr, t, m)){
				ans = m;
				r=m-1;
			}
			else{
				l=m+1;
			}
		}
		System.out.println(ans);
    }
}