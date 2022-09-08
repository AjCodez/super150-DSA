import java.util.*;
public class PaintersPartition {

	private static boolean isPossible(long [] arr, long mid, int k){
		long s = arr[0];

		for(int i = 1; i<arr.length; i++){
			if(s+arr[i]<=mid){
				s+=arr[i];
			}
			else{
				k--;
				s=arr[i];
			}
			if (arr[i]>mid) return false;
		}
		return k>=1;

	}

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		long [] arr = new long[n];
		long l = 0;
		long r = 0;
		for (int i=0;i<n;i++){
			arr[i]=sc.nextLong();
			r+=arr[i];
			l=Math.min(l,arr[i]);
		}
		long ans = 0;
		while (l<=r){
			long mid = (l+r)/2;
			if (isPossible(arr, mid, k)){
				ans = mid;
				r=mid-1;
			}
			else{
				l=mid+1;
			}
		}
		System.out.println(ans);
		
    }

}