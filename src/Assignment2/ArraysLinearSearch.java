
import java.util.*;
public class ArraysLinearSearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int f= sc.nextInt();
		int flag=0;
		for(int i=0;i<n;i++){
			if (arr[i]==f){
				flag++;
				System.out.println(i);
				break;
			}
		}
		if (flag==0)
			System.out.println(-1);
    }
}
