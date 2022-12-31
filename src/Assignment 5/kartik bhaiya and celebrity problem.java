import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] mat  = new int[n][n];
		int c=-1;
		boolean celeb=true;
		
		for(int i=0;i<n;i++){
			boolean f=true;
			for(int j=0;j<n;j++){
				mat[i][j]=sc.nextInt();
				if(mat[i][j]==1) f=false;
			}
			if(f){
				// System.out.println(i);
				if(c==-1) c=i;
				else{ 
					// System.out.println("No Celebrity");
				celeb=false;
        }
			} 
		}
		if(celeb && c!=-1){
		for(int i=0;i<n;i++){
			if(i!=c) {
				if(mat[i][c]!=1){
					// System.out.println("No Celebrity");
					celeb=false;
				}
			}
		}
		}
		if(celeb && c!=-1) System.out.println(c);
		else System.out.println("No Celebrity");
    }
}
