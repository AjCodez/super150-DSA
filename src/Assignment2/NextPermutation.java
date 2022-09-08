import java.util.*;
public class NextPermutation {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			int[] arr = new int [n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			nextPermutation(arr);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

	private static void nextPermutation(int[] arr) {
		int a = 0;
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				a = i;
				break;
			}
		}
		int b = 0;
		for (int i = arr.length - 1; i > a; i--) {
			if (arr[i] > arr[a]) {
				b = i;
				break;
			}
		}
		if (a == 0 && b == 0) {
			rangeReverse(arr, 0, arr.length - 1);
			return;
		}
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		rangeReverse(arr, a + 1, arr.length - 1);
	}

	private static void rangeReverse(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}