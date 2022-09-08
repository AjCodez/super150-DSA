import java.util.*;
public class MaxSumPath {
    public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0){
			int n=sc.nextInt();
			int m=sc.nextInt();
			int [] arr1 = new int[n];
			int [] arr2 = new int[m];
			for (int i=0;i<n;i++){
				arr1[i]=sc.nextInt();
			}
			for (int i=0;i<m;i++){
				arr2[i]=sc.nextInt();
			}

			int s1=0;
			int s2=0;
			int s=0;
			int i=0;
			int j=0;
			while (i<n || j<m){
				if (i<n && j<m){
					if (arr1[i]<arr2[j]){
						s1+=arr1[i];
						i++;
					}
					else if(arr1[i]>arr2[j]){
						s2+=arr2[j];
						j++;
					}
					else{
						s+=Math.max(s1,s2)+arr1[i];
						s1=0;
						s2=0;
						i++;
						j++;
					}
				}
				else if(i<n){
					s1+=arr1[i];
					i++;
				}
				else{
					s2+=arr2[j];
					j++;
				}
			}
			s+=Math.max(s1,s2);
			System.out.println(s);
		}
    }
}