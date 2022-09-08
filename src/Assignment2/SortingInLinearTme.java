import java.util.*;
public class SortingInLinearTme {
    public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int z=0;
		int o=0;
		int t=0;
		int [] arr = new int[n];
		for (int i=0;i<n;i++){
			int y=sc.nextInt();
			if (y==0)
				z++;
			else if (y==1)
				o++;
			else
				t++;
		}
		int i=0;
		while (z!=0){
			arr[i]=0;
			z--;
			i++;
		}
		while (o!=0){
			arr[i]=1;
			o--;
			i++;
		}
		while (t!=0){
			arr[i]=2;
			t--;
			i++;
		}
		for(int j=0;j<n;j++){
			System.out.print(arr[j]+" ");
		}
    }
}