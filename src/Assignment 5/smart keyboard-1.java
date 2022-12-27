import java.util.*;
public class Main {
	static String table[] = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
	private static void func(String s, String d, int n){
		if(n>=d.length()){
			System.out.println(s);
			return;
		}
		String w = table[d.charAt(n)-'0'];
		for(int i=0;i<w.length();i++){
			func(s+w.charAt(i),d,n+1);
		}
	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		func("",s,0);
    }
}
