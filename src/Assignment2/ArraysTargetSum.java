import java.util.*;
public class ArraysTargetSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] ar=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int t = sc.nextInt();
        Arrays.sort(ar);
        int l = 0;
            int r= n-1;
            while (l<r){
                if (ar[l]+ar[r]==t){
                    System.out.println(ar[l]+" and "+ar[r]);
                    r--;
                }
                else if (ar[l]+ar[r]>t){
                    r--;
                }
                else{
                    l++;
                }
            }
        
    }
}