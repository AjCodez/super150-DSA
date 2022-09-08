import java.util.*;
public class AlexGoesShopping {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		long [] item = new long[n];
		for (int i=0;i<n;i++){
			item[i]=sc.nextLong();
		}
		int q = sc.nextInt();
		for (int i=0;i<q;i++){
			long m=sc.nextLong();
			int p=sc.nextInt();
			int c=0;
			for(int j=0;j<n;j++){
				if (m%item[j]==0) c++;
				if (c==p) break;
			}
			if (c>=p)
			System.out.println("Yes");
			else
			System.out.println("No");
		}
    }
}