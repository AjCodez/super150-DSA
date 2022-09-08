import java.util.*;
public class HelpRamu {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0){
			int c1 = sc.nextInt();
			int c2 = sc.nextInt();
			int c3 = sc.nextInt();
			int c4 = sc.nextInt();
			int n = sc.nextInt();
			int m = sc.nextInt();
			int s1=0;
			int s2=0;
			for (int i=0;i<n;i++){
				s1+=Math.min(sc.nextInt()*c1,c2);
			}
			s1=Math.min(s1,c3);
			for (int i=0;i<m;i++){
				s2+=Math.min(sc.nextInt()*c1,c2);
			}
			s2=Math.min(s2,c3);
			int s3=s1+s2;
			int s4=Math.min(s3,c4);
			System.out.println(s4);
		}
    }
}