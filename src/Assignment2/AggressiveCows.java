import java.util.*;
public class AggressiveCows {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long c = sc.nextLong();
		long [] arr = new long[n];
		for(int i=0;i<n;i++){
			arr[i]= sc.nextLong();
		}
		Arrays.sort(arr);
		long l=arr[0];
		long r=arr[n-1]-arr[0];
		long ans=0;
		while (l<=r){
			long mid = (l+r)/2;
			if (isPossible(arr,mid,c)){
				ans=mid;
				l=mid+1;
			}
			else r=mid-1;
		}
		System.out.println(ans);

    }
	private static boolean isPossible(long [] arr, long d, long c ){
		int count = 1;
		long ini = arr[0];
		for(int i=1;i<arr.length;i++){
			if (arr[i]-ini>=d){
				count++;
				ini=arr[i];
			}
			if (c==count) return true;
		}
		return false;
	}
}