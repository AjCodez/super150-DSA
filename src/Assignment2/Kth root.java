import java.util.*;
public class Kth_root {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long n=Long.parseLong(sc.next());
            long k=Long.parseLong(sc.next());
            long f1=1;
            long f2=n;
            long f;
            while (true){
                if (Math.pow(f1,k)>n){
                    f=f1-1;
                    break;
                }
                if (Math.pow(f2,k)<=n){
                    f=f2;
                    break;
                }
                f1++;
                f2--;
            }
            System.out.println(f);
        }
    }
}
