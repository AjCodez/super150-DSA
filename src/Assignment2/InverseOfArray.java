import java.util.*;
public class InverseOfArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] ar1 = new int[n];
		int [] ar2 = new int[n];
		for(int i=0;i<n;i++){
			int t = sc.nextInt();
			ar1[i]=t;
			ar2[i]=t;
		}
		for(int i=0;i<n;i++){
			ar2[ar1[i]]=i;
		}
		for(int i=0;i<n;i++){
			System.out.print(ar2[i]+" ");
		}
    }
}
