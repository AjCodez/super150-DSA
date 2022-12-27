import java.util.*;
public class Main {
    private static boolean func(String w, char[][] c, int i, int j, int l){
        if(l>=w.length()) return true;
          
        if(i<0 || j<0 || i>=c.length || j>= c[0].length || c[i][j]!=w.charAt(l)) return false;
        int[][] g1 = {{0,1},{0,-1}, {1,0},{-1,0}};
        char t = c[i][j];
        c[i][j]='*';
        for(int[] g2:g1){
            if(func(w,c,i+g2[0],j+g2[1],l+1)){
                c[i][j]=t;
                return true;
            }
        }
        c[i][j]=t;
        return false;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        char [][] c = new char[m][n];
        for(int i=0;i<m;i++){
            String t=sc.next();
            for(int j=0;j<n;j++){
                c[i][j]=t.charAt(j);
            }
        }
        String [] words = new String[w];
        for(int i=0;i<w;i++){
            words[i]=sc.next();
            // System.out.println(words[i]);
        }
        Arrays.sort(words);
        for(int i=0;i<w;i++){
            int l=0;
            for(int j=0;j<m;j++){
                for(int k=0;k<n;k++){
                    if(words[i].charAt(0)==c[j][k]){
                        char t = c[j][k];
                        int[][] g1 = {{0,1},{0,-1}, {1,0},{-1,0}};
                        c[j][k]='*';
                        for(int[] g2:g1){
                            if(func(words[i],c,j+g2[0],k+g2[1],1)){
                                System.out.print(words[i]+" ");
                                l=1;
                                break;
                            }
                        }
                        c[j][k]=t;
                    }
                    if(l==1) break;
                    
                }
                if(l==1) break;
            }
            
        }
    }
}
