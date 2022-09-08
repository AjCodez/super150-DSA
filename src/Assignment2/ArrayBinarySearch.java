import java.util.*;
public class ArrayBinarySearch {
	private static int bs(int [] arr, int f){
		int l=0;
		int r=arr.length-1;
		while (l<=r){
			int mid = (l+r)/2;
			// System.out.println(arr[mid]);
			if (arr[mid]==f)
				return mid;
			else if (f<arr[mid])
				r=mid-1;
			else
				l=mid+1;
		}
		return -1;
	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int f=sc.nextInt();
		System.out.println(bs(arr,f));
    }
}