import java.util.*;
@SuppressWarnings("unchecked")
public class Main {
    public static void main(String args[]) {
        Stack<Integer> s1 = new Stack();
        Stack<Integer> s2 = new Stack();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			s1.push(i);
		}
		while(!s1.empty()) s2.push(s1.pop());
		while(!s2.empty()) System.out.print(s2.pop()+" ");
    }
}
