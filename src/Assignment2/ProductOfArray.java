import java.util.*;
public class ProductOfArray {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr =new long[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextLong();
        }
        long [] left = new long [n];
        long [] right = new long [n];
        long l=1;
        long r=1;
        for(int i=0;i<n;i++){
            left[i]=l;
            l*=arr[i];
            right[n-1-i]=r;
            r*=arr[n-1-i];
        }
        for (int i=0;i<n;i++){
            arr[i]=left[i]*right[i];
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}