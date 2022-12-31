import java.util.*;
public class Main {

	public static void main(String args[])  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		Stack<int[]> st = new Stack<>();
		for(int i =0;i<n;i++){
			int a = sc.nextInt();
			int b=1;
			while(!st.isEmpty() && st.peek()[0]<a) b+=st.pop()[1];
			st.push(new int[]{a,b});
			System.out.print(b+" ");
		}
		
		System.out.print("END");
	}

}

