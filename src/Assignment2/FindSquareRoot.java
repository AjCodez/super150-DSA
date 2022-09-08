import java.util.*;
public class FindSquareRoot {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long l=0;
        long r=n/2+1;
        long ans=0;
        while (l<=r){
                long mid = (l+r)/2;
                if(mid*mid==n){
                        ans=mid;
                        break;
                }
                else if (mid*mid<n){
                        l=mid+1;
                        ans=l-1;
                }
                else{
                        r=mid-1;
                        ans=l-1;
                }
        }
        System.out.println(ans);
    }
}