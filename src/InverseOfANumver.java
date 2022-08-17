
import java.util.*;
import java.lang.*;
public class InverseOfANumver {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t=1;
        int s=0;
        while (n>0){
            int temp=n%10;
            s+=t*Math.pow(10,temp-1);
            n=n/10;
            t++;
        }
        System.out.println(s);
    }
}